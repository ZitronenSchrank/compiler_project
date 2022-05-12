package de.hfu.model.expression;

public class NumExpression extends Expression {
    String numString;

    NumExpression(String numString) {
        this.numString = numString;
    }

    public String getNumString() {
        return numString;
    }
}
