package de.hfu.visitor;

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
        String nodeId = ctx.ID().getText();
        DecFunction dec = program.getDecFunctions().get(nodeId);

        if (dec != null) {
            // TODO: Error: Function Already Defined Or Too Many Forward Declerations
            System.err.println("Function Already Defined or Too Many Forward Declerations");
        } else {
            program.addDecFunction(nodeId, new DecFunction(nodeId));
        }

        return null;
    }

}
