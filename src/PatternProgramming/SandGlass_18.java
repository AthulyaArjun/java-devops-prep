/**
 *  for n=5
 * * * * * *
 *  * * * *
 *   * * *
 *    * *
 *     *
 *    * *
 *   * * *
 *  * * * *
 * * * * * *
 */

package PatternProgramming;

import java.util.Scanner;

public class SandGlass_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // upper inverted pyramid

        for (int i=n; i>=1; i--){
            for (int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //lower pyramid

        for (int i=2; i<=n; i++){
            for (int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
