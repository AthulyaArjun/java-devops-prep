/**
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j
 * in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 *Example 1:
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * Example 2:

 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * Example 3:

 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false

 * Constraints:
 * 1 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 * 0 <= k <= 10^5
 *
 * My Analysis:
 * 1. Input --> int[] nums, and int k
 * output --> boolean true/false
 * 2. Constraints: array length should be from 1 to 10^5. Empty array not valid
 * Each number in array can be from -10^9 to 10^9 so both positive and negative can exist
 * K can be from 0 to 10^5
 * 3. Approach --> if duplicate element exists, return indices. then check if the difference between the
 * indices is <=k. if yes, return true, else false
 * Data structure:HashMap required.
 */

package LeetCodePractices.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class ContainsDuplicateII {

    public boolean containDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {

                int previousIndex = map.get(nums[i]);

                if (i - previousIndex <= k) {
                    return true;
                }
            }

            map.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter k: ");
        int k = sc.nextInt();

        ContainsDuplicateII duplicateII = new ContainsDuplicateII();

        boolean result = duplicateII.containDuplicate(nums, k);

        System.out.println(result);

        sc.close();
    }
}