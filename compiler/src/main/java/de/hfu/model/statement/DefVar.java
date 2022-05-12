package de.hfu.model.statement;

import de.hfu.model.expression.Expression;

public class DefVar extends Statement {
    String varName;
    Expression initValue;

    public DefVar(String varName, Expression initValue) {
        this.varName = varName;
        this.initValue = initValue;
    }

    public String getVarName() {
        return varName;
    }

    public Expression getInitValue() {
        return initValue;
    }

}