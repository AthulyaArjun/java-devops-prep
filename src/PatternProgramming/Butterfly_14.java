/**
 * for n=5
 *              *        *
 *              **      **
 *              ***    ***
 *              ****  ****
 *              **********
 *              ****  ****
 *              ***    ***
 *              **      **
 *              *        *
 */

package PatternProgramming;

import java.util.Scanner;

public class Butterfly_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n= sc.nextInt();

        //upper wings
        //left star

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }

            //middle space

            for (int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }

            //right star
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();

        }

        //lower wings

        //left star
        for (int i=n-1; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");

            }

            //middle space
            for (int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }

            //right star
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }


        sc.close();

    }
}
