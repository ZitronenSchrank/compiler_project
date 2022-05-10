package de.hfu.visitor.statement;

import java.util.List;
import java.util.Map;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.StatementContext;
import de.hfu.model.DefFunction;
import de.hfu.model.statement.Statement;

public class StatementVisitor extends WhileBaseVisitor<Statement> {

    List<String> availableVariables;
    Map<String, DefFunction> availableFunctions;

    public StatementVisitor(List<String> availableVariables, Map<String, DefFunction> availableFunctions) {
        this.availableFunctions = availableFunctions;
        this.availableVariables = availableVariables;
    }

    @Override
    public Statement visitStatement(StatementContext ctx) {
        System.out.println("Statement");
        return null;
    }
}
