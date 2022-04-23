package prk.calculator;

public class Convertor {
    public Double hexToDouble (String input){
        input = input.replace("h", "");
        int decimal=Integer.parseInt(input,16);
        return Double.valueOf(decimal);
    }

    public Double binaryToDouble(String input){
        input = input.replace("b", "");
        int decimal=Integer.parseInt(input,2);
        return Double.valueOf(decimal);
    }

    public Double stringToDouble(String input){
        input = input.replace("\"", "");
        char[] chars = input.toCharArray();
        int suma = 0;
        for (char ch: chars) {
            suma += (int) ch;
        }
        return Double.valueOf(suma);
    }
}
