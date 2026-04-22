/**
 * for n=5
 *          *
 *         * *
 *        *   *
 *       *     *
 *      *********
 */

package PatternProgramming;

import java.util.Scanner;

public class HollowPyramid_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i-1); j++){
                if ((i==n) || (j==1) || (j==(2*i-1))){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }

        sc.close();
    }
}
