package TwoDimensionalArrays;

import java.util.Scanner;

public class MatrixMultiplication_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows of matrix A:");
        int row = sc.nextInt();
        System.out.println("Enter number of column for matrix A (same as row of matrix B):");
        int col_row = sc.nextInt();
        System.out.println("Enter number of column of matrix B:");
        int column = sc.nextInt();

        int[][] a = new int[row][col_row];
        int[][] b = new int[col_row][column];
        int[][] c = new int[row][column];

        System.out.println("Enter "+(row*col_row)+" elements of matrix A:");
        for (int i=0; i<row; i++){
            for (int j=0; j<col_row; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter "+(col_row*column)+" elements of matrix B:");
        for (int i=0; i<col_row; i++){
            for (int j=0; j<column; j++){
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Resultant matrix after multiplication:");

        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                for (int k=0; k<col_row; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
