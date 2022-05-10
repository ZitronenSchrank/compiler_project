package de.hfu.visitor.statement;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.WhlContext;
import de.hfu.model.Program;
import de.hfu.model.statement.While;
import de.hfu.util.AvailableVariables;

public class WhlVisitor extends WhileBaseVisitor<While> {

    AvailableVariables availableVariables;
    Program program;

    public WhlVisitor(AvailableVariables availableVariables, Program program) {
        this.program = program;
        this.availableVariables = availableVariables;
    }

    @Override
    public While visitWhl(WhlContext ctx) {
        // TODO Auto-generated method stub
        return super.visitWhl(ctx);
    }
}