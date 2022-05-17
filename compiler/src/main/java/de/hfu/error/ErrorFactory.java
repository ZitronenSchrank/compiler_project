package de.hfu.error;

import java.util.ArrayList;

import org.antlr.v4.runtime.Token;

public final class ErrorFactory {
    public static SemanticError semanticError(String message, Token token) {
        return new SemanticError(message, token);
    }

    public static SemanticError formattedSemanticError(String message, Token... token) {
        ArrayList<String> list = new ArrayList<>();
        for (Token t : token) {
            list.add(t.getText());
        }
        return new SemanticError(String.format(message, list), token[0]);
    }

    public static SemanticError formattedSemanticError(String message, Token token) {
        return new SemanticError(String.format(message, token.getText()), token);
    }
}
