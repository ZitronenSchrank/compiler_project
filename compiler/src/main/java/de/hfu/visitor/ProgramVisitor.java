package de.hfu.visitor;

import de.hfu.error.SemanticError;
import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.DecFunctionContext;
import de.hfu.grammar.WhileParser.DefFunctionContext;
import de.hfu.grammar.WhileParser.ProgContext;
import de.hfu.grammar.WhileParser.StatementContext;
import de.hfu.model.DefFunction;
import de.hfu.model.Program;
import de.hfu.model.statement.Statement;
import de.hfu.util.AvailableVariables;
import de.hfu.visitor.statement.StatementVisitor;

public class ProgramVisitor extends WhileBaseVisitor<Program> {

    private Program program;

    public ProgramVisitor() {
        program = new Program();
    }

    @Override
    public Program visitProg(ProgContext ctx) {
        System.out.println("Programm");

        AvailableVariables availableVariables = new AvailableVariables();
        DecFunctionVisitor decFunctionVisitor = new DecFunctionVisitor(program);
        DefFunctionVisitor defFunctionVisitor = new DefFunctionVisitor(program);
        StatementVisitor statementVisitor = new StatementVisitor(availableVariables, program);

        for (var context : ctx.children) {
            if (context instanceof DecFunctionContext) {
                addFunctionToProgram(context.accept(decFunctionVisitor));
            } else if (context instanceof DefFunctionContext) {
                addFunctionToProgram(context.accept(defFunctionVisitor));
            } else if (context instanceof StatementContext) {
                addStatementToProgram(context.accept(statementVisitor));
            }
        }

        for (var element : program.getDefFunctions().values()) {
            if (!element.isImplemented()) {
                program.addError(
                        new SemanticError("Function " + element.getId() + " not implemented!", element.getToken()));
            }
        }

        return program;
    }

    private void addFunctionToProgram(DefFunction newFunction) {
        // Do not add erros
        if (newFunction != null) {
            program.addDefFunction(newFunction.getId(), newFunction);
        }
    }

    private void addStatementToProgram(Statement newStatement) {
        // Do not add erros
        if (newStatement != null) {
            program.addStatement(newStatement);
        }
    }

}
