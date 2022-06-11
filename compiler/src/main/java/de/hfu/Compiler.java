package de.hfu;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import de.hfu.error.ErrorListener;
import de.hfu.generator.Generator;
import de.hfu.grammar.WhileLexer;
import de.hfu.grammar.WhileParser;
import de.hfu.model.Program;
import de.hfu.visitor.ProgramVisitor;

public class Compiler {

    private File inputFile;
    private File outputFile;
    private ErrorListener errorListener;

    public Compiler(File inputFile) {
        this.inputFile = inputFile;
        this.outputFile = null;
        this.errorListener = new ErrorListener();
    }

    public Compiler(File inputFile, File outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;

        this.errorListener = new ErrorListener();
    }

    public boolean compile() {
        CommonTokenStream tokens = lexer();
        if (tokens == null) {
            return false;
        }

        ParseTree parseTree = parse(tokens);
        if (parseTree == null) {
            return false;
        }

        Program program = semanticCheck(parseTree);
        if (program == null) {
            return false;
        }

        generateCode(program);

        return true;
    }

    public CommonTokenStream lexer() {
        try {
            WhileLexer lexer = new WhileLexer(CharStreams.fromFileName(this.inputFile.getAbsolutePath()));
            lexer.addErrorListener(errorListener);

            return new CommonTokenStream(lexer);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

    public ParseTree parse(CommonTokenStream tokens) {
        WhileParser parser = new WhileParser(tokens);
        parser.addErrorListener(errorListener);

        if (errorListener.getErrorCount() != 0) {
            return null;
        } else {
            ParseTree ast = parser.prog();
            return ast;
        }
    }

    public Program semanticCheck(ParseTree parseTree) {
        Program program = new ProgramVisitor().visit(parseTree);

        if (program.containsErrors()) {
            for (var error : program.getErrors()) {
                System.err.println(error);
            }
            return null;
        } else {
            return program;
        }
    }

    public void generateCode(Program program) {
        System.out.println(inputFile.getName());

        File output = inputFile;
        if (outputFile != null) {
            output = outputFile;
        }

        String cleanFileName = output.getName().split("\\.")[0];
        String parentDir = output.getParent();
        output = new File(parentDir + "/" + cleanFileName + ".class");

        Generator generator = new Generator(program, output.toPath());
        try {
            generator.generateCode();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
