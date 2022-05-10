package de.hfu.visitor;

import org.antlr.v4.runtime.Token;

import de.hfu.error.SemanticError;
import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.DefFunctionContext;
import de.hfu.model.DefFunction;
import de.hfu.model.Program;

public class DefFunctionVisitor extends WhileBaseVisitor<Void> {

    private Program program;

    public DefFunctionVisitor(Program program) {
        this.program = program;
    }

    @Override
    public Void visitDefFunction(DefFunctionContext ctx) {
        Token nodeId = ctx.ID().getSymbol();
        DefFunction def = program.getDefFunctions().get(nodeId.getText());

        // No Define Token?
        if (ctx.DEFINE() == null) {

            if (def == null) {
                program.addError(
                        new SemanticError("'Def' Or Forward Decleration Missing", ctx.ID().getSymbol()));
            } else {
                if (def.isImplemented()) {
                    program.addError(
                            new SemanticError("Function Already Implemented", ctx.ID().getSymbol()));
                } else {
                    def.setImplemented(true);
                }
            }

        } else {
            if (def != null) {
                program.addError(
                        new SemanticError("Function Already Defined", ctx.ID().getSymbol()));
            } else {
                program.addDefFunction(nodeId.getText(), new DefFunction(nodeId, true));
            }
        }

        return null;
    }
}
