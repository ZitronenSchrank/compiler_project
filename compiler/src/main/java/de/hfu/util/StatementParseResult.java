package de.hfu.util;

import java.util.List;

import de.hfu.model.statement.Statement;

public class StatementParseResult {
    List<Statement> statements;
    AvailableVariables availableVariables;

    public StatementParseResult(List<Statement> statements, AvailableVariables availableVariables) {
        this.statements = statements;
        this.availableVariables = availableVariables;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public AvailableVariables getAvailableVariables() {
        return availableVariables;
    }
}
