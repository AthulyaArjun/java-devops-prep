package TwoDimensionalArrays;

import java.util.Scanner;

public class JaggedArraySum_17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] jagged = new int[3][];

        jagged[0] = new int[2];
        jagged[1] = new int[3];
        jagged[2] = new int[4];

        /*
        int[][] jagged = {
        {1,2},
        {3,4,5},
        {6,7,8,9}
        };
         */

        //Input
        for (int i=0; i<jagged.length; i++){
            System.out.println("Enter "+jagged[i].length+" elements of row "+i+":");

            for (int j=0; j<jagged[i].length; j++){
                jagged[i][j] = sc.nextInt();
            }
        }

        //sum of jagged array



        for (int i=0; i<jagged.length; i++){
            int sum = 0;
            for (int j=0; j<jagged[i].length; j++){
                sum += jagged[i][j];
            }
            System.out.println("Sum of row"+(i+1)+" is: "+sum);
        }

        sc.close();
    }
}
