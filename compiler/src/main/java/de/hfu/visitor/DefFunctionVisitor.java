package de.hfu.visitor;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import de.hfu.error.SemanticError;
import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.DefFunctionContext;
import de.hfu.grammar.WhileParser.StatementContext;
import de.hfu.model.DefFunction;
import de.hfu.model.Program;
import de.hfu.model.statement.Statement;
import de.hfu.visitor.statement.StatementVisitor;

public class DefFunctionVisitor extends WhileBaseVisitor<DefFunction> {

    private Program program;

    public DefFunctionVisitor(Program program) {
        this.program = program;
    }

    @Override
    public DefFunction visitDefFunction(DefFunctionContext ctx) {
        Token nodeId = ctx.ID().getSymbol();
        List<TerminalNode> functionParameters = ctx.defParameters().ID();
        List<StatementContext> functionStatements = ctx.statement();

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
                        List<Statement> statements = parseStatements(functionStatements, functionParameters);
                        def.setStatementList(statements);
                        // DefFunction is already inside the collection, do not add it again
                        return null;
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
                List<Statement> statements = parseStatements(functionStatements, functionParameters);

                return new DefFunction(nodeId, parameters, statements);
            }
        }
        return null;
    }

    private List<Statement> parseStatements(List<StatementContext> statementsInFunction,
            List<TerminalNode> functionParamesters) {

        List<Statement> statements = new ArrayList<>();
        List<String> availableVariables = new ArrayList<>();

        for (var parameter : functionParamesters) {
            availableVariables.add(parameter.getText());
        }

        StatementVisitor statementVisitor = new StatementVisitor(availableVariables, program.getDefFunctions());

        for (var statement : statementsInFunction) {
            statements.add(statement.accept(statementVisitor));
        }

        return statements;
    }
}
