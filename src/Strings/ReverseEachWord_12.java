package Strings;

import java.util.Scanner;

public class ReverseEachWord_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s = sc.nextLine();

        String result = "";

        String[] words = s.trim().split("\\s+");

        for (int i=0; i<words.length; i++){
            String word = words[i];

            for (int j=word.length()-1; j>=0; j--){
                result += word.charAt(j);
            }

            result += " ";

        }



        System.out.println("Reverse= "+result);
        sc.close();
    }
}
