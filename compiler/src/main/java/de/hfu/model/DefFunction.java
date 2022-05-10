package de.hfu.model;

import org.antlr.v4.runtime.Token;

public class DefFunction {
    Token tokenId;
    private boolean isImplemented;

    public DefFunction(Token tokeId) {
        this.tokenId = tokeId;
        this.isImplemented = false;
    }

    public DefFunction(Token tokeId, boolean isImplemented) {
        this.tokenId = tokeId;
        this.isImplemented = isImplemented;
    }

    public void setImplemented(boolean isImplemented) {
        this.isImplemented = isImplemented;
    }

    public String getId() {
        return tokenId.getText();
    }

    public boolean isImplemented() {
        return isImplemented;
    }

    public Token getToken() {
        return tokenId;
    }
}
