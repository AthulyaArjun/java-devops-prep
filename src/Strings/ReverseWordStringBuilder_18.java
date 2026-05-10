package Strings;

import java.util.Scanner;

public class ReverseWordStringBuilder_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String original = sc.nextLine();

        String[] words = original.split(" ");

        String result = "";

        for (String word : words){
            String reversedWord = new StringBuilder(word)
                    .reverse()
                    .toString();

            result += reversedWord +" ";
        }

        System.out.println("Reversed words: "+result);

        sc.close();
    }
}
