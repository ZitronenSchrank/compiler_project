package de.hfu.visitor.statement;

import java.util.List;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.PredContext;
import de.hfu.model.Program;
import de.hfu.model.statement.Pred;

public class PredVisitor extends WhileBaseVisitor<Pred> {

    List<String> availableVariables;
    Program program;

    public PredVisitor(List<String> availableVariables, Program program) {
        this.program = program;
        this.availableVariables = availableVariables;
    }

    @Override
    public Pred visitPred(PredContext ctx) {
        // TODO Auto-generated method stub
        return super.visitPred(ctx);
    }
}