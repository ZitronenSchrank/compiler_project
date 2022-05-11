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
import de.hfu.util.AvailableVariables;
import de.hfu.util.SemanticUtils;
import de.hfu.util.StatementParseResult;
import de.hfu.visitor.statement.StatementVisitor;

public class DefFunctionVisitor extends WhileBaseVisitor<DefFunction> {

    private Program program;

    public DefFunctionVisitor(Program program) {
        this.program = program;
    }

    @Override
    public DefFunction visitDefFunction(DefFunctionContext ctx) {
        Token nodeId = ctx.ID().getSymbol();

        Token returnVariable = ctx.retStatement().ID().getSymbol();
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
                        StatementParseResult result = parseStatements(functionStatements, functionParameters);

                        if (result.getAvailableVariables().contains(returnVariable.getText())) {
                            def.setStatementList(result.getStatements());
                            def.setReturnVariable(returnVariable.getText());
                            // DefFunction is already inside the collection, do not add it again
                            return null;
                        } else {
                            program.addError(
                                    new SemanticError("Variable in Return Statement does not exist", returnVariable));
                        }

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
                if (SemanticUtils.isEachParameterNameUnique(functionParameters)) {
                    ArrayList<String> parameters = new ArrayList<>();
                    for (var parameter : functionParameters) {
                        parameters.add(parameter.getText());
                    }
                    StatementParseResult result = parseStatements(functionStatements, functionParameters);

                    if (result.getAvailableVariables().contains(returnVariable.getText())) {
                        return new DefFunction(nodeId, parameters, result.getStatements(), returnVariable.getText());
                    } else {
                        program.addError(
                                new SemanticError("Variable in Return Statement does not exist", returnVariable));
                    }
                } else {
                    program.addError(
                            new SemanticError("Each Parameter Needs An Unique Name", ctx.ID().getSymbol()));
                }
            }
        }
        return null;
    }

    private StatementParseResult parseStatements(List<StatementContext> statementsInFunction,
            List<TerminalNode> functionParamesters) {

        List<Statement> statements = new ArrayList<>();
        AvailableVariables availableVariables = new AvailableVariables();

        // Add Function Parameters as Variables inside the scope
        for (var parameter : functionParamesters) {
            availableVariables.addAvailableVariable(parameter.getText());
        }

        // Pass Scope to Visitor
        StatementVisitor statementVisitor = new StatementVisitor(availableVariables, program);

        for (var statement : statementsInFunction) {
            statements.add(statement.accept(statementVisitor));
        }

        return new StatementParseResult(statements, availableVariables);
    }
}
