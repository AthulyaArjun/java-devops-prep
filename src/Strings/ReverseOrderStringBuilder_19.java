package Strings;

import java.util.Scanner;

public class ReverseOrderStringBuilder_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String original = sc.nextLine();

        String[] words = original.split(" ");

        StringBuilder result = new StringBuilder();

        for (int i= words.length-1; i>=0; i--){
             result.append(words[i]).append(" ");
        }

        System.out.println(result);
        sc.close();
    }
}
