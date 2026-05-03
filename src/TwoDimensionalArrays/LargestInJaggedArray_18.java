package TwoDimensionalArrays;

import java.util.Scanner;

public class LargestInJaggedArray_18 {
    public static void main(String[] args) {
        int[][] jagged = {
                {1,2},
                {3,4,5},
                {6,7,8,9}
        };

        int largest = jagged[0][0];

        for (int i=0; i<jagged.length; i++){
            for (int j=0; j<jagged[i].length; j++){
                if (jagged[i][j] > largest){
                    largest = jagged[i][j];
                }
            }
        }

        System.out.println("Largest in the jagged array is: "+largest);

    }
}
