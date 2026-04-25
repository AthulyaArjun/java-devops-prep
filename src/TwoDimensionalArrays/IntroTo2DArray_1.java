/**
 * A 2D array is an array of arrays
 * It has rows and columns
 * int[][] matrix = {
 *     {10,20,30},
 *     {40,50,60},
 *     {70,80,90}
 * }; --> declaration and initialization
 * int[][] matrix = new int[row][column];
 *
 * matrix.length --> no. of rows
 * matrix[0].length --> no. of columns
 *
 * outer loop controls rows
 * inner loop controls columns
 */

package TwoDimensionalArrays;

public class IntroTo2DArray_1 {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
