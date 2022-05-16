package de.hfu.visitor.statement;

import org.antlr.v4.runtime.Token;

import de.hfu.error.SemanticError;
import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.SuccContext;
import de.hfu.model.Program;
import de.hfu.model.statement.Succ;
import de.hfu.util.AvailableVariables;

public class SuccVisitor extends WhileBaseVisitor<Succ> {

    AvailableVariables availableVariables;
    Program program;

    public SuccVisitor(AvailableVariables availableVariables, Program program) {
        this.program = program;
        this.availableVariables = availableVariables;
    }

    @Override
    public Succ visitSucc(SuccContext ctx) {
        Token varName = ctx.ID().getSymbol();

        if (availableVariables.contains(varName.getText())) {
            if (!availableVariables.forbiddenVariablesContains(varName.getText())) {
                return new Succ(varName.getText());
            } else {
                program.addError(new SemanticError("message", varName));
            }
        } else {
            program.addError(new SemanticError("message", varName));
        }

        return null;
    }
}
