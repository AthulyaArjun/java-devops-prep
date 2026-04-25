package TwoDimensionalArrays;

import java.util.Scanner;

public class MatrixAddition_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        int columns = sc.nextInt();

        int[][] matrixA = new int[rows][columns];
        int[][] matrixB = new int[rows][columns];

        int[][] result = new int[rows][columns];

        System.out.println("Enter "+(rows*columns)+" elements for matrix A:");
        for (int i = 0; i< matrixA.length; i++){
            for (int j = 0; j< matrixA[i].length; j++){
                matrixA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter "+(rows*columns)+" elements for matrix b:");
        for (int i = 0; i< matrixB.length; i++){
            for (int j = 0; j< matrixB[i].length; j++){
                matrixB[i][j] = sc.nextInt();
            }
        }

        System.out.println("Result Matrix Addition:");

        for (int i = 0; i< matrixA.length; i++){
            for (int j = 0; j< matrixA[i].length; j++){
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        for (int i=0; i<result.length; i++){
            for (int j=0; j< result[i].length; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();

    }
}
