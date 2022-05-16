package de.hfu.model.statement;

import java.util.List;

public class Write extends Statement {
    List<String> varNames;

    public Write(List<String> varNames) {
        this.varNames = varNames;
    }

    public List<String> getVarNames() {
        return varNames;
    }
}
