/**
 * You are given a large integer represented as an integer array digits, where each digits[i] is the
 * ith digit of the integer. The digits are ordered from most significant to least significant in
 * left-to-right order. The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 * Example 1:
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * Example 2:
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 */

package LeetCodePractices.Easy;

import java.util.Scanner;

public class PlusOne {
    public int[] plusOne(int[] digits){

        for (int i=digits.length-1; i>=0; i--){
            if (digits[i]<9){
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length+1];

        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] digits = new int[size];

        System.out.println("Enter "+size+" elements:");
        for (int i=0; i<size; i++){
            digits[i] = sc.nextInt();
        }

        PlusOne plus = new PlusOne();
        int[] output = plus.plusOne(digits);

        for (int n : output){
            System.out.println(n);
        }
    }
}
