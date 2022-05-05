package de.hfu.visitor;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.DecFunctionContext;
import de.hfu.grammar.WhileParser.DefFunctionContext;
import de.hfu.grammar.WhileParser.ProgContext;
import de.hfu.grammar.WhileParser.StatementContext;
import de.hfu.model.Program;
import de.hfu.visitor.statement.StatementVisitor;

public class ProgramVisitor extends WhileBaseVisitor<Program> {

    @Override
    public Program visitProg(ProgContext ctx) {
        System.out.println("Programm");
        Program program = new Program();

        for (var context : ctx.children) {
            if (context instanceof DecFunctionContext) {
                context.accept(new DecFunctionVisitor(program));
            }
            if (context instanceof DefFunctionContext) {
                context.accept(new DefFunctionVisitor(program));
            }
            if (context instanceof StatementContext) {
                context.accept(new StatementVisitor());
            }
        }

        for (var element : program.getDecFunctions().values()) {
            if (!element.isImplemented()) {
                // TODO: Error: Function Not Implemented
                System.err.println("Function " + element.getId() + " not implemented!");
            }
        }

        return program;
    }

}
