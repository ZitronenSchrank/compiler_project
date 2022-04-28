package de.hfu.model;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public List<DecFunction> decFunctions;
    public List<DefFunction> defFunctions;
    public List<Statement> statements;

    public Program() {
        decFunctions = new ArrayList<>();
        defFunctions = new ArrayList<>();
        statements = new ArrayList<>();
    }

}
