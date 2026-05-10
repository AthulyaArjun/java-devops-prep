package Strings;

import java.util.Scanner;

public class StringBuilderPalindrome_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String original = sc.nextLine()
                .toLowerCase()
                .replace(" ", "");

        String reversed = new StringBuilder(original)//direct StringBuilder method chaining
                .reverse()
                .toString();


        if (original.equals(reversed)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }

        sc.close();

    }
}
