/**
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the
 * range that is missing from the array.
 * Example 1:
 * Input: nums = [3,0,1]
 * Output: 2
 * Explanation:
 * n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
 * 2 is the missing number in the range since it does not appear in nums.
 */
package LeetCodePractices.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {

    public int missingNumber(int[] array) {

        Arrays.sort(array);

        // Edge Case 1: Missing 0
        if (array[0] != 0) {
            return 0;
        }

        // Check for gap between consecutive numbers
        for (int i = 0; i < array.length - 1; i++) {

            if (array[i + 1] - array[i] != 1) {
                return array[i] + 1;
            }
        }

        // Edge Case 2: Missing n
        return array.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        MissingNumber number = new MissingNumber();

        int result = number.missingNumber(array);

        System.out.println("Missing Number: " + result);

        sc.close();
    }
}