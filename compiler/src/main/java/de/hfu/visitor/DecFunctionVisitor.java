package de.hfu.visitor;

import java.util.ArrayList;

import org.antlr.v4.runtime.Token;

import de.hfu.error.SemanticError;
import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.DecFunctionContext;
import de.hfu.model.DefFunction;
import de.hfu.model.Program;

public class DecFunctionVisitor extends WhileBaseVisitor<Void> {

    private Program program;

    public DecFunctionVisitor(Program program) {
        this.program = program;
    }

    @Override
    public Void visitDecFunction(DecFunctionContext ctx) {
        Token nodeId = ctx.ID().getSymbol();
        DefFunction def = program.getDefFunctions().get(nodeId.getText());

        if (def != null) {
            program.addError(
                    new SemanticError("Function Already Defined or Too Many Forward Declerations", nodeId));
        } else {
            ArrayList<String> parameters = new ArrayList<>();

            for (var parameter : ctx.defParameters().ID()) {
                parameters.add(parameter.getText());
            }

            program.addDefFunction(nodeId.getText(), new DefFunction(nodeId, parameters));
        }

        return null;
    }

}
