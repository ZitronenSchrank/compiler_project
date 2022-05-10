package de.hfu.visitor.statement;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.SuccContext;
import de.hfu.model.Program;
import de.hfu.model.statement.Succ;
import de.hfu.util.AvailableVariables;

public class SuccVisitor extends WhileBaseVisitor<Succ> {

    AvailableVariables availableVariables;
    Program program;

    public SuccVisitor(AvailableVariables availableVariables, Program program) {
        this.program = program;
        this.availableVariables = availableVariables;
    }

    @Override
    public Succ visitSucc(SuccContext ctx) {
        // TODO Auto-generated method stub
        return super.visitSucc(ctx);
    }
}
