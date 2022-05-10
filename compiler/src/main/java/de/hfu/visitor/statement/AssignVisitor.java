package de.hfu.visitor.statement;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.AssignContext;
import de.hfu.model.Program;
import de.hfu.model.statement.Assign;
import de.hfu.util.AvailableVariables;

public class AssignVisitor extends WhileBaseVisitor<Assign> {

    AvailableVariables availableVariables;
    Program program;

    public AssignVisitor(AvailableVariables availableVariables, Program program) {
        this.program = program;
        this.availableVariables = availableVariables;
    }

    @Override
    public Assign visitAssign(AssignContext ctx) {
        // TODO Auto-generated method stub
        return super.visitAssign(ctx);
    }
}