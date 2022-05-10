package de.hfu.visitor.statement;

import java.util.List;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.WriteContext;
import de.hfu.model.Program;
import de.hfu.model.statement.Write;

public class WriteVisitor extends WhileBaseVisitor<Write> {

    List<String> availableVariables;
    Program program;

    public WriteVisitor(List<String> availableVariables, Program program) {
        this.program = program;
        this.availableVariables = availableVariables;
    }

    @Override
    public Write visitWrite(WriteContext ctx) {
        // TODO Auto-generated method stub
        return super.visitWrite(ctx);
    }
}