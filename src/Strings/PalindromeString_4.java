package Strings;

import java.util.Scanner;

public class PalindromeString_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine().toLowerCase();

        String reversedString = "";

        for (int i=s.length()-1; i>=0; i--){
            reversedString += s.charAt(i);
        }

        if (s.equals(reversedString)){
            System.out.println(s+" is palindrome");
        }
        else {
            System.out.println(s+" is not palindrome");
        }

        sc.close();
    }
}
