package Strings;

import java.util.Scanner;

public class StringCompressionStringBuilder_21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String s = sc.nextLine();

        if (s.isEmpty()) {
            System.out.println("Empty String");
            return;
        }

        StringBuilder result = new StringBuilder();

        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == s.charAt(i + 1)) {

                count++;

            } else {

                result.append(s.charAt(i))
                        .append(count);

                count = 1;
            }
        }

        result.append(s.charAt(s.length() - 1))
                .append(count);

        System.out.println(result);

        sc.close();
    }
}