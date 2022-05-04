package de.hfu.model;

import java.util.ArrayList;
import java.util.List;

import de.hfu.model.statement.Statement;

public class Program {
    private List<DecFunction> decFunctions;
    private List<DefFunction> defFunctions;
    private List<Statement> statements;

    public Program() {
        decFunctions = new ArrayList<>();
        defFunctions = new ArrayList<>();
        statements = new ArrayList<>();
    }

    public List<DecFunction> getDecFunctions() {
        return decFunctions;
    }

    public List<DefFunction> getDefFunctions() {
        return defFunctions;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void addDecFunction(DecFunction decFunction) {
        decFunctions.add(decFunction);
    }

    public void addDefFunction(DefFunction defFunction) {
        defFunctions.add(defFunction);
    }

    public void addStatement(Statement statement) {
        statements.add(statement);
    }
}
