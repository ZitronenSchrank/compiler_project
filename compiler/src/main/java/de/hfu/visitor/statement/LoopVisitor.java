package de.hfu.visitor.statement;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.LoopContext;

import de.hfu.model.Program;
import de.hfu.model.statement.Loop;
import de.hfu.util.AvailableVariables;

public class LoopVisitor extends WhileBaseVisitor<Loop> {

    AvailableVariables availableVariables;
    Program program;

    public LoopVisitor(AvailableVariables availableVariables, Program program) {
        this.program = program;
        this.availableVariables = availableVariables;
    }

    @Override
    public Loop visitLoop(LoopContext ctx) {
        // TODO Auto-generated method stub
        return super.visitLoop(ctx);
    }
}