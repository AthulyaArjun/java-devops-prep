/**
 * Used when we want to execute code only if the condition is true.
 *
 * if(condition){
 *     //code to execute
 * }
 *
 * condition must always return a boolean value
 *
 * Difference between if and ternary operator?
 * if(){
 *
 * }
 * Used for executing blocks of code
 *
 * ternary
 *String result = (age >= 18) ? "Adult" : "Minor";
 *
 * Used for assigning values in short form
 */

package BasicsJava;

import java.util.Scanner;

public class IfDemo_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (num>0){
            System.out.println(num+" is a positive number");
        }

        sc.close();
    }
}
