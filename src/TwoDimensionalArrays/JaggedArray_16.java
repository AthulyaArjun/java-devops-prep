/**
 *
 A jagged array is an array of arrays with different lengths.
 unlike a 2D array, where each row have the same number of columns, a jagged array allows each row to have
 a different number of columns.
 eg: Think of a school:
 class 1 has 3 students
 class 2 has 2 students
 class 3 has 4 students

 int[][] school = new int[3][];

 school[0] = new int[3];
 school[1] = new int[2];
 school[2] = new int[4];

 syntax:
 int[][] jagged = new int[row][]; // fixed rows, columns not fixed
 //defining columns
 jagged[0] = new int[2]; // row 0 has 2 columns
 jagged[1] = new int[4];//row 1 has 4 columns
 */

package TwoDimensionalArrays;

import java.util.Scanner;

public class JaggedArray_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[4];

        //input
        for (int i=0; i<arr.length; i++){
            System.out.println("Enter "+arr[i].length+" elements of row "+i+" :");

            for (int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //print jagged array

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}

/**
 * 🔴 1. Why jagged array?
 * Used when:
 * Data is not uniform
 * Example:
 * Student marks (different subjects)
 * Graph adjacency list
 *
 * 🔴 2. Memory Behavior
 * 👉 Each row is a separate array object
 * So:
 * Not continuous like normal 2D array
 * More flexible
 *
 * 🔴 3. Loop Rule (VERY IMPORTANT)
 * Always use:
 * arr[i].length
 * NOT:arr[0].length ❌
 *
 * 🔴 4. Common Mistake
 * int[][] arr = new int[3][];
 * arr[0][0] = 10; ❌ ERROR
 * 👉 Because columns not initialized yet
 *
 * | Feature     | 2D Array   | Jagged Array   |
 * | ----------- | ---------- | -------------- |
 * | Columns     | Fixed      | Variable       |
 * | Memory      | Continuous | Non-continuous |
 * | Flexibility | Low        | High           |
 *
 * ❓ When to use jagged?
 * 👉 When row sizes vary
 */