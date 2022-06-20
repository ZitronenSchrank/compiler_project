package de.hfu;

import java.io.*;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        Compiler compiler;
        if (args.length == 1) {
            compiler = new Compiler(new File(args[0]));
        } else if (args.length == 2) {
            compiler = new Compiler(new File(args[0]), new File(args[1]));
        } else {
            System.out.println("No Input File");
            System.exit(1);
            return;
        }

        if (compiler.compile()) {
            System.exit(0);
            return;
        } else {
            System.exit(1);
            return;
        }

    }
}
