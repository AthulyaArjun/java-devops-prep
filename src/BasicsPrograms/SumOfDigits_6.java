/**
 * To find the sum of all digits in a number
 */

package BasicsPrograms;
import java.util.Scanner;
public class SumOfDigits_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();
        num = Math.abs(num);

        int sum = 0;

        while (num!=0){
            int digit = num%10;
            sum += digit;
            num = num/10;
        }

        System.out.println("Sum of digits of number is "+sum);

        sc.close();
    }
}
