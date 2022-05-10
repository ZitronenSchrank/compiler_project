package de.hfu.visitor.statement;

import java.util.List;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.SuccContext;
import de.hfu.model.Program;
import de.hfu.model.statement.Succ;

public class SuccVisitor extends WhileBaseVisitor<Succ> {

    List<String> availableVariables;
    Program program;

    public SuccVisitor(List<String> availableVariables, Program program) {
        this.program = program;
        this.availableVariables = availableVariables;
    }

    @Override
    public Succ visitSucc(SuccContext ctx) {
        // TODO Auto-generated method stub
        return super.visitSucc(ctx);
    }
}
