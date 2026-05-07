package Strings;

import java.util.Scanner;

public class ReverseString_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        String reversedString = "";

        for (int i=s.length()-1; i>=0; i--){
            reversedString  += s.charAt(i);
        }

        System.out.println("Reversed string is: "+reversedString );

        sc.close();
    }
}

/**
 * Example:
 * Input  -> hello
 *
 * Index:
 * h e l l o
 * 0 1 2 3 4
 *
 * Traversal:
 * i=4 -> o
 * i=3 -> l
 * i=2 -> l
 * i=1 -> e
 * i=0 -> h
 *
 * Output -> olleh
 *
 * TC = O(n) -->loop runs n times
 * SC = O(n) --> extra string used
 */