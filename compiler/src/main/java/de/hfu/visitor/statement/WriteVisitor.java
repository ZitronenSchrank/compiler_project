package de.hfu.visitor.statement;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.WriteContext;
import de.hfu.model.Program;
import de.hfu.model.statement.Write;
import de.hfu.util.AvailableVariables;

public class WriteVisitor extends WhileBaseVisitor<Write> {

    AvailableVariables availableVariables;
    Program program;

    public WriteVisitor(AvailableVariables availableVariables, Program program) {
        this.program = program;
        this.availableVariables = availableVariables;
    }

    @Override
    public Write visitWrite(WriteContext ctx) {
        // TODO Auto-generated method stub
        return super.visitWrite(ctx);
    }
}