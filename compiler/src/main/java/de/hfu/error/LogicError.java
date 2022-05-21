package de.hfu.error;

import org.antlr.v4.runtime.Token;

public class LogicError extends CompilerError {

    Token token;

    public LogicError(String message, Token token) {
        super(message);
        this.token = token;
    }

    public LogicError(String message) {
        super(message);
    }

    @Override
    public String toString() {
        if (token == null) {
            return "Logic Error - " + message;
        } else {
            return "Logic Error on " + token.getLine() + ":" + token.getCharPositionInLine() + " - " + message;
        }
    }

}
