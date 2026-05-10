package Strings;

import java.util.Scanner;

public class RemoveDuplicateStringBuilder_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String original = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i=0; i<original.length(); i++){
            char ch = original.charAt(i);

            if (result.indexOf(String.valueOf(ch)) == -1){
                result.append(ch);
            }
        }

        System.out.println(result);
        sc.close();
    }
}

/**
 * result.indexOf(String.valueOf(ch)) == -1
 *  indexOf() expects a String, so we convert character to string using String.valueOf(ch)
 *  indexOf searches for substring inside string and returns the index of the string
 *  eg: banana indexOf(a) --> returns 1 because a is at index 1
 *  if it's not present, it will return -1
 *
 *  so this means If current character is NOT already present in result, append it
 */