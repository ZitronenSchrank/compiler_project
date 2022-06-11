package de.hfu.generator;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import static java.nio.file.StandardOpenOption.*;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

import de.hfu.model.DefFunction;
import de.hfu.model.Program;
import de.hfu.model.expression.*;
import de.hfu.model.statement.*;

import org.objectweb.asm.Opcodes;

public class Generator {

    private final Program whileProgram;
    private final Path destination;
    private ClassWriter classWriter;
    private int varCounter;
    private Map<String, Integer> nameToIdMap;
    private String className;

    public Generator(Program whileProgram) {
        this.whileProgram = whileProgram;
        this.destination = Paths.get("./out.java");
        this.nameToIdMap = new HashMap<>();
        varCounter = 0;
        className = "out";
    }

    public Generator(Program whileProgram, Path destination) {
        this.whileProgram = whileProgram;
        this.destination = destination;
        this.nameToIdMap = new HashMap<>();
        varCounter = 0;
        className = destination.getFileName().toString().split("\\.")[0];
    }

    public void generateCode() throws IOException {
        classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES);

        classWriter.visit(
                Opcodes.V1_8, // Java 1.8
                Opcodes.ACC_PUBLIC + Opcodes.ACC_SUPER, // public static
                className, // Class Name
                null, // Generics <T>
                "java/lang/Object", // Interface extends Object (Super Class),
                null // interface names
        );

        this.generateStaticScannerInit();
        this.generateLanguageFunctionalityCode();

        for (DefFunction function : whileProgram.getDefFunctions().values()) {
            varCounter = 0;
            nameToIdMap.clear();
            this.generateFunctionCode(function);
        }

