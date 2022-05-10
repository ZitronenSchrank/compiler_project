package de.hfu.visitor;

import org.antlr.v4.runtime.Token;

import de.hfu.error.SemanticError;
import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.DecFunctionContext;
import de.hfu.model.DecFunction;
import de.hfu.model.Program;

public class DecFunctionVisitor extends WhileBaseVisitor<Void> {

    private Program program;

    public DecFunctionVisitor(Program program) {
        this.program = program;
    }

    @Override
    public Void visitDecFunction(DecFunctionContext ctx) {
        Token nodeId = ctx.ID().getSymbol();
        DecFunction dec = program.getDecFunctions().get(nodeId.getText());

        if (dec != null) {
            program.addError(
                    new SemanticError("Function Already Defined or Too Many Forward Declerations", nodeId));
        } else {
            program.addDecFunction(nodeId.getText(), new DecFunction(nodeId));
        }

        return null;
    }

}
