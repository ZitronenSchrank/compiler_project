package de.hfu.visitor.statement;

import java.util.List;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.AssignContext;
import de.hfu.model.Program;
import de.hfu.model.statement.Assign;

public class AssignVisitor extends WhileBaseVisitor<Assign> {

    List<String> availableVariables;
    Program program;

    public AssignVisitor(List<String> availableVariables, Program program) {
        this.program = program;
        this.availableVariables = availableVariables;
    }

    @Override
    public Assign visitAssign(AssignContext ctx) {
        // TODO Auto-generated method stub
        return super.visitAssign(ctx);
    }
}