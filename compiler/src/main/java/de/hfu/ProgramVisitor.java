package de.hfu;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.ProgContext;
import de.hfu.model.Program;

public class ProgramVisitor extends WhileBaseVisitor<Program> {

    @Override
    public Program visitProg(ProgContext ctx) {
        // TODO Auto-generated method stub
        return super.visitProg(ctx);
    }

}
