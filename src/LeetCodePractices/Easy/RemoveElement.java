/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * The order of the elements may be changed. Then return the number of elements in nums which are not
 * equal to val.
 * Consider the number of elements in nums which are not equal to val be k, to get accepted,
 * you need to do the following things:
 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
 * The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 */

package LeetCodePractices.Easy;

import java.util.Scanner;

public class RemoveElement {
    public int remove(int[] nums, int val){
        int k =0;

        for (int i=0; i<nums.length; i++){
            if (nums[i] != val){
                nums[k++] = nums[i];
            }
        }

        for (int n :nums){
            System.out.print(n+" ");

        }
        System.out.println();

        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter "+size+" elements: ");
        for (int i=0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter value: ");
        int val = sc.nextInt();


        RemoveElement removeElement = new RemoveElement();

        int result = removeElement.remove(nums,val);
        System.out.println(result);

        sc.close();


    }
}
