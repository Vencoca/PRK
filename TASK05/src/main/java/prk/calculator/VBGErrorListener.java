package prk.calculator;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class VBGErrorListener extends BaseErrorListener {
    private boolean error;
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
        System.err.println(recognizer.getClass().getSimpleName() + " error: " + msg); //Vypíše erro ve tvaru CoNašloError error: ChybovéHlášení
        this.error = true; //Nastaví error flag na true
    }

    public void resetError() {
        this.error = false;
    }

    public boolean isError() {
        return this.error;
    }

}
