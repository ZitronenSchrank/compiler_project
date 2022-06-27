package de.hfu;

import java.math.BigInteger;
import java.util.Scanner;

/*import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.*;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.util.ASMifier;
import org.objectweb.asm.util.TraceClassVisitor;*/

public class Example {

    Example() {
        /*
         * try {
         * // How to read Example.class and write its content into ASMOutput.java
         * InputStream input = new FileInputStream(new File("./Example.class"));
         * 
         * ClassReader classReader = new ClassReader(input);
         * TraceClassVisitor cv = new TraceClassVisitor(null, new ASMifier(), new
         * PrintWriter(new BufferedOutputStream(
         * Files.newOutputStream(Paths.get("ASMOutput.java"), CREATE, WRITE,
         * TRUNCATE_EXISTING))));
         * 
         * classReader.accept(cv, 0);
         * } catch (IOException e) {
         * e.printStackTrace();
         * }
         */
    }

    public static Scanner in = new Scanner(System.in);

    // Implementierung von Pred()
    public static BigInteger pred(BigInteger s1) {
        BigInteger retVal = s1.add(BigInteger.ZERO); // Copy S1
        retVal = retVal.subtract(BigInteger.ONE);

        // Wert darf nie kleiner 0 werden
        if (retVal.compareTo(BigInteger.ZERO) == -1) {
            retVal = BigInteger.ZERO;
        }
        return retVal;
    }

    // Implementierung von succ()
    public static BigInteger succ(BigInteger s1) {
        return s1.add(BigInteger.ONE);
    }

    // Implementierung von read()
    public static BigInteger read(String name) {
        BigInteger retVal = null;

        do {
            System.out.print("> " + name + " := ");
            String input = in.nextLine();

            try {
                retVal = new BigInteger(input);
                if (retVal.compareTo(BigInteger.ZERO) == -1) {
                    throw new NumberFormatException("A Negative Value Is Not Allowed");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Only positive integers and 0 are allowed. Try again.");
                retVal = null;
            }

        } while (retVal == null);

        return retVal;
    }

    // Eigene Funktion add
    // def add
    public static BigInteger add(BigInteger s1, BigInteger s2) {
        // var sum := s1
        BigInteger sum = s1.add(BigInteger.ZERO);

        // loop(s2)
        for (BigInteger i = s2.add(BigInteger.ZERO); i.compareTo(BigInteger.ZERO) == 1; i = i
                .subtract(BigInteger.ONE)) {

            // succ(sum)
            sum = succ(sum);
        }

        // return sum
        return sum;
    }

    // def sub
    public static BigInteger sub(BigInteger s1, BigInteger s2) {

        // var retVal := s1
        BigInteger retVal = s1.add(BigInteger.valueOf(0));

        // loop(s2)
        for (BigInteger i = s2.add(BigInteger.ZERO); i.compareTo(BigInteger.ZERO) == 1; i = i
                .subtract(BigInteger.ONE)) {

            // pred(retVal)
            retVal = pred(retVal);
        }

        // return retVal
        return retVal;
    }

    // def multiply
    public static BigInteger mutliply(BigInteger s1, BigInteger s2) {
        // var retVal := s1
        BigInteger retVal = s1.add(BigInteger.ZERO);

        // pred(s2)
        s2 = pred(s2);

        // loop(s2)
        for (BigInteger i = s2.add(BigInteger.ZERO); i.compareTo(BigInteger.ZERO) == 1; i = i
                .subtract(BigInteger.ONE)) {

            // retVal := add(s1, retVal)
            retVal = add(s1, retVal);
        }

        // return retVal
        return retVal;
    }

    // def equal
    public static BigInteger equal(BigInteger s1, BigInteger s2) {
        // var retVal := 0
        BigInteger retVal = BigInteger.valueOf(0);

        // var comp1 := sub(s1, s2)
        BigInteger comp1 = sub(s1, s2);
        // var help1 := isZero(comp1)
        BigInteger help1 = isZero(comp1);

        // while(help1)
        while (help1.compareTo(BigInteger.ZERO) != 0) {

            // help1 := 0
            help1 = BigInteger.valueOf(0);

            // var comp2 := sub(s2, s1)
            BigInteger comp2 = sub(s2, s1);
            // var help2 := sub(comp2)
            BigInteger help2 = isZero(comp2);

            // while(help2)
            while (help2.compareTo(BigInteger.ZERO) != 0) {
                // retVal := 1
                retVal = BigInteger.valueOf(1);
                // help2 := 0
                help2 = BigInteger.valueOf(0);
            }
        }

        // return retVal
        return retVal;
    }

    // def isNotZero
    public static BigInteger isNotZero(BigInteger s1) {
        // var retVal := 0
        BigInteger retVal = BigInteger.valueOf(0);

        // while (s1)
        while (s1.compareTo(BigInteger.ZERO) != 0) {
            // retVal := 1
            retVal = BigInteger.valueOf(1);
            // s1 := 0
            s1 = BigInteger.valueOf(0);
        }

        // return retVal
        return retVal;
    }

    // def isZero
    public static BigInteger isZero(BigInteger s1) {
        // var retVal := 1
        BigInteger retVal = BigInteger.valueOf(1);

        // while(s1)
        while (s1.compareTo(BigInteger.ZERO) != 0) {
            // retVal := 0
            retVal = BigInteger.valueOf(0);
            // s1 := 0
            s1 = BigInteger.valueOf(0);
        }

        // return retVal
        return retVal;
    }

    public static BigInteger test(BigInteger r0, BigInteger r1) {
        System.out.println(r0);
        return r1;
    }

    // Jedes Statemant ausserhalb von Funktionen landet in der Main-Methode
    public static void main(String[] args) {
        // new Example();
        BigInteger r = new BigInteger("10");
        BigInteger i = read("i");
        BigInteger y = read("y");
        while (i.compareTo(BigInteger.ZERO) != 0) {
            System.out.println("Hello");
            i = pred(i);
        }
        in.close();
    }

}
