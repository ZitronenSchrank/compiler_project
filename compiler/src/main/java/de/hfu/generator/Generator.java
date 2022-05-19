package de.hfu.generator;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.*;

import de.hfu.model.DefFunction;
import de.hfu.model.Program;
import de.hfu.model.expression.*;
import de.hfu.model.statement.*;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Handle;

import static org.objectweb.asm.Opcodes.ACC_PUBLIC;
import static org.objectweb.asm.Opcodes.ACC_STATIC;
import static org.objectweb.asm.Opcodes.ACC_SUPER;
import static org.objectweb.asm.Opcodes.GETSTATIC;
import static org.objectweb.asm.Opcodes.INVOKEVIRTUAL;
import static org.objectweb.asm.Opcodes.V1_8;
import static org.objectweb.asm.Opcodes.RETURN;
import static org.objectweb.asm.Opcodes.ARETURN;
import static org.objectweb.asm.Opcodes.ALOAD;
import static org.objectweb.asm.Opcodes.ASTORE;
import static org.objectweb.asm.Opcodes.ICONST_M1;
import static org.objectweb.asm.Opcodes.IF_ICMPNE;
import static org.objectweb.asm.Opcodes.NEW;
import static org.objectweb.asm.Opcodes.DUP;
import static org.objectweb.asm.Opcodes.INVOKESPECIAL;
import static org.objectweb.asm.Opcodes.ICONST_0;
import static org.objectweb.asm.Opcodes.ACC_VARARGS;
import static org.objectweb.asm.Opcodes.AALOAD;
import static org.objectweb.asm.Opcodes.GETFIELD;

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
        mainMethodVisitor.visitCode();
        
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
        MethodVisitor methodVisitor;
        
        {   //PRED
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "pred", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(10, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitFieldInsn(GETSTATIC, "java/math/BigInteger", "ZERO", "Ljava/math/BigInteger;");
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "add", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
            methodVisitor.visitVarInsn(ASTORE, 1);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(11, label1);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitFieldInsn(GETSTATIC, "java/math/BigInteger", "ONE", "Ljava/math/BigInteger;");
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "subtract", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
            methodVisitor.visitVarInsn(ASTORE, 1);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(14, label2);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitFieldInsn(GETSTATIC, "java/math/BigInteger", "ZERO", "Ljava/math/BigInteger;");
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "compareTo", "(Ljava/math/BigInteger;)I", false);
            methodVisitor.visitInsn(ICONST_M1);
            Label label3 = new Label();
            methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
            Label label4 = new Label();
            methodVisitor.visitLabel(label4);
            methodVisitor.visitLineNumber(15, label4);
            methodVisitor.visitFieldInsn(GETSTATIC, "java/math/BigInteger", "ZERO", "Ljava/math/BigInteger;");
            methodVisitor.visitVarInsn(ASTORE, 1);
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLineNumber(17, label3);
            methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/math/BigInteger"}, 0, null);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitInsn(ARETURN);
            methodVisitor.visitMaxs(2, 2);
            methodVisitor.visitEnd();
        }   //!PRED
        {   //SUCC
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "succ", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(22, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitFieldInsn(GETSTATIC, "java/math/BigInteger", "ONE", "Ljava/math/BigInteger;");
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "add", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
            methodVisitor.visitInsn(ARETURN);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        }   //!SUCC
        {   //READ
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "read", "(Ljava/lang/String;)Ljava/math/BigInteger;", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(27, label0);
            methodVisitor.visitTypeInsn(NEW, "java/util/Scanner");
            methodVisitor.visitInsn(DUP);
            methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "in", "Ljava/io/InputStream;");
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Scanner", "<init>", "(Ljava/io/InputStream;)V", false);
            methodVisitor.visitVarInsn(ASTORE, 1);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(28, label1);
            methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitInvokeDynamicInsn("makeConcatWithConstants", "(Ljava/lang/String;)Ljava/lang/String;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/StringConcatFactory", "makeConcatWithConstants", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;", false), new Object[]{"\u0001 := "});
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "print", "(Ljava/lang/String;)V", false);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(29, label2);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Scanner", "nextLine", "()Ljava/lang/String;", false);
            methodVisitor.visitVarInsn(ASTORE, 2);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLineNumber(30, label3);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Scanner", "close", "()V", false);
            Label label4 = new Label();
            methodVisitor.visitLabel(label4);
            methodVisitor.visitLineNumber(31, label4);
            methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
            methodVisitor.visitInsn(DUP);
            methodVisitor.visitVarInsn(ALOAD, 2);
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(Ljava/lang/String;)V", false);
            methodVisitor.visitInsn(ARETURN);
            methodVisitor.visitMaxs(3, 3);
            methodVisitor.visitEnd();
        }   //!READ
        {   //WRITE
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "write", "([Lde/hfu/Example$Value;)V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(159, label0);
            methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitInsn(ICONST_0);
            methodVisitor.visitInsn(AALOAD);
            methodVisitor.visitFieldInsn(GETFIELD, "de/hfu/Example$Value", "name", "Ljava/lang/String;");
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(160, label1);
            methodVisitor.visitInsn(RETURN);
            methodVisitor.visitMaxs(3, 1);
            methodVisitor.visitEnd();
        }   //!WRITE
    }

    private void generateFunctionCode(DefFunction function) {
        MethodVisitor currentFunctionVisitor = classWriter.visitMethod(ACC_PUBLIC + ACC_STATIC, function.getId(), "(Ljava/lang/String;)Ljava/math/BigInteger;", null, null);
        currentFunctionVisitor.visitCode();
        
        //TODO Einlesen von Parametern

        for (Statement statement : function.getStatements()) {
            this.generateStatementCode(currentFunctionVisitor, statement);
        }
        currentFunctionVisitor.visitInsn(ARETURN); //TODO Return muss noch getestet werden und verbindung mit Statements muss hergestellt werden (Laden vom Rückgabewert)
        currentFunctionVisitor.visitEnd();
        currentFunctionVisitor.visitMaxs(-1,-1);
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