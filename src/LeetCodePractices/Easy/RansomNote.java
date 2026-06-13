/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by
 * using the letters from magazine and false otherwise.
 * Each letter in magazine can only be used once in ransomNote.

 * Example 1:
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Example 2:
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * Example 3:
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 * Constraints:
 * 1 <= ransomNote.length(), magazine.length <= 105
 * ransomNote and magazine consist of lowercase English letters.
 */

package LeetCodePractices.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
//"Create an empty map to store each letter and how many times it appears in the magazine."
        HashMap<Character, Integer> map = new HashMap<>();

//"Go through every letter in the magazine. If I've seen this letter before, increment its count by 1.
// If I haven't seen it before, start its count at 1."
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
//"Now go through every letter in the ransom note."
        for (char ch : ransomNote.toCharArray()) {
            //"This letter doesn't exist in the magazine at all — impossible to construct. Return false."
            if (!map.containsKey(ch)) return false;
            //"This letter exists, but we've already used all of them up — not enough copies. Return false."
            else if (map.get(ch) <= 0) return false;
            //"Letter exists and still has count remaining — use one copy. Decrement its count by 1."
            else map.put(ch, map.get(ch) - 1);
        }
//Every letter in the ransom note was found with enough count in the magazine — return true."
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String ransomNote = sc.next().toLowerCase();
        String magazine = sc.next().toLowerCase();

        RansomNote ransom = new RansomNote();
        boolean result = ransom.canConstruct(ransomNote,magazine);

        System.out.println(result);

        sc.close();
    }
}

/*
map.getOrDefault(key, defaultValue) means:
"Get the value for this key from the map. If the key doesn't exist, return the default value instead."
map.getOrDefault(ch, 0)
"Get the current count of ch from the map. If ch is not in the map yet, return 0."
 */