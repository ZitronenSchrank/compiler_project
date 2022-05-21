package de.hfu.model.expression;

public class Read extends Expression {
    private String targetVar;

    public Read(String targetVar) {
        this.targetVar = targetVar;
    }

    public String getTargetVar() {
        return targetVar;
    }
}