        MethodVisitor mainMethodVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "main",
                "([Ljava/lang/String;)V", null, null);

        varCounter = 0;
        nameToIdMap.clear();
        for (Statement statement : whileProgram.getStatements()) {
            this.generateStatementCode(mainMethodVisitor, statement);
        }

        generateStaticScannerClose(mainMethodVisitor);

        mainMethodVisitor.visitInsn(Opcodes.RETURN);
        mainMethodVisitor.visitEnd();
        mainMethodVisitor.visitMaxs(-1, -1);
        classWriter.visitEnd();

        OutputStream out = new BufferedOutputStream(
                Files.newOutputStream(destination, CREATE, WRITE, TRUNCATE_EXISTING));
        out.write(classWriter.toByteArray());
        out.flush();
        out.close();
    }

    private String getFunctionDescriptor(int paramCount) {
        StringBuilder builder = new StringBuilder();
        String type = "Ljava/math/BigInteger;";
        builder.append("(");
        for (int i = 0; i < paramCount; i++) {
            builder.append(type);
        }
        builder.append(")");
        builder.append(type);
        return builder.toString();
    }

    private void generateStaticScannerInit() {
        FieldVisitor fieldVisitor = classWriter.visitField(Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC, "in",
                "Ljava/util/Scanner;", null, null);
        fieldVisitor.visitEnd();

        MethodVisitor methodVisitor = classWriter.visitMethod(Opcodes.ACC_STATIC, "<clinit>", "()V", null, null);
        methodVisitor.visitCode();
        Label label0 = new Label();
        methodVisitor.visitLabel(label0);
        methodVisitor.visitLineNumber(8, label0);
        methodVisitor.visitTypeInsn(Opcodes.NEW, "java/util/Scanner");
        methodVisitor.visitInsn(Opcodes.DUP);
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "in", "Ljava/io/InputStream;");
        methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/util/Scanner", "<init>", "(Ljava/io/InputStream;)V",
                false);
        methodVisitor.visitFieldInsn(Opcodes.PUTSTATIC, className, "in", "Ljava/util/Scanner;");
        methodVisitor.visitInsn(Opcodes.RETURN);
        methodVisitor.visitMaxs(3, 0);
        methodVisitor.visitEnd();
    }

    private void generateStaticScannerClose(MethodVisitor methodVisitor) {
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, className, "in", "Ljava/util/Scanner;");
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/util/Scanner", "close", "()V", false);
    }

    private void generateLanguageFunctionalityCode() {
        MethodVisitor methodVisitor;

        { // PRED
            methodVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC, "pred",
                    "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(10, label0);
            methodVisitor.visitVarInsn(Opcodes.ALOAD, 0);
            methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/math/BigInteger", "ZERO", "Ljava/math/BigInteger;");
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/math/BigInteger", "add",
                    "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
            methodVisitor.visitVarInsn(Opcodes.ASTORE, 1);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(11, label1);
            methodVisitor.visitVarInsn(Opcodes.ALOAD, 1);
            methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/math/BigInteger", "ONE", "Ljava/math/BigInteger;");
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/math/BigInteger", "subtract",
                    "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
            methodVisitor.visitVarInsn(Opcodes.ASTORE, 1);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(14, label2);
            methodVisitor.visitVarInsn(Opcodes.ALOAD, 1);
            methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/math/BigInteger", "ZERO", "Ljava/math/BigInteger;");
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/math/BigInteger", "compareTo",
                    "(Ljava/math/BigInteger;)I", false);
            methodVisitor.visitInsn(Opcodes.ICONST_M1);
            Label label3 = new Label();
            methodVisitor.visitJumpInsn(Opcodes.IF_ICMPNE, label3);
            Label label4 = new Label();
            methodVisitor.visitLabel(label4);
            methodVisitor.visitLineNumber(15, label4);
            methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/math/BigInteger", "ZERO", "Ljava/math/BigInteger;");
            methodVisitor.visitVarInsn(Opcodes.ASTORE, 1);
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLineNumber(17, label3);
            methodVisitor.visitFrame(Opcodes.F_APPEND, 1, new Object[] { "java/math/BigInteger" }, 0, null);
            methodVisitor.visitVarInsn(Opcodes.ALOAD, 1);
            methodVisitor.visitInsn(Opcodes.ARETURN);
            methodVisitor.visitMaxs(2, 2);
            methodVisitor.visitEnd();
        } // !PRED
        { // SUCC
            methodVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC, "succ",
                    "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", null, null);
            methodVisitor.visitCode();
            methodVisitor.visitVarInsn(Opcodes.ALOAD, 0);
            methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/math/BigInteger", "ONE", "Ljava/math/BigInteger;");
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/math/BigInteger", "add",
                    "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
            methodVisitor.visitInsn(Opcodes.ARETURN);
            methodVisitor.visitMaxs(2, 1);
            methodVisitor.visitEnd();
        } // !SUCC
        { // READ
            methodVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC, "read",
                    "(Ljava/lang/String;)Ljava/math/BigInteger;", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(29, label0);
            methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            methodVisitor.visitVarInsn(Opcodes.ALOAD, 0);
            methodVisitor.visitInvokeDynamicInsn("makeConcatWithConstants", "(Ljava/lang/String;)Ljava/lang/String;",
                    new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/StringConcatFactory",
                            "makeConcatWithConstants",
                            "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;",
                            false),
                    new Object[] { "\u0001 := " });
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "print",
                    "(Ljava/lang/String;)V",
                    false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(30, label1);
            methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, className, "in", "Ljava/util/Scanner;");
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/util/Scanner", "nextLine",
                    "()Ljava/lang/String;",
                    false);
            methodVisitor.visitVarInsn(Opcodes.ASTORE, 1);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(32, label2);
            methodVisitor.visitTypeInsn(Opcodes.NEW, "java/math/BigInteger");
            methodVisitor.visitInsn(Opcodes.DUP);
            methodVisitor.visitVarInsn(Opcodes.ALOAD, 1);
            methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/math/BigInteger", "<init>",
                    "(Ljava/lang/String;)V",
                    false);
            methodVisitor.visitVarInsn(Opcodes.ASTORE, 2);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLineNumber(34, label3);
            methodVisitor.visitVarInsn(Opcodes.ALOAD, 2);
            methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/math/BigInteger", "ZERO", "Ljava/math/BigInteger;");
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/math/BigInteger", "compareTo",
                    "(Ljava/math/BigInteger;)I", false);
            methodVisitor.visitInsn(Opcodes.ICONST_M1);
            Label label4 = new Label();
            methodVisitor.visitJumpInsn(Opcodes.IF_ICMPNE, label4);
            Label label5 = new Label();
            methodVisitor.visitLabel(label5);
            methodVisitor.visitLineNumber(35, label5);
            methodVisitor.visitTypeInsn(Opcodes.NEW, "java/lang/NumberFormatException");
            methodVisitor.visitInsn(Opcodes.DUP);
            methodVisitor.visitLdcInsn("A Negative Value Is Not Allowed");
            methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/NumberFormatException", "<init>",
                    "(Ljava/lang/String;)V", false);
            methodVisitor.visitInsn(Opcodes.ATHROW);
            methodVisitor.visitLabel(label4);
            methodVisitor.visitLineNumber(38, label4);
            methodVisitor.visitFrame(Opcodes.F_APPEND, 2, new Object[] { "java/lang/String", "java/math/BigInteger" },
                    0, null);
            methodVisitor.visitVarInsn(Opcodes.ALOAD, 2);
            methodVisitor.visitInsn(Opcodes.ARETURN);
            methodVisitor.visitMaxs(3, 3);
            methodVisitor.visitEnd();
        } // !READ

    }

    private void generateFunctionCode(DefFunction function) {
        MethodVisitor currentFunctionVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC,
                function.getId(), getFunctionDescriptor(function.getParameterCount()), null, null);
        currentFunctionVisitor.visitCode();

        for (var name : function.getParameterNames()) {
            nameToIdMap.put(name, varCounter);
            varCounter++;
        }

        for (Statement statement : function.getStatements()) {
            this.generateStatementCode(currentFunctionVisitor, statement);
        }

        currentFunctionVisitor.visitVarInsn(Opcodes.ALOAD, nameToIdMap.get(function.getReturnVariable()));
        currentFunctionVisitor.visitInsn(Opcodes.ARETURN);
        currentFunctionVisitor.visitEnd();
        currentFunctionVisitor.visitMaxs(-1, -1);
    }

    private void generateStatementCode(MethodVisitor methodVisitor, Statement statement) {
        switch (statement.getClass().getSimpleName()) {
            case "Assign":
                generateAssignCode(methodVisitor, (Assign) statement);
                break;
            case "DefVar":
                generateDefVarCode(methodVisitor, (DefVar) statement);
                break;
            case "Loop":
                generateLoopCode(methodVisitor, (Loop) statement);
                break;
            case "Pred":
                generatePredCode(methodVisitor, (Pred) statement);
                break;
            case "Succ":
                generateSuccCode(methodVisitor, (Succ) statement);
                break;
            case "While":
                generateWhileCode(methodVisitor, (While) statement);
                break;
            case "Write":
                generateWriteCode(methodVisitor, (Write) statement);
                break;
            default:
                System.err.println("Statement: " + statement.getClass().getSimpleName() + "not found!");
                break;
        }
    }

    private void generateExpressionCode(MethodVisitor methodVisitor, Expression expression) {
        switch (expression.getClass().getSimpleName()) {
            case "CallFunction":
                generateCallFunctionCode(methodVisitor, (CallFunction) expression);
                break;
            case "NumExpression":
                generateNumExpressionCode(methodVisitor, (NumExpression) expression);
                break;
            case "Read":
                generateReadCode(methodVisitor, (Read) expression);
                break;
            case "VarExpression":
                generateVarExpressionCode(methodVisitor, (VarExpression) expression);
                break;
            default:
                System.err.println("Expression: " + expression.getClass().getSimpleName() + " not found!");
                ;
                break;
        }
    }

    private void generateAssignCode(MethodVisitor methodVisitor, Assign statement) {
        generateExpressionCode(methodVisitor, statement.getExpression());
        methodVisitor.visitVarInsn(Opcodes.ASTORE, nameToIdMap.get(statement.getTargetVarName()));
    }

    private void generateDefVarCode(MethodVisitor methodVisitor, DefVar defVar) {
        varCounter++;
        generateExpressionCode(methodVisitor, defVar.getInitValue());
        nameToIdMap.put(defVar.getVarName(), varCounter);
        methodVisitor.visitVarInsn(Opcodes.ASTORE, varCounter);
    }

    private void generateLoopCode(MethodVisitor methodVisitor, Loop statement) {
        int varId = nameToIdMap.get(statement.getVarName());
        Label loopEnd = new Label();
        Label loopBegin = new Label();

        methodVisitor.visitFrame(Opcodes.F_APPEND, varId,
                new Object[] { "java/math/BigInteger", "java/math/BigInteger" },
                0, null);
        methodVisitor.visitLabel(loopBegin);
        methodVisitor.visitVarInsn(Opcodes.ALOAD, varId);
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/math/BigInteger", "ZERO", "Ljava/math/BigInteger;");
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/math/BigInteger", "compareTo",
                "(Ljava/math/BigInteger;)I", false);

        methodVisitor.visitJumpInsn(Opcodes.IFEQ, loopEnd);

        for (var stmt : statement.getStatements()) {
            generateStatementCode(methodVisitor, stmt);
        }
        generatePredCode(methodVisitor, new Pred(statement.getVarName()));
        methodVisitor.visitJumpInsn(Opcodes.GOTO, loopBegin);

        methodVisitor.visitLabel(loopEnd);
        methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
    }

    private void generatePredCode(MethodVisitor methodVisitor, Pred statement) {
        methodVisitor.visitVarInsn(Opcodes.ALOAD, nameToIdMap.get(statement.getVarName()));
        methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, className, "pred",
                "(Ljava/math/BigInteger;)Ljava/math/BigInteger;",
                false);
        methodVisitor.visitVarInsn(Opcodes.ASTORE, nameToIdMap.get(statement.getVarName()));
    }

    private void generateSuccCode(MethodVisitor methodVisitor, Succ statement) {
        methodVisitor.visitVarInsn(Opcodes.ALOAD, nameToIdMap.get(statement.getVarName()));
        methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, className, "succ",
                "(Ljava/math/BigInteger;)Ljava/math/BigInteger;",
                false);
        methodVisitor.visitVarInsn(Opcodes.ASTORE, nameToIdMap.get(statement.getVarName()));
    }

    private void generateWhileCode(MethodVisitor methodVisitor, While statement) {
        int varId = nameToIdMap.get(statement.getVarName());
        Label whileEnd = new Label();
        Label whileBegin = new Label();

        methodVisitor.visitFrame(Opcodes.F_APPEND, varId,
                new Object[] { "java/math/BigInteger", "java/math/BigInteger" },
                0, null);
        methodVisitor.visitLabel(whileBegin);
        methodVisitor.visitVarInsn(Opcodes.ALOAD, varId);
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/math/BigInteger", "ZERO", "Ljava/math/BigInteger;");
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/math/BigInteger", "compareTo",
                "(Ljava/math/BigInteger;)I", false);

        methodVisitor.visitJumpInsn(Opcodes.IFEQ, whileEnd);

        for (var stmt : statement.getStatements()) {
            generateStatementCode(methodVisitor, stmt);
        }
        methodVisitor.visitJumpInsn(Opcodes.GOTO, whileBegin);

        methodVisitor.visitLabel(whileEnd);
        methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
    }

    private void generateWriteCode(MethodVisitor methodVisitor, Write statement) {
        for (String name : statement.getVarNames()) {

            methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
            methodVisitor.visitVarInsn(Opcodes.ALOAD, nameToIdMap.get(name));
            methodVisitor.visitInvokeDynamicInsn("makeConcatWithConstants",
                    "(Ljava/math/BigInteger;)Ljava/lang/String;",
                    new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/StringConcatFactory",
                            "makeConcatWithConstants",
                            "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;",
                            false),
                    new Object[] { name + " := \u0001" });
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println",
                    "(Ljava/lang/String;)V", false);
        }
    }

    private void generateCallFunctionCode(MethodVisitor methodVisitor, CallFunction expression) {
        for (var value : expression.getCallParameters()) {

            generateExpressionCode(methodVisitor, value);
        }
        methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, className, expression.getFunctionName(),
                getFunctionDescriptor(expression.getCallParameters().size()),
                false);

    }

    private void generateNumExpressionCode(MethodVisitor methodVisitor, NumExpression expression) {

        methodVisitor.visitTypeInsn(Opcodes.NEW, "java/math/BigInteger");
        methodVisitor.visitInsn(Opcodes.DUP);
        methodVisitor.visitLdcInsn(expression.getNumString());
        methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/math/BigInteger", "<init>", "(Ljava/lang/String;)V",
                false);
    }

    private void generateReadCode(MethodVisitor methodVisitor, Read expression) {
        methodVisitor.visitLdcInsn(expression.getTargetVar());
        methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, className, "read",
                "(Ljava/lang/String;)Ljava/math/BigInteger;",
                false);
    }

    private void generateVarExpressionCode(MethodVisitor methodVisitor, VarExpression expression) {
        methodVisitor.visitVarInsn(Opcodes.ALOAD, nameToIdMap.get(expression.getVarName()));
    }
}