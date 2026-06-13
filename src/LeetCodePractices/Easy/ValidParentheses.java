/**
 * | Pattern | Key Data Structure | Typical Clue in Problem |
 * | Sliding Window | Array + Pointers | "subarray", "substring", "contiguous" |
 * | Two Pointers | Array | Sorted input, pairs, palindrome |
 * | Fast & Slow Pointers | LinkedList | Cycle detection |
 * | HashMap / Frequency | HashMap | "count", "duplicate", "seen before" |
 * | Stack | Stack | Matching brackets, "next greater element" |
 * | BFS | Queue | Shortest path, level-by-level |
 * | DFS / Backtracking | Recursion + Stack | All combinations, permutations |
 * | Binary Search | Array | Sorted input, "find minimum/maximum" |
 * | Heap / Priority Queue | PriorityQueue | "top K", "kth largest" |
 * | Dynamic Programming | Array / Memo table | "how many ways", "min/max cost" |

 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input
 * string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * Example 1:
 * Input: s = "()"
 * Output: true
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 * Input: s = "(]"
 * Output: false
 * Example 4:
 * Input: s = "([])"
 * Output: true
 * Example 5:
 * Input: s = "([)]"
 * Output: false

 * Constraints:
 * 1 <= s.length <= 10^4
 * s consists of parentheses only '()[]{}'.
 */

/**
 * Input--> String s
 * Output --> boolean
 */
package LeetCodePractices.Easy;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s){

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if (c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if (c== ')' && top!= '(') return false;
                if (c== ']' && top!= '[') return false;
                if (c== '}' && top!= '{') return false;

            }
        }
         return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        ValidParentheses valid = new ValidParentheses();

        boolean result =  valid.isValid(s);

        System.out.println("Is the entered string valid?: "+result);

        sc.close();
    }
}

/**
 * Whenever order matters and the last thing in must come out first → think Stack.
 * Other problems that use this exact same pattern:
 * Evaluate Reverse Polish Notation
 * Daily Temperatures
 * Next Greater Element
 * Min Stack
 */

/*
String: " { [ ] } "
Char   Stack        Action
─────────────────────────────
 {     [ { ]        push
 [     [ {, [ ]     push
 ]     [ { ]        top is '[' ✅ → pop
 }     [ ]          top is '{' ✅ → pop
end    empty        ✅ return true

String: " ( ] "
Char   Stack     Action
────────────────────────
 (     [ ( ]     push
 ]     [ ( ]     top is '(' ≠ ']' ❌ → return false
 */