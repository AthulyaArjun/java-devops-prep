/**
 * Packages in Java are used to group related classes and interfaces together. They help in organizing code,
 * avoiding name conflicts, and controlling access using access modifiers.
 * i.e., Better code organization
 * •	Namespace management (prevents class name conflicts)
 * •	Access protection (public, protected, default, private)
 * •	Code reusability
 */


package BasicsJava;

/**
 * This class demonstrates the structure of a basic java program
 *It prints Hello World to the console
 */

public class JavaProgramStructure_1 {
    public static void main(String[] args) {
        /**
         * The main method is the entry point of any Java application.
         * When you run the program, the JVM looks for this method to start execution.
         */
        System.out.println("Hello World!");
    }
}

/**
 *In java, every line of code that needs to be run should be inside a class.
 *   Basic syntax of a java program is class --> method -->statement
 *   main method is the entry point of any java program
 *   main should be written in this specific format
 *   public-- anyone can access it, this is needed so JVM can access it outside the class
 *   static-- means you don't need to create an object to run this method.JVM calls it directly.
 *   void-- shows this method doesn't return anything
 *   main-- starting point of every java application
 *   String[] args-- this allows us to pass command-line arguments when running the program
 *   System.out.println()-- it is built in method to print output into console
 *   println() is a method of PrintStream class
 *   System is a class
 *   out is an object of PrintStream
 */

// this is single line comment

/*
This is a
multi-line
comment
 */