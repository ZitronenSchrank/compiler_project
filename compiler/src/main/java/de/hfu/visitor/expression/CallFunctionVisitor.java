package de.hfu.visitor.expression;

import java.util.List;

import org.antlr.v4.runtime.Token;

import de.hfu.error.SemanticError;
import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.CallFunctionContext;
import de.hfu.grammar.WhileParser.CallParametersContext;
import de.hfu.model.DefFunction;
import de.hfu.model.Program;
import de.hfu.model.expression.CallFunction;
import de.hfu.model.expression.Expression;
import de.hfu.util.AvailableVariables;
import de.hfu.util.ErrorMessages;
import de.hfu.visitor.CallParameterVisitor;

public class CallFunctionVisitor extends WhileBaseVisitor<CallFunction> {

    AvailableVariables availableVariables;
    Program program;

    public CallFunctionVisitor(AvailableVariables availableVariables, Program program) {
        this.availableVariables = availableVariables;
        this.program = program;
    }

    @Override
    public CallFunction visitCallFunction(CallFunctionContext ctx) {
        Token funId = ctx.ID().getSymbol();
        CallParametersContext parameters = ctx.callParameters();
        DefFunction fun = program.getDefFunctions().get(funId.getText());

        // Is Function defined/Declared?
        if (fun == null) {
            program.addError(new SemanticError(String.format(ErrorMessages.FUN_NOT_DEF, funId.getText()), funId));
            return null;
        } else {
            List<Expression> parameterExpressions = parameters
                    .accept(new CallParameterVisitor(availableVariables, program));
            if (parameterExpressions != null) {
                if (parameterExpressions.size() == fun.getParameterCount()) {

                } else {
                    program.addError(new SemanticError(
                            String.format(ErrorMessages.FUN_CALL_NOT_ENOUGH_PARAMS, funId.getText()), funId));
                    return null;
                }
            } else {
                return null;
            }
        }

        return null;
    }
}
