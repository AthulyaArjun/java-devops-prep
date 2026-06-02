/**
 * A finally block contains code that executes whether an exception occurs or not.
 * try
 *  ↓
 * Exception
 *  ↓
 * catch
 *  ↓
 * finally

 * try
 *  ↓
 * No Exception
 *  ↓
 * catch skipped
 *  ↓
 * finally

 * Suppose an exception occurs while processing data.
 * You still want:
 * sc.close(); to execute.
 * Put it in:
 * finally{
 *     sc.close();
 * }
 *This guarantees cleanup.
 * The main purpose of finally is "Resource Cleanup"
 * sc.close();
 * file.close();
 * connection.close();
 * socket.close();
 * Even if an exception occurs, resources are released
 */

package ExceptionHandling;

import java.util.Scanner;

public class Finally_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            int result = a/b;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e);
        }finally {
            System.out.println("Thank you for using calculator");
            sc.close();
        }
    }
}
