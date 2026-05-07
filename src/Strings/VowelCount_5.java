package Strings;

import java.util.Scanner;

public class VowelCount_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine().toLowerCase();

        int vowel = 0;
        int consonant = 0;
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowel++;
                }
                else {
                    consonant++;
                }
            }
        }

        System.out.println("Vowels: "+vowel);
        System.out.println("Consonants: "+consonant);

        sc.close();
    }
}


/**
 * TC = O(n) --> Loop traverses string once
 * SC = O(1) --> very few variables
 *
 * Character.isDigit()
 * Character.isUpperCase()
 * Character.isLowerCase()
 * Character.isWhitespace()
 */