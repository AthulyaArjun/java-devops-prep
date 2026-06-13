/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Explanation:
 * There is no string in strs that can be rearranged to form "bat".
 * The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
 * The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
 * Example 2:
 * Input: strs = [""]
 * Output: [[""]]
 * Example 3:
 * Input: strs = ["a"]
 * Output: [["a"]]

 * Constraints:
 * 1 <= strs.length <= 104
 * 0 <= strs[i].length <= 100
 * strs[i] consists of lowercase English letters.
 */

package LeetCodePractices.Easy;

import java.util.*;

public class GroupAnagram {

    public List<List<String>> groupAnagrams(String[] strs) {

        // map: sorted word → list of anagrams
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String word : strs) {

            // step 1: sort the word to get the key
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);  // e.g. "eat" → "aet"

            // step 2: if key doesn't exist, create a new list
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            // step 3: add the word to its group (works for both new and existing keys)
            map.get(sorted).add(word);
        }

        // step 4: return all the groups
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of words: ");
        int n = sc.nextInt();

        String[] strs = new String[n];

        System.out.println("Enter " + n + " words: ");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next().toLowerCase();
        }

        GroupAnagram obj = new GroupAnagram();
        List<List<String>> result = obj.groupAnagrams(strs);

        System.out.println("Grouped Anagrams: ");
        for (List<String> group : result) {
            System.out.println(group);
        }

        sc.close();
    }
}