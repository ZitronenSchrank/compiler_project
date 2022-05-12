package de.hfu.model.statement;

import de.hfu.model.expression.Expression;

public class Assign extends Statement {
    String targetVarName;
    Expression expression;

    public Assign(String targetVarName, Expression expression) {
        this.targetVarName = targetVarName;
        this.expression = expression;
    }

    public String getTargetVarName() {
        return targetVarName;
    }

    public Expression getExpression() {
        return expression;
    }

}
