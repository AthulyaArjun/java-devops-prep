package TwoDimensionalArrays;

import java.util.Scanner;

public class SearchElement_13 {
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

        System.out.println("Enter target to check:");
        int target = sc.nextInt();

        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                if (matrix[i][j] == target){
                    System.out.println("Target found at index "+i+" & "+j);
                    return;
                }
            }

        }

            System.out.println("Target not in matrix");

        sc.close();
    }
}
