package de.hfu.visitor.statement;

import java.util.List;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.DefVarContext;

import de.hfu.model.Program;
import de.hfu.model.statement.DefVar;

public class DefVarVisitor extends WhileBaseVisitor<DefVar> {

    List<String> availableVariables;
    Program program;

    public DefVarVisitor(List<String> availableVariables, Program program) {
        this.program = program;
        this.availableVariables = availableVariables;
    }

    @Override
    public DefVar visitDefVar(DefVarContext ctx) {
        // TODO Auto-generated method stub
        return super.visitDefVar(ctx);
    }
}