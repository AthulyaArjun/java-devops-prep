/**
 * GCD - Greatest Common Divisor
 * HCF - Highest Common Factor
 *
 * HCF of two numbers is the largest number that divides both numbers exactly
 * A factor of a number is any whole number that divides the number exactly (without leaving a remainder).
 *
 * e.g.12 and 18
 * factors of 12- 1,2,3,4,6,12
 * factors of 18-1,2,3,6,9,18
 * HCF-6
 */

package BasicsPrograms;

import java.util.Scanner;

public class HCF_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        int hcf = Math.min(a,b);

        while (true){
            if ((a%hcf==0) && (b%hcf==0)){
                System.out.println("HCF is "+hcf);
                break;
            }
            hcf--;
        }

        sc.close();
    }
}
