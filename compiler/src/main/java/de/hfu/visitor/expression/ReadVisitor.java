package de.hfu.visitor.expression;

import de.hfu.grammar.WhileBaseVisitor;
import de.hfu.grammar.WhileParser.ReadContext;
import de.hfu.model.Program;
import de.hfu.model.expression.Read;
import de.hfu.util.AvailableVariables;

public class ReadVisitor extends WhileBaseVisitor<Read> {

    AvailableVariables availableVariables;
    Program program;
    String targetVar;

    public ReadVisitor(AvailableVariables availableVariables, Program program, String targetVar) {
        this.availableVariables = availableVariables;
        this.program = program;
        this.targetVar = targetVar;
    }

    @Override
    public Read visitRead(ReadContext ctx) {
        return new Read(targetVar);
    }

}
