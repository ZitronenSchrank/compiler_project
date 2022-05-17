package de.hfu.visitor.statement;

import org.antlr.v4.runtime.Token;

import de.hfu.error.ErrorFactory;
import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.PredContext;
import de.hfu.model.Program;
import de.hfu.model.statement.Pred;
import de.hfu.util.AvailableVariables;
import de.hfu.util.ErrorMessages;

public class PredVisitor extends WhileBaseVisitor<Pred> {

    AvailableVariables availableVariables;
    Program program;

    public PredVisitor(AvailableVariables availableVariables, Program program) {
        this.program = program;
        this.availableVariables = availableVariables;
    }

    @Override
    public Pred visitPred(PredContext ctx) {
        Token varName = ctx.ID().getSymbol();
        if (availableVariables.contains(varName.getText())) {
            if (!availableVariables.forbiddenVariablesContains(varName.getText())) {
                return new Pred(varName.getText());
            } else {
                program.addError(ErrorFactory.formattedSemanticError(ErrorMessages.FORBIDDEN_VAR_WRITE, varName));
            }
        } else {
            program.addError(ErrorFactory.formattedSemanticError(ErrorMessages.VAR_NOT_DEF, varName));
        }
        return null;
    }
}