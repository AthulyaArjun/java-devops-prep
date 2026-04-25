/**
 * An identity matrix:
 *  1 0 0
 *  0 1 0
 *  0 0 1
 *
 *  Main diagonal → must be 1
 * All other elements → must be 0
 */

package TwoDimensionalArrays;

import java.util.Scanner;

public class IdentityMatrix_10 {
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

        boolean isIdentity = true;

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                if ((i==j) && matrix[i][j] != 1) {

                    isIdentity = false;
                    break;
                }

                else if (i!=j && matrix[i][j]!=0){
                    isIdentity = false;
                    break;
                }
            }
        }

        if (isIdentity){
            System.out.println("Its an identity matrix");
        }
        else {
            System.out.println("Not identity matrix");
        }

        sc.close();
    }
}
