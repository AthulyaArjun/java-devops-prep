/**
 * Given a string s, find the first non-repeating character in it and return its index.
 * If it does not exist, return -1.
 * Example 1:
 * Input: s = "leetcode"
 * Output: 0
 * Explanation:
 * The character 'l' at index 0 is the first character that does not occur at any other index.

 * Example 2:
 * Input: s = "loveleetcode"
 * Output: 2

 * Example 3:
 * Input: s = "aabb"
 * Output: -1
 */
package LeetCodePractices.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class FirstUniqueCharacterInString {

    public int firstUniqueChar(String s){

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first unique character
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (map.get(ch) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = scanner.nextLine().toLowerCase();

        FirstUniqueCharacterInString first = new FirstUniqueCharacterInString();

        int result = first.firstUniqueChar(s);

        System.out.println(result);

        scanner.close();
    }
}
