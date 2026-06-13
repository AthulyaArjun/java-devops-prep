/**
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 * Example 1:
 * Input: nums = [3,2,3]
 * Output: 3
 * Example 2:
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 * Constraints:
 * n == nums.length
 * 1 <= n <= 5 * 10^4
 * -10^9 <= nums[i] <= 10^9
 * The input is generated such that a majority element will exist in the array.
 */

package LeetCodePractices.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {

    public int majority(int[] nums){

        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length/2;

        for (int number : nums){
                map.put(number,map.getOrDefault(number,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            int i = entry.getValue();

            if (i>n){
                return entry.getKey();
            }
        }

        System.out.println(map);

        return -1;
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

        MajorityElement majorityElement = new MajorityElement();
        int result = majorityElement.majority(nums);
        System.out.println(result);
        if (result == -1){
            System.out.println("No majority element");
        }

        sc.close();

    }
}
