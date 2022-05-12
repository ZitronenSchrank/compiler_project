package de.hfu.visitor.expression;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import de.hfu.error.SemanticError;
import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.CallFunctionContext;
import de.hfu.grammar.WhileParser.ExprContext;
import de.hfu.grammar.WhileParser.ReadContext;
import de.hfu.model.Program;
import de.hfu.model.expression.Expression;
import de.hfu.model.expression.NumExpression;
import de.hfu.model.expression.VarExpression;
import de.hfu.util.AvailableVariables;
import de.hfu.util.ErrorMessages;

public class ExpressionVisitor extends WhileBaseVisitor<Expression> {

    AvailableVariables availableVariables;
    Program program;

    public ExpressionVisitor(AvailableVariables availableVariables, Program program) {
        this.availableVariables = availableVariables;
        this.program = program;
    }

    @Override
    public Expression visitExpr(ExprContext ctx) {
        ParseTree child = ctx.children.get(0);
        if (child instanceof ReadContext) {
            System.out.println("Read");
        } else if (child instanceof CallFunctionContext) {
            System.out.println("Call");
        } else if (ctx.ID() != null) {
            Token varName = ctx.ID().getSymbol();
            if (availableVariables.contains(varName.getText())) {
                return new VarExpression(varName.getText());
            } else {
                program.addError(
                        new SemanticError(String.format(ErrorMessages.VAR_NOT_DEF, varName.getText()), varName));
            }

        } else if (ctx.NUM() != null) {
            return new NumExpression(ctx.NUM().getText());
        }
        return null;
    }
}
