package TwoDimensionalArrays;

import java.util.Scanner;

public class DiagonalSum_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter "+(n*n)+" elements: ");

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int diagonalSum = 0;

        System.out.println("Diagonal elements are: ");
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                if (i==j) {
                    System.out.print(matrix[i][j]+" ");
                    diagonalSum += matrix[i][j];
                }
            }
        }
        System.out.println();

        System.out.println("Sum of main diagonal elements in the array: "+diagonalSum);

        sc.close();


    }
}
