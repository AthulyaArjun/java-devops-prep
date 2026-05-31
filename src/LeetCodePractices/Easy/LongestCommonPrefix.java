/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Constraints:
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters if it is non-empty.

 * Input:
 * String[]
 * Output:
 * String
 * Need:
 * Longest common starting substring amongst all strings
 * Data Structure:
 * No special data structure needed
 * Variables:
 * String prefix
 * Approach:
 * Assume first string is prefix.
 * Compare with every other string.
 * If current string doesn't start with prefix,
 * keep reducing prefix length.
 * Return remaining prefix.
 * Edge Cases:
 * [""] -> ""
 * ["flower"] -> "flower"
 * ["dog","racecar","car"] -> ""
 */

package LeetCodePractices.Easy;

import java.util.Scanner;

public class LongestCommonPrefix {

   public String longestCommonPrefix(String[] string){

           String prefix = string[0];

           for (int i = 1; i < string.length; i++) {

               while (!string[i].startsWith(prefix)) {

                   prefix = prefix.substring(0, prefix.length() - 1);

                   if (prefix.isEmpty()) {
                       return "";
                   }
               }
           }

           return prefix;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of String: ");
        int n = sc.nextInt();
        String[] string = new String[n];

        sc.nextLine();
        System.out.println("Enter "+n+" Strings:");
        for (int i=0; i<n; i++){
            string[i] = sc.nextLine();
        }

        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String result = lcp.longestCommonPrefix(string);
        if (result.isEmpty()){
            System.out.println("\"\"");
        }
        System.out.println(result);
        sc.close();
    }
}

/*
| Method         | Purpose                |
| -------------- | ---------------------- |
| `startsWith()` | begins with prefix     |
| `endsWith()`   | ends with suffix       |
| `contains()`   | contains substring     |
| `substring()`  | extract part of string |
| `indexOf()`    | find position          |
| `charAt()`     | get character          |
| `equals()`     | compare content        |

 */