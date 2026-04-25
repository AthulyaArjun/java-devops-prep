/**
 * Transpose means:
 *  rows -->columns
 *  columns--> rows
 *
 *  A[i][j] --> A[j][i];
 */

package TwoDimensionalArrays;

import java.util.Scanner;

public class MatrixTranspose_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter "+(rows*columns)+" elements:");

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int[][] transpose = new int [columns][rows];

        for (int i = 0; i <matrix[0].length; i++){
            for (int j=0; j<matrix.length; j++){
                transpose[i][j] = matrix[j][i];
            }
        }

        System.out.println("Transpose matrix: ");

        for (int i=0; i<transpose.length; i++){
            for (int j=0; j<transpose[i].length; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
