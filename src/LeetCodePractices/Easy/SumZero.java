/**
 * Given an integer n, return any array containing n unique integers such that they add up to 0.
 * Input: n = 5
 * Output: [-7,-1,1,3,4]
 */

package LeetCodePractices.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class SumZero {

    public int[] sumZero(int n) {

        int[] arr = new int[n];

        int index = 0;
        for (int i=1; i<=n/2; i++){
            arr[index++] = -i;
            arr[index++] = i;
        }

        if (n%2 != 0){
            arr[index] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();

        SumZero zero = new SumZero();

        int[] result = zero.sumZero(n);

        System.out.println(Arrays.toString(result));

    }
}
