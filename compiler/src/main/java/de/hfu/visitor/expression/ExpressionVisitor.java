package de.hfu.visitor.expression;

import org.antlr.v4.runtime.tree.ParseTree;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.CallFunctionContext;
import de.hfu.grammar.WhileParser.ExprContext;
import de.hfu.grammar.WhileParser.ReadContext;
import de.hfu.model.Program;
import de.hfu.model.expression.Expression;
import de.hfu.util.AvailableVariables;

public class ExpressionVisitor extends WhileBaseVisitor<Expression> {

    AvailableVariables availableVariables;
    Program program;

    @Override
    public Expression visitExpr(ExprContext ctx) {
        ParseTree child = ctx.children.get(0);
        if (child instanceof ReadContext) {
            System.out.println("Read");
        } else if (child instanceof CallFunctionContext) {
            System.out.println("Call");
        } else if (ctx.ID() != null) {
            System.out.println("ID");
        } else if (ctx.NUM() != null) {
            System.out.println("NUM");
        }
        return null;
    }
}
