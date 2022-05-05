package de.hfu.Visitor;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.DefFunctionContext;
import de.hfu.model.DefFunction;

public class DefFunctionVisitor extends WhileBaseVisitor<DefFunction> {

    @Override
    public DefFunction visitDefFunction(DefFunctionContext ctx) {
        System.out.println("Def: " + ctx.ID());
        return super.visitDefFunction(ctx);
    }
}
