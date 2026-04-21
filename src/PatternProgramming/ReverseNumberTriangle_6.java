/**
 * for n=4
 * 1 2 3 4
 * 1 2 3
 * 1 2
 * 1
 */

package PatternProgramming;

import java.util.Scanner;

public class ReverseNumberTriangle_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
