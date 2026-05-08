/**
 * Two strings are anagrams if they contain the same characters with the same frequency, but order can be different.
 * Example:
 * listen
 * silent
 * Both contain:
 * l, i, s, t, e, n
 * So they are anagrams.
 */

package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = sc.nextLine().toLowerCase();
        System.out.println("Enter second string:");
        String s2 = sc.nextLine().toLowerCase();

        if (s1.length()!=s2.length()){
            System.out.println("Not Anagram, lengths are different");
        }
        else {
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1,arr2)){
                System.out.println("Anagram");
            }
            else {
                System.out.println("Not anagram");
            }
        }


        sc.close();
    }
}
