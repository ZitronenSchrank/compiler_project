package de.hfu.visitor;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.DefFunctionContext;
import de.hfu.model.DecFunction;
import de.hfu.model.DefFunction;
import de.hfu.model.Program;

public class DefFunctionVisitor extends WhileBaseVisitor<Void> {

    private Program program;

    public DefFunctionVisitor(Program program) {
        this.program = program;
    }

    @Override
    public Void visitDefFunction(DefFunctionContext ctx) {
        String nodeId = ctx.ID().getText();
        DecFunction dec = program.getDecFunctions().get(nodeId);

        // No Define Token?
        if (ctx.DEFINE() == null) {

            if (dec == null) {
                // TODO: Error: 'Def' Or Forward Decleration Missing
                System.err.println("'Def' Or Forward Decleration Missing, Line:" + ctx.ID().getSymbol().getLine());
            } else {
                dec.setImplemented(true);
                program.addDefFunction(nodeId, new DefFunction(nodeId));
            }

        } else {
            if (dec != null) {
                // TODO: Error: Function already defined
                System.err.println("Function Already Defined");
            } else {
                program.addDecFunction(nodeId, new DecFunction(nodeId, true));
                program.addDefFunction(nodeId, new DefFunction(nodeId));
            }
        }

        return null;
    }
}
