/**
 * for n=5
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 *
 * Formula:
 *
 * For each row, next value can be built using:
 *
 * num = num * (i - j) / j;
 *
 * where row starts from i = 0.
 */

package PatternProgramming;

import java.util.Scanner;

public class PascalsTriangle_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();



        for (int i= 1; i<=n; i++){

            int num = 1;
            for (int j=1; j<=i; j++){
                System.out.print(num+" ");
                num = num * (i-j)/j;
            }
            System.out.println();
        }

        sc.close();

    }
}
