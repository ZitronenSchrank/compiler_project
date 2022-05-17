package de.hfu.visitor;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import de.hfu.error.ErrorFactory;
import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.CallParametersContext;
import de.hfu.model.Program;
import de.hfu.model.expression.Expression;
import de.hfu.model.expression.NumExpression;
import de.hfu.model.expression.VarExpression;
import de.hfu.util.AvailableVariables;
import de.hfu.util.ErrorMessages;

public class CallParameterVisitor extends WhileBaseVisitor<List<Expression>> {

    AvailableVariables availableVariables;
    Program program;

    public CallParameterVisitor(AvailableVariables availableVariables, Program program) {
        this.availableVariables = availableVariables;
        this.program = program;
    }

    @Override
    public List<Expression> visitCallParameters(CallParametersContext ctx) {
        List<Expression> parameters = new ArrayList<>();
        var listOfNumNodes = ctx.NUM();
        var listOfIdNodes = ctx.ID();
        for (var child : ctx.children) {
            if (child instanceof TerminalNode) {
                TerminalNode token = (TerminalNode) child;

                if (listOfIdNodes.contains(token)) {
                    if (availableVariables.contains(child.getText())) {
                        parameters.add(new VarExpression(child.getText()));
                    } else {
                        program.addError(
                                ErrorFactory.formattedSemanticError(ErrorMessages.VAR_NOT_DEF, token.getSymbol()));
                        return null;
                    }
                } else if (listOfNumNodes.contains(child)) {
                    parameters.add(new NumExpression(token.getText()));
                }
            }
        }

        return parameters;
    }
}
