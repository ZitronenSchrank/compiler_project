package de.hfu.visitor.expression;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import de.hfu.error.ErrorFactory;
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
    String targetVar;

    public ExpressionVisitor(AvailableVariables availableVariables, Program program, String targetVar) {
        this.availableVariables = availableVariables;
        this.program = program;
        this.targetVar = targetVar;
    }

    @Override
    public Expression visitExpr(ExprContext ctx) {
        ParseTree child = ctx.children.get(0);
        if (child instanceof ReadContext) {
            return child.accept(new ReadVisitor(availableVariables, program, targetVar));
        } else if (child instanceof CallFunctionContext) {
            return child.accept(new CallFunctionVisitor(availableVariables, program));
        } else if (ctx.ID() != null) {
            return parseVarExpression(ctx);
        } else if (ctx.NUM() != null) {
            return new NumExpression(ctx.NUM().getText());
        }
        return null;
    }

    private VarExpression parseVarExpression(ExprContext context) {
        Token varName = context.ID().getSymbol();
        if (availableVariables.contains(varName.getText())) {
            return new VarExpression(varName.getText());
        } else {
            program.addError(ErrorFactory.formattedSemanticError(ErrorMessages.VAR_NOT_DEF, varName));
            return null;
        }
    }
}
