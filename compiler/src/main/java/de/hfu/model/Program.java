package de.hfu.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.hfu.error.CompilerError;
import de.hfu.model.statement.Statement;

public class Program {
    private Map<String, DefFunction> defFunctions;
    private List<Statement> statements;

    private List<CompilerError> errors;

    public Program() {
        defFunctions = new HashMap<>();
        statements = new ArrayList<>();
        errors = new ArrayList<>();
    }

    public Map<String, DefFunction> getDefFunctions() {
        return defFunctions;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public List<CompilerError> getErrors() {
        return errors;
    }

    public boolean containsErrors() {
        return !errors.isEmpty();
    }

    public boolean addDefFunction(String id, DefFunction defFunction) {
        return defFunctions.put(id, defFunction) == null;
    }

    public void addStatement(Statement statement) {
        statements.add(statement);
    }

    public void addError(CompilerError error) {
        errors.add(error);
    }
}
