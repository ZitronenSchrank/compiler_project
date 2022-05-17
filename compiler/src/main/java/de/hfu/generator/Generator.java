package de.hfu.generator;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.*;

import org.objectweb.asm.ClassWriter;

import de.hfu.model.DefFunction;
import de.hfu.model.Program;
import de.hfu.model.statement.Statement;

public class Generator {

    private final Program whileProgram;
    private final Path destination;
    private ClassWriter classWriter;

    public Generator(Program whileProgram) {
        this.whileProgram = whileProgram;
        this.destination = Paths.get("./");
    }

    public Generator(Program whileProgram, Path destination) {
        this.whileProgram = whileProgram;
        this.destination = destination;
    }

    public void generateCode() throws IOException {
        this.generateLanguageFunctionalityCode();

        for (DefFunction function : whileProgram.getDefFunctions().values()) {
            this.generateFunctionCode(function);
        }

        for (Statement statement : whileProgram.getStatements()) {
            this.generateStatementCode(statement);
        }

        OutputStream out = new BufferedOutputStream(
                Files.newOutputStream(destination, CREATE, WRITE, TRUNCATE_EXISTING));
        out.write(classWriter.toByteArray());
        out.flush();
        out.close();
    }

    private void generateLanguageFunctionalityCode() {
        // TODO
    }

    private void generateFunctionCode(DefFunction function) {
        // TODO
    }

    private void generateStatementCode(Statement statement) {
        // TODO
    }

}