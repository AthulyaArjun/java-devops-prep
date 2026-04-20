/**
 * Program to check if a given number is prime or not
 */

package BasicsPrograms;
import java.util.Scanner;
public class PrimeNumber_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime){
            System.out.println(num+" is prime");
        }
        else {
            System.out.println(num+" is not prime");
        }

        sc.close();
    }
}
