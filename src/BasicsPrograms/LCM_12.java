/**
 *LCM - lowest common multiple
 * LCM of two numbers is the smallest positive number divisible by both numbers
 * 4,6
 * multiples of 4- 4,8,12,16,20.....
 * multiples of 6- 6,12,18,24,30...
 * LCM-12
 */

package BasicsPrograms;

import java.util.Scanner;

public class LCM_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        int lcm = Math.max(a,b);

        while (true){
            if ((lcm%a==0) && (lcm%b==0)){
                System.out.println("LCM is: "+lcm);
                break;
            }
            lcm++;
        }

        sc.close();
    }
}
