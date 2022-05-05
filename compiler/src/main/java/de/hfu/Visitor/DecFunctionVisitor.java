package de.hfu.Visitor;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.DecFunctionContext;
import de.hfu.grammar.WhileParser.ExprContext;
import de.hfu.grammar.WhileParser.ProgContext;
import de.hfu.model.DecFunction;

public class DecFunctionVisitor extends WhileBaseVisitor<DecFunction> {

    @Override
    public DecFunction visitDecFunction(DecFunctionContext ctx) {
        System.out.println("Dec: " + ctx.ID());
        return super.visitDecFunction(ctx);
    }

}
