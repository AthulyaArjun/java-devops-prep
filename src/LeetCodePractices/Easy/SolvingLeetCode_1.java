package LeetCodePractices.Easy;

public class SolvingLeetCode_1 {
    public static void main(String[] args) {
        /**
         * Before writing code
         * 1. Understand the input and output
         * Ask: what is given?
         * What should I return?
         * example: int[] nums
         * return int
         * So method becomes public int methodName(int[] nums){}

         * 2. Check constraints
         * Ask: Can array be empty?
         * Can numbers be negative?
         * Are duplicates allowed?
         * should I return index or value?
         * This decides logic

         * 3. Identify the problem type
         * | Problem says                      | Think                     |
         * | --------------------------------- | ------------------------- |
         * | count / frequency                 | HashMap                   |
         * | duplicate / unique                | HashSet                   |
         * | order matters                     | ArrayList / LinkedHashMap |
         * | smallest / largest repeatedly     | PriorityQueue             |
         * | first/last/removal from both ends | Deque                     |
         * | compare every pair                | nested loops              |
         * | sorted array                      | two pointers              |
         * | subarray/window                   | sliding window            |
         * | prefix/range sum                  | prefix sum                |
         * | the longest common prefix         | Character comparison/String traversal|

         * 4. Decide data structure
         * Need count?          HashMap
         * Need uniqueness?     HashSet
         * Need ordering?       ArrayList / LinkedHashMap
         * Need fast lookup?    HashSet / HashMap
         * Need queue behavior? Queue
         * Need stack behavior? Stack / ArrayDeque
         * Need priority?       PriorityQueue

         * 5. Decide variables.
         * Variables usually come from what we need to track.
         * example: count, max etc

         * 6. Decide loop type
         * Usually for loop when index is needed
         * Enhanced for loop when index is not needed

         * 7. Dry run with small example
         * Before code, test in head
         * nums = [2, 7, 11, 15]
         * target = 9
         * Track variable changes

         * 8. Write brute force first
         * for i
         *    for j
         *       if nums[i] + nums[j] == target
         * Then optimize

         * 9. Always think edge cases
         * empty input
         * one element
         * duplicates
         * negative numbers
         * zero
         * already sorted
         * all same values

         * 10. Only then code
         * First write:
         * // input:
         * // output:
         * // approach:
         * // variables:
         * // edge cases:
         */

        System.out.println("This is a documentation page on how to solve programs");
    }
}
