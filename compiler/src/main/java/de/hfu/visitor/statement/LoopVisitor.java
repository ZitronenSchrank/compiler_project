package de.hfu.visitor.statement;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import de.hfu.error.ErrorFactory;
import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.LoopContext;

import de.hfu.model.Program;
import de.hfu.model.statement.Loop;
import de.hfu.model.statement.Statement;
import de.hfu.util.AvailableVariables;
import de.hfu.util.ErrorMessages;

public class LoopVisitor extends WhileBaseVisitor<Loop> {

    AvailableVariables availableVariables;
    Program program;

    public LoopVisitor(AvailableVariables availableVariables, Program program) {
        this.program = program;
        this.availableVariables = availableVariables;
    }

    @Override
    public Loop visitLoop(LoopContext ctx) {
        Token varName = ctx.ID().getSymbol();
        if (availableVariables.contains(varName.getText())) {
            if (!availableVariables.readOnlyVariablesContains(varName.getText())) {
                List<Statement> statements = new ArrayList<>();
                availableVariables.pushNewContext();
                availableVariables.addReadOnlyVariable(varName.getText());

                for (var statement : ctx.statement()) {
                    Statement stmt = statement.accept(new StatementVisitor(availableVariables, program));
                    if (stmt != null) {
                        statements.add(stmt);
                    }
                }

                availableVariables.pop();
                return new Loop(varName.getText(), statements);
            } else {
                program.addError(ErrorFactory.formattedSemanticError(ErrorMessages.FORBIDDEN_VAR_WRITE, varName));
            }
        } else {
            program.addError(ErrorFactory.formattedSemanticError(ErrorMessages.VAR_NOT_DEF, varName));
        }
        return null;
    }
}