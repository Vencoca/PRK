package prk.calculator;

import java.util.Objects;

public class CalculatorVisitor extends VBGBaseVisitor<Double>{
    @Override
    public Double visitRoot(VBGParser.RootContext ctx){
        return visit(ctx.ex);
    }

    @Override
    public  Double visitExpr(VBGParser.ExprContext ctx){
        //Zpracování operací
        if (ctx.operator != null) { //Pokud je přítomen operátor tj. má se sčítat,násobit etc.
            String operator = ctx.operator.getText(); //Operátor pro vyhodnocení operace
            Double L = visit(ctx.left); //Projde levou část podstromu
            Double R = visit(ctx.right); //Projde pravou část podstromu
            //System.out.println(L + operator + R);
            switch(operator) {
                case "*":
                    return L*R;
                case "+":
                    return  L+R;
                case "^":
                    return Math.pow(L, R);
                case ">":
                    if (L>R) {
                        return 1.0;
                    } else {
                        return 0.0;
                    }
                case "<":
                    if (L<R) {
                        return 1.0;
                    } else {
                        return 0.0;
                    }
                case "==":
                    if (Objects.equals(L, R)) {
                        return 1.0;
                    } else {
                        return 0.0;
                    }
                case "<=":
                    if (L<=R) {
                        return 1.0;
                    } else {
                        return 0.0;
                    }
                case ">=":
                    if (L>=R) {
                        return 1.0;
                    } else {
                        return 0.0;
                    }
                default:
                    //Neměla by nastat protože nebude vyhodnocen znak jako operátor
                    throw new UnsupportedOperationException("Calculator does not support " + operator);
            }
        }
        //Zpracování čísel
        if(ctx.TYPE() != null) {
            String val = ctx.TYPE().getText(); //Hodnota jako string
            Convertor convertor = new Convertor(); //Převody na double
            val = val.replace("_",""); //Odstraní oddělovače
            val = val.replace(",","."); //Převede desetinou čárku na tečku
            if (val.startsWith("h") || val.startsWith("-h")){ //Převod hexa na double
                return convertor.hexToDouble(val);
            } else if (val.startsWith("b") || val.startsWith("-b")){ //Převod binary na double
                return convertor.binaryToDouble(val);
            } else if (val.startsWith("\"")){ //Převod stringu na double
                return convertor.stringToDouble(val);
            }
            return switch (val) {
                //Převod booleanu a desetiných čárek
                case ".", ",", "Ne", "NE", "ne", "nE" -> 0.0;
                //Převod kladné boolean hodnoty
                case "jO", "jo", "JO", "Jo" -> 1.0;
                //Zbytek tj - int a float
                default -> Double.valueOf(val);
            };
        }
        //Zpracování závorek - pokud se nachází levá  (přítomnost pravé už chytí parser)
        if(ctx.LEFTBRACKET() != null){
            return visit(ctx.ex); //Pouze pokračuje níž do stromu a nic jiného nedělá
        }
        //Pokud nebyla nalezena podmínka výše - kalkulačka neví co dělat se vstupem a vyhodí chybu
        throw new UnsupportedOperationException("Fatal Error - Invalid context, dont know what to do with input");
    }
}
