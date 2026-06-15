/**
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return
 * the answer in any order.
 * Example 1:
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 * Input: nums = [1], k = 1
 * Output: [1]
 * Example 3:
 * Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2
 * Output: [1,2]

 * Constraints:
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 * k is in the range [1, the number of unique elements in the array].
 * It is guaranteed that the answer is unique.
 */

package LeetCodePractices.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TopKFrequentElements {
    public int[] frequent(int[] nums, int k){

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int number : nums){
            map.put(number,map.getOrDefault(number,0)+1);
        }

        return map.entrySet()
                .stream()
                .sorted((a,b) -> b.getValue() - a.getValue())
                .limit(k)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue)
                .toArray();


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of input array:");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter "+size+" elements:");
        for (int i=0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k:");
        int k = sc.nextInt();


        TopKFrequentElements elements = new TopKFrequentElements();
        int[] result = elements.frequent(nums,k);

        for (int n: result){
            System.out.print(n+" ");

        }

        sc.close();
    }
}
