package Strings;

import java.util.Scanner;

public class StringCompression_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String s = sc.nextLine().toLowerCase();

        String result = "";

        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == s.charAt(i + 1)) {

                count++;

            } else {

                result = result + s.charAt(i) + count;
                count = 1;
            }
        }

        // Last character handling
        result = result + s.charAt(s.length() - 1) + count;

        System.out.println("Compressed String:");
        System.out.println(result);

        sc.close();
    }
}