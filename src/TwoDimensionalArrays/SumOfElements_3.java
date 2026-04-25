package TwoDimensionalArrays;

import java.util.Scanner;

public class SumOfElements_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];

        System.out.println("Enter "+(row*column)+" elements:");

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                sum += matrix[i][j];
            }
        }

        System.out.println("Sum of all the elements in the matrix is: "+sum);

        sc.close();
    }
}
