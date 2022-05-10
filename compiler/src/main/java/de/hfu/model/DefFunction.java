package de.hfu.model;

import java.util.List;

import org.antlr.v4.runtime.Token;

public class DefFunction {
    private Token tokenId;
    private boolean isImplemented;
    private List<String> parameterNames;

    public DefFunction(Token tokeId, List<String> parameterNames) {
        this.tokenId = tokeId;
        this.isImplemented = false;
        this.parameterNames = parameterNames;
    }

    public DefFunction(Token tokeId, List<String> parameterNames, boolean isImplemented) {
        this.tokenId = tokeId;
        this.isImplemented = isImplemented;
        this.parameterNames = parameterNames;
    }

    public void setImplemented(boolean isImplemented) {
        this.isImplemented = isImplemented;
    }

    public List<String> getParameterNames() {
        return this.parameterNames;
    }

    public int getParameterCount() {
        return this.parameterNames.size();
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
