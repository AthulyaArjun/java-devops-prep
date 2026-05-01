/**
 * 1  2  3
 * 4  5  6
 * 7  8  9
 *
 * output -->
 * 7  4  1
 * 8  5  2
 * 9  6  3
 *
 * works only for square matrix
 */

package TwoDimensionalArrays;
import java.util.Scanner;

public class RotateClockwise_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of matrix:");
        int n = sc.nextInt();


        int[][] matrix = new int[n][n];

        System.out.println("Enter " + (n * n) + " elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //1.transpose of matrix

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //2. reverse each row

        for (int i=0; i<n; i++){
            int left = 0;
            int right = n-1;

            while (left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        sc.close();
    }
}
