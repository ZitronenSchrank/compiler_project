package de.hfu.error;

import org.antlr.v4.runtime.Token;

public class SemanticError extends CompilerError {

    Token token;

    public SemanticError(String message, Token token) {
        super(message);
        this.token = token;
    }

    public int getLineNumber() {
        return token.getLine();
    }

    public int getLineColumn() {
        return token.getCharPositionInLine();
    }

    @Override
    public String toString() {
        return "Semantic Error on " + getLineNumber() + ":" + getLineColumn() + " - " + message;
    }

}
