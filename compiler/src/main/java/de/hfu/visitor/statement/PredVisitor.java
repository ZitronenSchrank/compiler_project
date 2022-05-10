package de.hfu.visitor.statement;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.PredContext;
import de.hfu.model.Program;
import de.hfu.model.statement.Pred;
import de.hfu.util.AvailableVariables;

public class PredVisitor extends WhileBaseVisitor<Pred> {

    AvailableVariables availableVariables;
    Program program;

    public PredVisitor(AvailableVariables availableVariables, Program program) {
        this.program = program;
        this.availableVariables = availableVariables;
    }

    @Override
    public Pred visitPred(PredContext ctx) {
        // TODO Auto-generated method stub
        return super.visitPred(ctx);
    }
}