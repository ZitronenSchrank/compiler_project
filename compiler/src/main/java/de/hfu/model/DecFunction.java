package de.hfu.model;

import org.antlr.v4.runtime.Token;

public class DecFunction {
    private String id;
    private boolean isImplemented;
    private Token token;

    public DecFunction(Token idToken) {
        this.id = idToken.getText();
        this.isImplemented = false;
        this.token = idToken;
    }

    public DecFunction(String id, boolean isImplemented) {
        this.id = id;
        this.isImplemented = isImplemented;
    }

    public void setImplemented(boolean isImplemented) {
        this.isImplemented = isImplemented;
    }

    public String getId() {
        return id;
    }

    public boolean isImplemented() {
        return isImplemented;
    }

    public Token getToken() {
        return token;
    }

}
