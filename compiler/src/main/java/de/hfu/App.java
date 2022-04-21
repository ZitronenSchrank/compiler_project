package de.hfu;

import static org.objectweb.asm.Opcodes.ACC_PUBLIC;
import static org.objectweb.asm.Opcodes.ACC_STATIC;
import static org.objectweb.asm.Opcodes.ACC_SUPER;
import static org.objectweb.asm.Opcodes.GETSTATIC;
import static org.objectweb.asm.Opcodes.INVOKEVIRTUAL;
import static org.objectweb.asm.Opcodes.V1_8;

import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;

import static org.objectweb.asm.Opcodes.RETURN;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.Tree;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

import de.hfu.grammar.WhileLexer;
import de.hfu.grammar.WhileParser;

/**
 * Hello world!
 *
 */
public class App {

    public App() {

        ClassWriter classWriter = new ClassWriter(0);

        classWriter.visit(
                V1_8, // Java 1.8
                ACC_PUBLIC + ACC_SUPER, // public static
                "Hello", // Class Name
                null, // Generics <T>
                "java/lang/Object", // Interface extends Object (Super Class),
                null // interface names
        );

        MethodVisitor mainMethodVisitor = classWriter.visitMethod(ACC_PUBLIC + ACC_STATIC, "main",
                "([Ljava/lang/String;)V", null, null);

        mainMethodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        mainMethodVisitor.visitLdcInsn("Hello World");
        mainMethodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V",
                false);
        mainMethodVisitor.visitInsn(RETURN);
        mainMethodVisitor.visitEnd();
        mainMethodVisitor.visitMaxs(2, 1);
        classWriter.visitEnd();

        try {
            Path p = Paths.get("./Hello.class");
            OutputStream out = new BufferedOutputStream(Files.newOutputStream(p, CREATE, WRITE, TRUNCATE_EXISTING));
            out.write(classWriter.toByteArray());
            out.flush();
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new App();

        try {
            WhileLexer lexer = new WhileLexer(CharStreams.fromFileName(""));
            WhileParser parser = new WhileParser(new CommonTokenStream(lexer));
            // Tree tree = parser.
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
