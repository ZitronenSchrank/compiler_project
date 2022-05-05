package de.hfu.Visitor;

import de.hfu.Visitor.statement.StatementVisitor;
import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.DecFunctionContext;
import de.hfu.grammar.WhileParser.DefFunctionContext;
import de.hfu.grammar.WhileParser.ProgContext;
import de.hfu.grammar.WhileParser.StatementContext;
import de.hfu.model.Program;

public class ProgramVisitor extends WhileBaseVisitor<Program> {

    @Override
    public Program visitProg(ProgContext ctx) {
        System.out.println("Programm");
        Program program = new Program();
        for (DecFunctionContext context : ctx.decFunction()) {
            context.accept(new DecFunctionVisitor());
        }
        for (DefFunctionContext context : ctx.defFunction()) {
            context.accept(new DefFunctionVisitor());
        }
        for (StatementContext context : ctx.statement()) {
            context.accept(new StatementVisitor());
        }

        return program;
    }

}
