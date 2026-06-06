/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * Example 1:
 * Input: nums = [2,2,1]
 * Output: 1

 * Example 2:
 * Input: nums = [4,1,2,1,2]
 * Output: 4

 * Example 3:
 * Input: nums = [1]
 * Output: 1
 */

package LeetCodePractices.Easy;
import java.util.Scanner;

public class SingleNumber {

    public static int singleNumber(int[] arr) {

        int result = 0;

        for (int num : arr) {
            result ^= num; // XOR operation
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter "+size+" elements: ");

        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int result = singleNumber(arr);

        if (result != -1){
            System.out.println(result);
        }else {
            System.out.println("No single number");
        }

        sc.close();
    }
}

/*
Done XOR since requirement is TC= O(n) and SC = O(1)
Duplicate ^ Duplicate = 0
0 ^ SingleNumber = SingleNumber
 */