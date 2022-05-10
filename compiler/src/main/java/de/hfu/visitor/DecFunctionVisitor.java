package de.hfu.visitor;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import de.hfu.error.SemanticError;
import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.DecFunctionContext;
import de.hfu.model.DefFunction;
import de.hfu.model.Program;
import de.hfu.util.SemanticUtils;

public class DecFunctionVisitor extends WhileBaseVisitor<DefFunction> {

    private Program program;

    public DecFunctionVisitor(Program program) {
        this.program = program;
    }

    @Override
    public DefFunction visitDecFunction(DecFunctionContext ctx) {
        Token nodeId = ctx.ID().getSymbol();
        DefFunction def = program.getDefFunctions().get(nodeId.getText());
        List<TerminalNode> functionParameters = ctx.defParameters().ID();

        if (def != null) {
            program.addError(
                    new SemanticError("Function Already Defined or Too Many Forward Declerations", nodeId));
        } else {
            if (SemanticUtils.isEachParameterNameUnique(functionParameters)) {
                ArrayList<String> parameters = new ArrayList<>();
                for (var parameter : functionParameters) {
                    parameters.add(parameter.getText());
                }
                return new DefFunction(nodeId, parameters);
            } else {
                program.addError(
                        new SemanticError("Each Parameter Needs An Unique Name", ctx.ID().getSymbol()));
            }

        }

        return null;
    }

}
