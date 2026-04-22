/**
 * for n=5
 * A
 * A B
 * A B C
 * A B C D
 * A B C D E
 */
package PatternProgramming;

import java.util.Scanner;

public class AlphabetTriangle_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            char ch = 'A';

            for (int j=1; j<=i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }

        sc.close();
    }
}
