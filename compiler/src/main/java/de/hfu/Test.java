package de.hfu;

import java.math.BigInteger;
import java.util.Scanner;

public class Test {

    public static BigInteger pred(BigInteger s1) {
        BigInteger retVal = s1.add(BigInteger.ZERO); // Copy S1
        retVal = retVal.subtract(BigInteger.ONE);

        if (retVal.compareTo(BigInteger.ZERO) == -1) {
            retVal = BigInteger.ZERO;
        }
        return retVal;
    }

    public static BigInteger succ(BigInteger s1) {
        return s1.add(BigInteger.ONE);
    }

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

    public static BigInteger mutliply(BigInteger s1, BigInteger s2) {
        // var retVal := s1
        BigInteger retVal = s1.add(BigInteger.ZERO);

        // pred(s2)
        s2 = pred(s2);
        for (BigInteger i = s2.add(BigInteger.ZERO); i.compareTo(BigInteger.ZERO) == 1; i = i
                .subtract(BigInteger.ONE)) {

            // retVal := add(s1, retVal)
            retVal = add(s1, retVal);
        }

        // return retVal
        return retVal;
    }

    public static BigInteger equal(BigInteger s1, BigInteger s2) {
        // var retVal := 0
        BigInteger retVal = BigInteger.valueOf(0);

        BigInteger comp1 = sub(s1, s2);
        BigInteger help1 = isZero(comp1);

        // while(help1)
        while (help1.compareTo(BigInteger.ZERO) != 0) {

            help1 = BigInteger.valueOf(0);
            BigInteger comp2 = sub(s2, s1);
            BigInteger help2 = isZero(comp2);

            // while(help2)
            while (help2.compareTo(BigInteger.ZERO) != 0) {
                // retVal := 1
                retVal = BigInteger.valueOf(1);
                help2 = BigInteger.valueOf(0);
            }
        }

        return retVal;
    }

    public static BigInteger isNotZero(BigInteger s1) {
        BigInteger retVal = BigInteger.valueOf(0);

        while (s1.compareTo(BigInteger.ZERO) != 0) {
            retVal = BigInteger.valueOf(1);
            s1 = BigInteger.valueOf(0);
        }

        return retVal;
    }

    public static BigInteger isZero(BigInteger s1) {
        BigInteger retVal = BigInteger.valueOf(1);

        while (s1.compareTo(BigInteger.ZERO) != 0) {
            retVal = BigInteger.valueOf(0);
            s1 = BigInteger.valueOf(0);
        }

        return retVal;
    }

    public static void main(String[] args) {

        BigInteger s1 = BigInteger.valueOf(10);
        BigInteger s2 = BigInteger.valueOf(20);

        System.out.println("Add");
        System.out.println(add(s1, s2));
        System.out.println(add(s2, s1));

        System.out.println("Sub");
        System.out.println(sub(s1, s2));
        System.out.println(sub(s2, s1));

        System.out.println("Multi");
        System.out.println(mutliply(s1, s2));
        System.out.println(mutliply(s2, s1));

        System.out.println("Equal");
        System.out.println(equal(s1, s2));
        System.out.println(equal(s2, s1));
        System.out.println(equal(s2, s2));

        System.out.println("IsZero");
        System.out.println(isZero(s1));
        System.out.println(isZero(s2));

        System.out.println("IsNotZero");
        System.out.println(isNotZero(s1));
        System.out.println(isNotZero(s2));

        Scanner in = new Scanner(System.in);

        System.out.print("R0 = ");
        BigInteger r0 = new BigInteger(in.nextLine());

        BigInteger result = BigInteger.valueOf(0);

        System.out.println(r0);
        System.out.println(isZero(r0));

        in.close();
    }
}
