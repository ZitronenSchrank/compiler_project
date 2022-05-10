package de.hfu.visitor.statement;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.DefVarContext;

import de.hfu.model.Program;
import de.hfu.model.statement.DefVar;
import de.hfu.util.AvailableVariables;

public class DefVarVisitor extends WhileBaseVisitor<DefVar> {

    AvailableVariables availableVariables;
    Program program;

    public DefVarVisitor(AvailableVariables availableVariables, Program program) {
        this.program = program;
        this.availableVariables = availableVariables;
    }

    @Override
    public DefVar visitDefVar(DefVarContext ctx) {
        // TODO Auto-generated method stub
        return super.visitDefVar(ctx);
    }
}