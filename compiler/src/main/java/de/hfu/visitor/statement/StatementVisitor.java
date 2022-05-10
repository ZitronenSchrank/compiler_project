package de.hfu.visitor.statement;

import java.util.List;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.AssignContext;
import de.hfu.grammar.WhileParser.DefVarContext;
import de.hfu.grammar.WhileParser.LoopContext;
import de.hfu.grammar.WhileParser.PredContext;
import de.hfu.grammar.WhileParser.StatementContext;
import de.hfu.grammar.WhileParser.SuccContext;
import de.hfu.grammar.WhileParser.WhlContext;
import de.hfu.grammar.WhileParser.WriteContext;
import de.hfu.model.Program;
import de.hfu.model.statement.Statement;

public class StatementVisitor extends WhileBaseVisitor<Statement> {

    List<String> availableVariables;
    Program program;

    public StatementVisitor(List<String> availableVariables, Program program) {
        this.program = program;
        this.availableVariables = availableVariables;
    }

    @Override
    public Statement visitStatement(StatementContext ctx) {
        Statement returnValue = null;

        for (var context : ctx.children) {
            if (context instanceof SuccContext) {
                returnValue = context.accept(new SuccVisitor(availableVariables, program));
            } else if (context instanceof PredContext) {
                returnValue = context.accept(new PredVisitor(availableVariables, program));
            } else if (context instanceof WhlContext) {
                returnValue = context.accept(new WhlVisitor(availableVariables, program));
            } else if (context instanceof LoopContext) {
                returnValue = context.accept(new LoopVisitor(availableVariables, program));
            } else if (context instanceof DefVarContext) {
                returnValue = context.accept(new DefVarVisitor(availableVariables, program));
            } else if (context instanceof WriteContext) {
                returnValue = context.accept(new WriteVisitor(availableVariables, program));
            } else if (context instanceof AssignContext) {
                returnValue = context.accept(new AssignVisitor(availableVariables, program));
            }
        }

        return returnValue;
    }
}
