/**
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * Explanation:
 * The element 1 occurs at the indices 0 and 3.

 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 * Explanation:
 * All elements are distinct.

 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true

 *Constraints:
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109

 * My analysis
 * Input --> int[] array
 * Output --> boolean true/false
 * Array cannot be empty, at least 1 element and maximum 105 elements
 * Numbers in the array can be positive and negative in the range -109 to 109
 *
 * Approach: ArrayList input, take each element and add into HashSet which doesn't take duplicates
 * If HashSet size and ArrayList size doesn't equal, then return false, else true
 */

package LeetCodePractices.Easy;
import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] array){
        HashSet<Integer> set = new HashSet<>();

        for(int num : array){

            if(set.contains(num)){
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        ContainsDuplicate duplicate = new ContainsDuplicate();
        boolean result = duplicate.containsDuplicate(array);

        System.out.println(result);

        sc.close();
    }
}
