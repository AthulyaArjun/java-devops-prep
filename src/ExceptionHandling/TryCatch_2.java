package ExceptionHandling;

import java.util.Scanner;

public class TryCatch_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        try {
            int result = a/b;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage()+" is invalid. Exception handled. Program continues");
        }

        System.out.println("Program for Arithmetic Exception completed successfully");

        int[] array = {10,20,30,40,50};

        System.out.println("Enter an index to check in array:");
        int index = sc.nextInt();

        try {
            System.out.println(array[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage()+". Index not within range. ");
        }

        System.out.println("Program for Array Index Out of Bounds Exception completed successfully");

        sc.close();
    }
}

/**
 * What is the purpose of e.getMessage()?
 * It returns only the descriptive error message associated with the exception object without printing
 * the exception class name or stack trace.
 *
 * What does printing e do?
 * e internally calls e.toString() and returns Exception Class Name + Message
 *
 * What does e.printStacktrace() do?
 * prints entire exception stack trace
 */