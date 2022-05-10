package de.hfu.visitor.statement;

import java.util.List;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.WhlContext;
import de.hfu.model.Program;
import de.hfu.model.statement.While;

public class WhlVisitor extends WhileBaseVisitor<While> {

    List<String> availableVariables;
    Program program;

    public WhlVisitor(List<String> availableVariables, Program program) {
        this.program = program;
        this.availableVariables = availableVariables;
    }

    @Override
    public While visitWhl(WhlContext ctx) {
        // TODO Auto-generated method stub
        return super.visitWhl(ctx);
    }
}