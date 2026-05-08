package Strings;

import java.util.Scanner;

public class ToggleCase_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();

        String result = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {

                if (Character.isUpperCase(ch)) {
                    result += Character.toLowerCase(ch);
                } else {
                    result += Character.toUpperCase(ch);
                }

            } else {
                result += ch;
            }
        }

        System.out.println("Result : " + result);

        sc.close();
    }
}