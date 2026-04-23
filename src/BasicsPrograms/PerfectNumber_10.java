/**
 *A perfect number is a number that is equal to the sum of all its divisors(excluding itself)
 * e.g. 6 ---> divisors are 1,2,3 so 1+2+3=6 so it's a perfect number
 * A number can never have a proper divisor greater than num / 2
 */

package BasicsPrograms;

import java.util.Scanner;

public class PerfectNumber_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum = 0;

        for (int i =1; i<=num/2; i++){
            if (num%i==0){
                sum = sum+i;
            }
        }

        if (num == sum){
            System.out.println(num+" is a perfect number");
        }
        else {
            System.out.println(num+" is not a perfect number");
        }

        sc.close();
    }
}
