package asm.de.hfu;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class ExampleDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V18, ACC_PUBLIC | ACC_SUPER, "de/hfu/Example", null, "java/lang/Object", null);

classWriter.visitSource("Example.java", null);

classWriter.visitNestMember("de/hfu/Example$Value");

classWriter.visitInnerClass("de/hfu/Example$Value", "de/hfu/Example", "Value", 0);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(6, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
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
}
{
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
}
{
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
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "add", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(38, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/math/BigInteger", "ZERO", "Ljava/math/BigInteger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "add", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(41, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "java/math/BigInteger", "ZERO", "Ljava/math/BigInteger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "add", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/math/BigInteger", "java/math/BigInteger"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "java/math/BigInteger", "ZERO", "Ljava/math/BigInteger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "compareTo", "(Ljava/math/BigInteger;)I", false);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitLineNumber(45, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "de/hfu/Example", "succ", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitLineNumber(41, label5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "java/math/BigInteger", "ONE", "Ljava/math/BigInteger;");
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitLineNumber(42, label6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "subtract", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitLineNumber(49, label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "sub", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(56, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/math/BigInteger", "valueOf", "(J)Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "add", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(59, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "java/math/BigInteger", "ZERO", "Ljava/math/BigInteger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "add", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/math/BigInteger", "java/math/BigInteger"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "java/math/BigInteger", "ZERO", "Ljava/math/BigInteger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "compareTo", "(Ljava/math/BigInteger;)I", false);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitLineNumber(63, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "de/hfu/Example", "pred", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitLineNumber(59, label5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "java/math/BigInteger", "ONE", "Ljava/math/BigInteger;");
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitLineNumber(60, label6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "subtract", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitLineNumber(67, label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "mutliply", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(73, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/math/BigInteger", "ZERO", "Ljava/math/BigInteger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "add", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(76, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "de/hfu/Example", "pred", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(79, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "java/math/BigInteger", "ZERO", "Ljava/math/BigInteger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "add", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/math/BigInteger", "java/math/BigInteger"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "java/math/BigInteger", "ZERO", "Ljava/math/BigInteger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "compareTo", "(Ljava/math/BigInteger;)I", false);
methodVisitor.visitInsn(ICONST_1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label4);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitLineNumber(83, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "de/hfu/Example", "add", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitLineNumber(79, label6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "java/math/BigInteger", "ONE", "Ljava/math/BigInteger;");
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitLineNumber(80, label7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "subtract", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitLineNumber(87, label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "equal", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(93, label0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/math/BigInteger", "valueOf", "(J)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(96, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "de/hfu/Example", "sub", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(98, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "de/hfu/Example", "isZero", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLineNumber(101, label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/math/BigInteger", "java/math/BigInteger", "java/math/BigInteger"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "java/math/BigInteger", "ZERO", "Ljava/math/BigInteger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "compareTo", "(Ljava/math/BigInteger;)I", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitLineNumber(104, label5);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/math/BigInteger", "valueOf", "(J)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitLineNumber(107, label6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "de/hfu/Example", "sub", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitLineNumber(109, label7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "de/hfu/Example", "isZero", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
Label label8 = new Label();
methodVisitor.visitLabel(label8);
methodVisitor.visitLineNumber(112, label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/math/BigInteger", "java/math/BigInteger"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "java/math/BigInteger", "ZERO", "Ljava/math/BigInteger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "compareTo", "(Ljava/math/BigInteger;)I", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
Label label10 = new Label();
methodVisitor.visitLabel(label10);
methodVisitor.visitLineNumber(114, label10);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/math/BigInteger", "valueOf", "(J)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label11 = new Label();
methodVisitor.visitLabel(label11);
methodVisitor.visitLineNumber(116, label11);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/math/BigInteger", "valueOf", "(J)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label9);
methodVisitor.visitLineNumber(118, label9);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitLineNumber(121, label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isNotZero", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(127, label0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/math/BigInteger", "valueOf", "(J)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(130, label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/math/BigInteger"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/math/BigInteger", "ZERO", "Ljava/math/BigInteger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "compareTo", "(Ljava/math/BigInteger;)I", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLineNumber(132, label3);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/math/BigInteger", "valueOf", "(J)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitLineNumber(134, label4);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/math/BigInteger", "valueOf", "(J)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(138, label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isZero", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(144, label0);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/math/BigInteger", "valueOf", "(J)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(147, label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/math/BigInteger"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/math/BigInteger", "ZERO", "Ljava/math/BigInteger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "compareTo", "(Ljava/math/BigInteger;)I", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLineNumber(149, label3);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/math/BigInteger", "valueOf", "(J)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitLineNumber(151, label4);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/math/BigInteger", "valueOf", "(J)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(155, label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
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
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitLineNumber(174, label0);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("10");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitLineNumber(175, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "de/hfu/Example", "isZero", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitLineNumber(176, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("makeConcatWithConstants", "(Ljava/math/BigInteger;)Ljava/lang/String;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/StringConcatFactory", "makeConcatWithConstants", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;", false), new Object[]{"result := \u0001"});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitLineNumber(177, label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
