package Strings;

import java.util.Scanner;

public class OnlyDigits_26 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String:");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("Empty string");
            return;
        }

        boolean onlyDigits = true;

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            if (!Character.isDigit(ch)) {

                System.out.println("Invalid, contains non-digit characters");

                onlyDigits = false;
                break;
            }
        }

        if (onlyDigits) {
            System.out.println("Valid, contains only digits");
        }

        scanner.close();
    }
}