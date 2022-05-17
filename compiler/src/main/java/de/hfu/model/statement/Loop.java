package de.hfu.model.statement;

import java.util.List;

public class Loop extends Statement {
    private String varName;
    private List<Statement> statements;

    public Loop(String varName, List<Statement> statements) {
        this.varName = varName;
        this.statements = statements;
    }

    public String getVarName() {
        return varName;
    }

    public List<Statement> getStatements() {
        return statements;
    }
}
