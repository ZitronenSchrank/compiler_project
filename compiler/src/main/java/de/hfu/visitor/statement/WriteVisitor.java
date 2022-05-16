package de.hfu.visitor.statement;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import de.hfu.error.ErrorFactory;
import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.WriteContext;
import de.hfu.model.Program;
import de.hfu.model.statement.Write;
import de.hfu.util.AvailableVariables;
import de.hfu.util.ErrorMessages;

public class WriteVisitor extends WhileBaseVisitor<Write> {

    AvailableVariables availableVariables;
    Program program;

    public WriteVisitor(AvailableVariables availableVariables, Program program) {
        this.program = program;
        this.availableVariables = availableVariables;
    }

    @Override
    public Write visitWrite(WriteContext ctx) {
        List<String> varNames = new ArrayList<>();
        for (var param : ctx.defParameters().ID()) {
            Token token = param.getSymbol();
            if (availableVariables.contains(token.getText())) {
                varNames.add(token.getText());
            } else {
                program.addError(ErrorFactory.formattedSemanticError(ErrorMessages.VAR_NOT_DEF, token));
            }
        }

        if (varNames.isEmpty()) {
            return null;
        } else {
            return new Write(varNames);
        }
    }
}