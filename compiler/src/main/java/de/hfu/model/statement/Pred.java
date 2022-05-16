package de.hfu.model.statement;

public class Pred extends Statement {
    private String varName;

    public Pred(String varName) {
        this.varName = varName;
    }

    public String getVarName() {
        return varName;
    }
}
