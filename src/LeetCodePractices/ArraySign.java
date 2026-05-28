/**
 * Implement a function signFunc(x) that returns:
 * 1 if x is positive.
 * -1 if x is negative.
 * 0 if x is equal to 0.

 * You are given an integer array nums. Let product be the product of all values in the array nums.
 * Return signFunc(product).

 * Example 1:
 * Input: nums = [-1,-2,-3,-4,3,2,1]
 * Output: 1
 * Explanation: The product of all values in the array is 144, and signFunc(144) = 1
 */

package LeetCodePractices;

import java.util.Scanner;

public class ArraySign {

    public int arraySign(int[] nums) {

        int negativeCount = 0;
        for (int i=0; i<nums.length; i++) {

            if (nums[i] < 0){
                negativeCount++;
            }

            if (nums[i] == 0){
                return 0;
            }
        }

        if (negativeCount %2 ==0){
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter "+size+" elements: ");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        ArraySign sign = new ArraySign();

        int result = sign.arraySign(arr);

        System.out.println(result);
    }
}

/*
Even number of negative numbers  -> Positive product
Odd number of negative numbers   -> Negative product
 */