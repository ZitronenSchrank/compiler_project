package de.hfu.visitor.statement;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import de.hfu.error.ErrorFactory;
import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.WhlContext;
import de.hfu.model.Program;
import de.hfu.model.statement.Statement;
import de.hfu.model.statement.While;
import de.hfu.util.AvailableVariables;
import de.hfu.util.ErrorMessages;

public class WhlVisitor extends WhileBaseVisitor<While> {

    AvailableVariables availableVariables;
    Program program;

    public WhlVisitor(AvailableVariables availableVariables, Program program) {
        this.program = program;
        this.availableVariables = availableVariables;
    }

    @Override
    public While visitWhl(WhlContext ctx) {
        Token varName = ctx.ID().getSymbol();
        if (availableVariables.contains(varName.getText())) {
            List<Statement> statements = new ArrayList<>();
            availableVariables.pushNewContext();

            for (var statement : ctx.statement()) {
                Statement stmt = statement.accept(new StatementVisitor(availableVariables, program));
                if (stmt != null) {
                    statements.add(stmt);
                }
            }

            availableVariables.pop();
            return new While(varName.getText(), statements);
        } else {
            program.addError(ErrorFactory.formattedSemanticError(ErrorMessages.VAR_NOT_DEF, varName));
        }
        return null;
    }
}