/**
 * for n=4
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 */
package PatternProgramming;

import java.util.Scanner;

public class ContinuousNumber_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int start = 1;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(start+" ");
                start++;
            }
            System.out.println();
        }
        sc.close();

    }
}
