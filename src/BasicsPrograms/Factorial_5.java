/**
 * Factorial of a number
 */

package BasicsPrograms;
import java.util.Scanner;
public class Factorial_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers");
        }
        else if (n > 20) {
            System.out.println("Number greater than 20 not supported!");
        } else if (n == 0) {
            System.out.println("Factorial of zero is 1");
        } else {
            long factorial = 1;
            int i = 1;

            while (i <= n) {
                factorial = factorial * i;
                i++;
            }

            System.out.println("Factorial of " + n + " is " + factorial);
        }
        sc.close();
    }
}
