package de.hfu.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.hfu.model.statement.Statement;

public class Program {
    private Map<String, DecFunction> decFunctions;
    private Map<String, DefFunction> defFunctions;
    private List<Statement> statements;

    public Program() {
        decFunctions = new HashMap<>();
        defFunctions = new HashMap<>();
        statements = new ArrayList<>();
    }

    public Map<String, DecFunction> getDecFunctions() {
        return decFunctions;
    }

    public Map<String, DefFunction> getDefFunctions() {
        return defFunctions;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public boolean addDecFunction(String id, DecFunction decFunction) {
        return decFunctions.put(id, decFunction) == null;
    }

    public boolean addDefFunction(String id, DefFunction defFunction) {
        return defFunctions.put(id, defFunction) == null;
    }

    public void addStatement(Statement statement) {
        statements.add(statement);
    }
}
