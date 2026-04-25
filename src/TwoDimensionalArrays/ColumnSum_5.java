package TwoDimensionalArrays;

import java.util.Scanner;

public class ColumnSum_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int column = sc.nextInt();

        int[][] matrix = new int[rows][column];

        System.out.println("Enter "+(rows*column)+" elements:");

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int j=0; j<matrix[0].length; j++){
            int coulmnSum = 0;
            for (int i=0; i<matrix.length; i++){
                coulmnSum += matrix[i][j];
            }
            System.out.println("Sum of elements in column "+(j+1)+" is: "+coulmnSum);
        }

        sc.close();
    }
}
