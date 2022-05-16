package de.hfu.model.expression;

import java.util.List;

public class CallFunction extends Expression {
    private String functionName;
    private List<Expression> callParameters;

    public CallFunction(String functionName, List<Expression> callParameters) {
        this.functionName = functionName;
        this.callParameters = callParameters;
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<Expression> getCallParameters() {
        return callParameters;
    }

}
