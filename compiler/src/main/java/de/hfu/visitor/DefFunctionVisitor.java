package de.hfu.visitor;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

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
        List<TerminalNode> functionParameters = ctx.defParameters().ID();
        DefFunction def = program.getDefFunctions().get(nodeId.getText());

        // Is Forward Decleration Used?
        if (ctx.DEFINE() == null) {
            // Yes
            // Then the function must be already inside the map
            if (def == null) {
                // It is not inside the map
                program.addError(
                        new SemanticError("Keyword 'Def' Or Forward Decleration Missing", ctx.ID().getSymbol()));
            } else {
                // It is in the map
                if (functionParameters.size() == def.getParameterCount()) {
                    if (def.isImplemented()) {
                        program.addError(
                                new SemanticError("Function Is Already Implemented", ctx.ID().getSymbol()));
                    } else {
                        parseStatements(ctx);
                        def.setImplemented(true);
                    }
                } else {
                    program.addError(
                            new SemanticError(
                                    "Function Declaration And Function Definition Have An Unequal Number Of Parameters",
                                    ctx.ID().getSymbol()));
                }
            }
        } else {
            // No
            // Then the function must not be inside the map
            if (def != null) {
                // It is inside the map
                program.addError(
                        new SemanticError("Function Already Defined", ctx.ID().getSymbol()));
            } else {
                ArrayList<String> parameters = new ArrayList<>();
                for (var parameter : functionParameters) {
                    parameters.add(parameter.getText());
                }
                parseStatements(ctx);
                program.addDefFunction(nodeId.getText(), new DefFunction(nodeId, parameters, true));
            }
        }
        return null;
    }

    private void parseStatements(DefFunctionContext ctx) {

    }
}
