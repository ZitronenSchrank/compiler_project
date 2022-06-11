package de.hfu.error;

import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class SyntaxError {
    private Recognizer<?, ?> recognizer;
    private Object offendingSymbol;
    private int line;
    private int charPositionInLine;
    private String msg;
    private RecognitionException e;

    public SyntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
            String msg, RecognitionException e) {
        this.recognizer = recognizer;
        this.offendingSymbol = offendingSymbol;
        this.line = line;
        this.charPositionInLine = charPositionInLine;
        this.msg = msg;
        this.e = e;
    }

    public Recognizer<?, ?> getRecognizer() {
        return recognizer;
    }

    public Object getOffendingSymbol() {
        return offendingSymbol;
    }

    public int getLine() {
        return line;
    }

    public int getCharPositionInLine() {
        return charPositionInLine;
    }

    public String getMsg() {
        return msg;
    }

    public RecognitionException getE() {
        return e;
    }

}
