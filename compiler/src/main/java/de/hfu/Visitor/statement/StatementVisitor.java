package de.hfu.Visitor.statement;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.StatementContext;
import de.hfu.model.statement.Statement;

public class StatementVisitor extends WhileBaseVisitor<Statement> {
    @Override
    public Statement visitStatement(StatementContext ctx) {
        System.out.println("Statement");
        return null;
    }
}
