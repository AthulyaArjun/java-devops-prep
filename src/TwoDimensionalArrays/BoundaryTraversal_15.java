/**
 *
 * input--> 1 2 3
 *          4 5 6
 *          7 8 9
 *          1 2 3 6 9 8 7 4
 */


package TwoDimensionalArrays;

import java.util.Scanner;

public class BoundaryTraversal_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row and column of matrix:");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter "+(n*n)+" elements:");

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Boundary elements:");

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

// 1. Top row
        for (int i = left; i <= right; i++) {
            System.out.print(matrix[top][i] + " ");
        }

// 2. Right column
        for (int i = top + 1; i <= bottom; i++) {
            System.out.print(matrix[i][right] + " ");
        }

// 3. Bottom row
        for (int i = right - 1; i >= left; i--) {
            System.out.print(matrix[bottom][i] + " ");
        }

// 4. Left column
        for (int i = bottom - 1; i > top; i--) {
            System.out.print(matrix[i][left] + " ");
        }

        sc.close();

    }
}
