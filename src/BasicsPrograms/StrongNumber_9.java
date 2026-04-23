/**
 * A number is called strong number if:
 *  sum of factorial of each digit = original number
 *  e.g. 145
 */

package BasicsPrograms;

import java.util.Scanner;

public class StrongNumber_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check if its a strong number or not: ");
        int num = sc.nextInt();
        int temp_num = num;
        long sum = 0;

        while (temp_num!=0){
            long factorial = 1;
            int digit = temp_num%10;
            for (int i=1; i<=digit; i++){
                factorial = factorial*i;
            }
            sum += factorial;
            temp_num = temp_num/10;
        }

        if (num == sum){
            System.out.println(num+" is a strong number");
        }
        else {
            System.out.println(num+" is not a strong number");
        }

        sc.close();
    }
}
