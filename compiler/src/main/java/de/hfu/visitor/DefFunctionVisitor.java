package de.hfu.visitor;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import de.hfu.error.ErrorFactory;
import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.DefFunctionContext;
import de.hfu.grammar.WhileParser.StatementContext;
import de.hfu.model.DefFunction;
import de.hfu.model.Program;
import de.hfu.model.statement.Statement;
import de.hfu.util.AvailableVariables;
import de.hfu.util.ErrorMessages;
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
                program.addError(ErrorFactory.semanticError(ErrorMessages.DEF_OR_DEC_MISSING, nodeId));
            } else {
                // It is in the map
                if (functionParameters.size() == def.getParameterCount()) {
                    if (areParameterNamesTheSame(def, functionParameters)) {
                        if (def.isImplemented()) {
                            program.addError(ErrorFactory.semanticError(ErrorMessages.FUN_ALREADY_IMPLEMENTED, nodeId));
                        } else {
                            StatementParseResult result = parseStatements(functionStatements, functionParameters);

                            if (result.getAvailableVariables().contains(returnVariable.getText())) {
                                def.setStatementList(result.getStatements());
                                def.setReturnVariable(returnVariable.getText());
                                // DefFunction is already inside the collection, do not add it again
                                return null;
                            } else {
                                program.addError(
                                        ErrorFactory.semanticError(ErrorMessages.RET_VAR_NOT_EXIST, returnVariable));
                            }
                        }
                    } else {
                        program.addError(ErrorFactory.semanticError(ErrorMessages.PARAM_DEF_DEC_NAMES, nodeId));
                    }

                } else {
                    program.addError(ErrorFactory.semanticError(ErrorMessages.PARAM_DEF_DEC_COUNT, nodeId));
                }
            }
        } else {
            // No
            // Then the function must not be inside the map
            if (def != null) {
                // It is inside the map
                program.addError(ErrorFactory.semanticError(ErrorMessages.FUN_ALREADY_DEF, nodeId));
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
                        program.addError(ErrorFactory.semanticError(ErrorMessages.RET_VAR_NOT_EXIST, returnVariable));
                    }
                } else {
                    program.addError(ErrorFactory.semanticError(ErrorMessages.PARAM_NEED_UNIQUE_NAME, nodeId));
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
            Statement stmt = statement.accept(statementVisitor);
            if (stmt != null) {
                statements.add(stmt);
            }
        }

        return new StatementParseResult(statements, availableVariables);
    }

    private boolean areParameterNamesTheSame(DefFunction function, List<TerminalNode> parameters) {
        List<String> functionParameters = function.getParameterNames();

        for (int i = 0; i < functionParameters.size(); i++) {
            if (!functionParameters.get(i).equals(parameters.get(i).getText())) {
                return false;
            }
        }

        return true;
    }
}
