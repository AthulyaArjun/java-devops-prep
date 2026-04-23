/**
 * A fibonacci series is a sequence where: next number = previous number + before previous number
 * e.g. 0 1 1 2 3 5 8 13 21
 *
 * its called sliding window logic
 */

package BasicsPrograms;

import java.util.Scanner;

public class fibonacci_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the stop count of your fibonacci series:");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.print(a+" ");
        System.out.print(b+" ");


        for (int i=2; i<n; i++){
            int next = a+b;
            a = b;
            b = next;
            System.out.print(next+" ");
        }

        sc.close();
    }
}
