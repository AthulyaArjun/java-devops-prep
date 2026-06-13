/**
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving
 * the order of characters. No two characters may map to the same character, but a character may map to itself.
 * Example 1:
 * Input: s = "egg", t = "add"
 * Output: true
 * Explanation:
 * The strings s and t can be made identical by:
 * Mapping 'e' to 'a'.
 * Mapping 'g' to 'd'.
 */

package LeetCodePractices.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {

        //If both strings are not the same length, they can't be isomorphic. Stop immediately.
        if (s.length() != t.length()) return false;

        //Create two empty maps. sTot stores s→t relationships. tTos stores t→s relationships.
        HashMap<Character, Character> sTot = new HashMap<>();
        HashMap<Character, Character> tTos = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            //Loop through every position. At each position, grab one character from s and one from t.
            char char_s = s.charAt(i);
            char char_t = t.charAt(i);

            //Have I seen this s character before in my map?
            if (sTot.containsKey(char_s)) {
       //Yes I've seen it — but does it map to a different t character than before? If so, conflict → return false
                if (sTot.get(char_s) != char_t) {
                    return false;
                }
            } else {
       // Never seen this s character before. But is this t character already taken by another s character? If yes → return false
                if (tTos.containsKey(char_t)){//conflict
                    return false;
                }
            }
            //"Both checks passed — safe to record this new mapping in both maps"
            sTot.put(char_s, char_t);
            tTos.put(char_t, char_s);
        }

        return true;
        //Went through every character, found zero conflicts → strings are isomorphic.
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String s = sc.next();
        String t = sc.next();

        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

        boolean result = isomorphicStrings.isIsomorphic(s,t);

        System.out.println(result);
        sc.close();

    }
}
