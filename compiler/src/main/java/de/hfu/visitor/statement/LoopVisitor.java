package de.hfu.visitor.statement;

import java.util.List;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.LoopContext;

import de.hfu.model.Program;
import de.hfu.model.statement.Loop;

public class LoopVisitor extends WhileBaseVisitor<Loop> {

    List<String> availableVariables;
    Program program;

    public LoopVisitor(List<String> availableVariables, Program program) {
        this.program = program;
        this.availableVariables = availableVariables;
    }

    @Override
    public Loop visitLoop(LoopContext ctx) {
        // TODO Auto-generated method stub
        return super.visitLoop(ctx);
    }
}