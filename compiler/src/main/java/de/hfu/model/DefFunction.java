package de.hfu.model;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import de.hfu.model.statement.Statement;

public class DefFunction {
    private Token tokenId;
    private List<String> parameterNames;
    private List<Statement> statements;

    public DefFunction(Token tokeId, List<String> parameterNames) {
        this.tokenId = tokeId;
        this.parameterNames = parameterNames;
        this.statements = new ArrayList<>();
    }

    public DefFunction(Token tokeId, List<String> parameterNames, List<Statement> statements) {
        this.tokenId = tokeId;
        this.parameterNames = parameterNames;
        this.statements = statements;
    }

    public void setStatementList(List<Statement> statements) {
        this.statements = statements;
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
        return !statements.isEmpty();
    }

    public Token getToken() {
        return tokenId;
    }
}
