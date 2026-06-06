/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must be unique, and you may return the result in any order.
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Explanation: [4,9] is also accepted.
 * Constraints:
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 */

package LeetCodePractices.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfArray {
    public int[] intersection(int[] nums1, int[] nums2){

        HashSet<Integer> set1 = new HashSet<>();

        for (int num : nums1){
            set1.add(num);
        }

        HashSet<Integer> result = new HashSet<>();

        for (int num : nums2){
            if(set1.contains(num)){
                result.add(num);
            }
        }

        int[] array = new int[result.size()];
        int index = 0;
        for (int num : result){
            array[index++]= num;
        }

        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of two arrays:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] nums1 = new int[a];
        int[] nums2 = new int[b];

        System.out.println("Enter "+a+" elements: ");
        for (int i=0; i<a; i++){
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter "+b+" elements: ");
        for (int i=0; i<b; i++){
            nums2[i] = sc.nextInt();
        }

        IntersectionOfArray array = new IntersectionOfArray();

        int[]  output = array.intersection(nums1,nums2);

        System.out.println(Arrays.toString(output));


        sc.close();
    }
}
