package de.hfu.visitor.expression;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.CallFunctionContext;
import de.hfu.model.expression.CallFunction;

public class CallFunctionVisitor extends WhileBaseVisitor<CallFunction> {
    @Override
    public CallFunction visitCallFunction(CallFunctionContext ctx) {
        // TODO Auto-generated method stub
        return super.visitCallFunction(ctx);
    }
}
