/**
 * In pattern programming, Outer loop --> rows & Inner loop --> columns
 *
 * Golden rule:
 * Outer loop controls HOW MANY LINES
 * Inner loop controls WHAT TO PRINT IN EACH LINE
 *
 * for(int i = 1; i <= rows; i++) --> rows
 *
 * for(int j = 1; j <= cols; j++) --> columns
 *  In Square star,
 * for n =4
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 */

package PatternProgramming;
import java.util.Scanner;
public class SquareStar_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This is a square star pattern program...");

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
