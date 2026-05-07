package Strings;

import java.util.Scanner;

public class WordCount_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String s = sc.nextLine();

        /**
         * trim() removes leading and trailing spaces.
         *
         * split("\\s+") splits String based on
         * one or more whitespace characters.
         */

        String[] words = s.trim().split("\\s+");

        System.out.println("Number of words: " + words.length);

        sc.close();
    }
}

/**
 * TC --> O(n)
 * SC --> O(n)
 *
 */