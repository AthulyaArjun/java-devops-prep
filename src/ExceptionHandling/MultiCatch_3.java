/**
 * In scenarios where multiple exceptions can happen, we handle them separately using multiple catch blocks.
 * try {
    // risky code
  }catch (ArithmeticException e){
     System.out.println("Cannot divide by zero");
  }
 catch (ArrayIndexOutOfBoundsException e){
    System.out.println("Invalid array index");
 }
 * catch blocks are checked from top to bottom. The first matching block executes
 * Rule:Child exception first
 * Parent exception later
 */

package ExceptionHandling;

import java.util.Scanner;

public class MultiCatch_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {10,20,30};

        System.out.println("Enter array index:");
        int index = scanner.nextInt();

        System.out.println("Enter divisor: ");
        int divisor = scanner.nextInt();

        try {
            System.out.println(array[index]);// if exception happens here, control goes to the catch block
            System.out.println(100/divisor);// this is not printed even though if no exception at this step
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage()+". Invalid index");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage()+" is not valid.");
        }

        System.out.println("Program completed");

        scanner.close();
    }
}

/*
As soon as exception occurs:
try block stops
↓
matching catch executes
↓
control moves after catch
Only one exception is handled per execution path.
 */