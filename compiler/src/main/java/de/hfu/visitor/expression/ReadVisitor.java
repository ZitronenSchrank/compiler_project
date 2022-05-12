package de.hfu.visitor.expression;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.ReadContext;
import de.hfu.model.expression.Read;

public class ReadVisitor extends WhileBaseVisitor<Read> {
    @Override
    public Read visitRead(ReadContext ctx) {
        // TODO Auto-generated method stub
        return super.visitRead(ctx);
    }

}
