package de.hfu.Visitor;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.DecFunctionContext;
import de.hfu.grammar.WhileParser.ProgContext;
import de.hfu.model.Program;

public class ProgramVisitor extends WhileBaseVisitor<Program> {

    @Override
    public Program visitProg(ProgContext ctx) {
        System.out.println("Programm");
        Program program = new Program();

        return super.visitProg(ctx);
    }

}
