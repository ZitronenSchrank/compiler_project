package de.hfu.model.expression;

public class VarExpression extends Expression {
    String varName;

    public VarExpression(String varName) {
        this.varName = varName;
    }

    public String getVarName() {
        return varName;
    }
}
