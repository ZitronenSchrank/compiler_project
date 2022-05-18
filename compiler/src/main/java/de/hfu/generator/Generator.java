package de.hfu.generator;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.*;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

import de.hfu.model.DefFunction;
import de.hfu.model.Program;
import de.hfu.model.expression.*;
import de.hfu.model.statement.*;

import static org.objectweb.asm.Opcodes.ACC_PUBLIC;
import static org.objectweb.asm.Opcodes.ACC_STATIC;
import static org.objectweb.asm.Opcodes.ACC_SUPER;
import static org.objectweb.asm.Opcodes.GETSTATIC;
import static org.objectweb.asm.Opcodes.INVOKEVIRTUAL;
import static org.objectweb.asm.Opcodes.V1_8;
import static org.objectweb.asm.Opcodes.RETURN;

public class Generator {

    private final Program whileProgram;
    private final Path destination;
    private ClassWriter classWriter;

    public Generator(Program whileProgram) {
        this.whileProgram = whileProgram;
        this.destination = Paths.get("./out.java");
    }

    public Generator(Program whileProgram, Path destination) {
        this.whileProgram = whileProgram;
        this.destination = destination;
    }

    public void generateCode() throws IOException {
        classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES);

        classWriter.visit(
                V1_8, // Java 1.8
                ACC_PUBLIC + ACC_SUPER, // public static
                destination.getFileName().toString().split("\\.")[0], // Class Name //TODO
                null, // Generics <T>
                "java/lang/Object", // Interface extends Object (Super Class),
                null // interface names
        );

        this.generateLanguageFunctionalityCode();

        for (DefFunction function : whileProgram.getDefFunctions().values()) {
            this.generateFunctionCode(function);
        }

        MethodVisitor mainMethodVisitor = classWriter.visitMethod(ACC_PUBLIC + ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null);
        
        for (Statement statement : whileProgram.getStatements()) {
            this.generateStatementCode(mainMethodVisitor, statement);
        }

        mainMethodVisitor.visitInsn(RETURN);
        mainMethodVisitor.visitEnd();
        mainMethodVisitor.visitMaxs(-1,-1);
        classWriter.visitEnd();

        OutputStream out = new BufferedOutputStream(Files.newOutputStream(destination, CREATE, WRITE, TRUNCATE_EXISTING));
        out.write(classWriter.toByteArray());
        out.flush();
        out.close();
    }

    private void generateLanguageFunctionalityCode() {
        // TODO
    }

    private void generateFunctionCode(DefFunction function) {
        // TODO
        System.out.println(function.getId());
    }

    private void generateStatementCode(MethodVisitor methodVisitor, Statement statement) {
        switch(statement.getClass().getSimpleName()){
            case "Assign":  generateAssignCode(methodVisitor, (Assign)statement);
            break;
            case "DefVar":  generateDefVarCode(methodVisitor, (DefVar)statement);
            break;
            case "Loop":  generateLoopCode(methodVisitor, (Loop)statement);
            break;
            case "Pred":  generatePredCode(methodVisitor, (Pred)statement);
            break;
            case "Succ":  generateSuccCode(methodVisitor, (Succ)statement);
            break;
            case "While":  generateWhileCode(methodVisitor, (While)statement);
            break;
            case "Write":  generateWriteCode(methodVisitor, (Write)statement);
            break;
            default: System.err.println("Statement: " + statement.getClass().getSimpleName() + "not found!");
            break;
        }

        //TODO
        System.out.println(statement.getClass().toString());
        methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        methodVisitor.visitLdcInsn(statement.getClass().toString());
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);

    }

    private void generateExpressionCode(MethodVisitor methodVisitor, Expression expression){
        switch(expression.getClass().getSimpleName()){
            case "CallFunction":  generateCallFunctionCode(methodVisitor, (CallFunction)expression);
            break;
            case "NumExpression":  generateNumExpressionCode(methodVisitor, (NumExpression)expression);
            break;
            case "Read":  generateReadCode(methodVisitor, (Read)expression);
            break;
            case "VarExpression":  generateVarExpressionCode(methodVisitor, (VarExpression)expression);
            break;
            default: System.err.println("Expression: "+ expression.getClass().getSimpleName() + " not found!");;
            break;
        }
    }

    private void generateAssignCode(MethodVisitor methodVisitor, Assign statement) {
        //TODO
    }

    private void generateDefVarCode(MethodVisitor methodVisitor, DefVar defVar) {
        //TODO
        methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        methodVisitor.visitLdcInsn(defVar.getVarName() + " := " + ((NumExpression)defVar.getInitValue()).getNumString());
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
    }

    private void generateLoopCode(MethodVisitor methodVisitor, Loop statement) {
        //TODO
    }

    private void generatePredCode(MethodVisitor methodVisitor, Pred statement) {
        //TODO
    }

    private void generateSuccCode(MethodVisitor methodVisitor, Succ statement) {
        //TODO
    }

    private void generateWhileCode(MethodVisitor methodVisitor, While statement) {
        //TODO
    }

    private void generateWriteCode(MethodVisitor methodVisitor, Write statement) {
        //TODO
    }

    private void generateCallFunctionCode(MethodVisitor methodVisitor, CallFunction expression) {
        //TODO
    }

    private void generateNumExpressionCode(MethodVisitor methodVisitor, NumExpression expression) {
        //TODO
    }

    private void generateReadCode(MethodVisitor methodVisitor, Read expression) {
        //TODO
    }

    private void generateVarExpressionCode(MethodVisitor methodVisitor, VarExpression expression) {
        //TODO
    }
}