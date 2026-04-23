/**
 * An Armstrong number (also called a narcissistic number) is a number that is equal to the sum of the cubes
 *  (or nth power) of its digits.
 *
 *  the below program is for a n digit armstrong number
 *
 *  e.g. 153
 */

package BasicsPrograms;

import java.util.Scanner;

public class ArmstrongNumber_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check if its a armstrong number or not: ");
        int num = sc.nextInt();

        int numForDigits = num;
        int digits = 0;

        int originalNum = num;
        int sum = 0;

        while (numForDigits !=0){
            digits++;
            numForDigits= numForDigits/10;
        }

        while (num!=0){
            int digit = num%10;
            sum = sum +(int) Math.pow(digit,digits);
            num = num/10;
        }

        if (originalNum == sum){
            System.out.println(originalNum+ " is an armstrong number");
        }
        else {
            System.out.println("It is not an armstrong number");
        }


        sc.close();

    }
}
