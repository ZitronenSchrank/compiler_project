package de.hfu.error;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ErrorListener extends BaseErrorListener {

    List<SyntaxError> errorList = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
            String msg, RecognitionException e) {
        super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
        errorList.add(new SyntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e));
    }

    public List<SyntaxError> getErrorList() {
        return errorList;
    }

    public int getErrorCount() {
        return errorList.size();
    }

}
