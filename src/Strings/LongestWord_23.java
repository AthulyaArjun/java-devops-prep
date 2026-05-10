package Strings;

import java.util.Scanner;

public class LongestWord_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String sentence = sc.nextLine();

        if (sentence.isEmpty()) {
            System.out.println("Empty sentence");
            return;
        }

        String[] words = sentence.split(" ");

        String longest = words[0];

        for (int i=1; i<words.length; i++){
            if(words[i].length() > longest.length()){
                longest = words[i];
            }
        }

        System.out.println("Longest word: "+longest);
        sc.close();
    }
}
