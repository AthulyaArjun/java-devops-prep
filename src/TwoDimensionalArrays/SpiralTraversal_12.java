/**
 * 1   2   3   4
 * 5   6   7   8
 * 9  10  11  12
 * 13 14  15  16
 *
 * output --> 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
 */

package TwoDimensionalArrays;

import java.util.Scanner;

public class SpiralTraversal_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int row = sc.nextInt();

        System.out.println("Enter number of columns:");
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];

        System.out.println("Enter " + (row * column) + " elements:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // 🔥 Spiral Traversal Logic

        int top = 0;
        int bottom = row - 1;
        int left = 0;
        int right = column - 1;

        System.out.println("Spiral Traversal:");

        while (top <= bottom && left <= right) {

            // 1️⃣ Left → Right
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // 2️⃣ Top → Bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // 3️⃣ Right → Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // 4️⃣ Bottom → Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }

        sc.close();
    }
}