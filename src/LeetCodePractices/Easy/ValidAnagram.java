package LeetCodePractices.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {
    public boolean isAnagram(String s, String t){
        if (s.length() != t.length()){
            return false;
        }

        else {
            char[] arr1 = s.toCharArray();
            char[] arr2 = t.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1,arr2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s = sc.nextLine().toLowerCase();
        System.out.println("Enter second string: ");
        String t = sc.nextLine().toLowerCase();

        ValidAnagram anagram = new ValidAnagram();

       boolean result = anagram.isAnagram(s,t);

        System.out.println(result);

        sc.close();
    }
}
