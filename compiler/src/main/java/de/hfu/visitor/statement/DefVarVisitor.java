package de.hfu.visitor.statement;

import org.antlr.v4.runtime.Token;

import de.hfu.error.SemanticError;
import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.DefVarContext;

import de.hfu.model.Program;
import de.hfu.model.expression.Expression;
import de.hfu.model.statement.DefVar;
import de.hfu.util.AvailableVariables;
import de.hfu.util.ErrorMessages;
import de.hfu.visitor.expression.ExpressionVisitor;

public class DefVarVisitor extends WhileBaseVisitor<DefVar> {

    AvailableVariables availableVariables;
    Program program;

    public DefVarVisitor(AvailableVariables availableVariables, Program program) {
        this.program = program;
        this.availableVariables = availableVariables;
    }

    @Override
    public DefVar visitDefVar(DefVarContext ctx) {
        Token varName = ctx.ID().getSymbol();

        if (availableVariables.contains(varName.getText())) {
            program.addError(
                    new SemanticError(String.format(ErrorMessages.VAR_ALREADY_DEF, varName.getText()), varName));
        } else {

            Expression expr = ctx.expr().accept(new ExpressionVisitor(availableVariables, program));
            if (expr == null) {
                return null;
            } else {

                availableVariables.addAvailableVariable(varName.getText());
                return new DefVar(varName.getText(), expr);

            }

        }
        return null;
    }
}