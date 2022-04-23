package prk.calculator;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calculator {

    private Boolean skipLine = false;

    public static void main(String[] args) {
        if (0 < args.length) {
            String filename = args[0];
            try {
                File myObj = new File(filename);
                Scanner myReader = new Scanner(myObj);
                Calculator calculator = new Calculator();
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    Double equals = calculator.calculate(data);
                    if (calculator.getSkipLine()){
                        calculator.setSkipLine(false);
                    } else {
                        System.out.println(data + " = " + equals);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("Error: No input file!");
        }

        /*
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate("00"));
         */
    }


    private Boolean getSkipLine(){
        return this.skipLine;
    }

    private void setSkipLine(Boolean value){
        this.skipLine = value;
    }

    private Double calculate(String source) {
        CodePointCharStream input = CharStreams.fromString(source);
        return compile(input);
    }

    private Double compile(CharStream source) {
        VBGErrorListener errorListener = new VBGErrorListener();
        VBGLexer lexer = new VBGLexer(source);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        if (tokenStream.getNumberOfOnChannelTokens() == 1){ //Pokud výstup z lexeru je nic (EOF) -> nejde do parseru
            this.skipLine = true;
            return null;
        } else {
            VBGParser parser = new VBGParser(tokenStream);
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);
            ParseTree tree = parser.root();
            CalculatorVisitor visitor = new CalculatorVisitor();
            if (errorListener.isError()) {
                errorListener.resetError();
                return null;
            } else {
                return visitor.visit(tree);
            }
        }
    }
}
