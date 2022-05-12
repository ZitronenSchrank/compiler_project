package de.hfu.visitor.statement;

import org.antlr.v4.runtime.Token;

import de.hfu.error.SemanticError;
import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.AssignContext;
import de.hfu.model.Program;
import de.hfu.model.expression.Expression;
import de.hfu.model.statement.Assign;
import de.hfu.util.AvailableVariables;
import de.hfu.util.ErrorMessages;
import de.hfu.visitor.expression.ExpressionVisitor;

public class AssignVisitor extends WhileBaseVisitor<Assign> {

    AvailableVariables availableVariables;
    Program program;

    public AssignVisitor(AvailableVariables availableVariables, Program program) {
        this.program = program;
        this.availableVariables = availableVariables;
    }

    @Override
    public Assign visitAssign(AssignContext ctx) {
        Token varName = ctx.ID().getSymbol();
        if (availableVariables.forbiddenVariablesContains(varName.getText())) {
            program.addError(
                    new SemanticError(String.format(ErrorMessages.FORBIDDEN_VAR_WRITE, varName.getText()), varName));
        } else {
            System.out.println("Assing");
            Expression expr = ctx.expr().accept(new ExpressionVisitor());
            if (expr == null) {
                return null;
            } else {
                return new Assign(varName.getText(), expr);
            }
        }
        return null;
    }
}