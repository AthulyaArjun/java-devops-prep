package Strings;

import java.util.Scanner;

public class CountWords_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String string = sc.nextLine().trim();

        if (string.isEmpty()){
            System.out.println("Empty string");
            return;
        }

        String[] words = string.split("\\s+");

        System.out.println("Number of words: "+words.length);

        sc.close();

    }
}
