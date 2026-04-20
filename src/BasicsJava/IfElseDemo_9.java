/**
 * if-else is used when we want one block if condition is true, another block if condition is false
 * if (condition) {
 *     // true block
 * } else {
 *     // false block
 * }
 *
 * if true --> if block executes
 * if false --> else block executes
 *
 * if
 * Executes block only when condition is true
 *
 * if-else
 * Handles both true and false conditions
 */

package BasicsJava;
import java.util.Scanner;
public class IfElseDemo_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (num%2 == 0){
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }

        sc.close();
    }
}
