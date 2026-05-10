package Strings;

import java.util.Scanner;

public class FirstRepeatingCharacter_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String:");
        String input = scanner.nextLine();

        if (input.isEmpty()){
            System.out.println("Empty string");
            return;
        }

        boolean found = false;

        for (int i = 0; i< input.length(); i++){
            int count = 0;
            for (int j = 0; j< input.length(); j++){
                if (input.charAt(i) == input.charAt(j)){
                    count++;
                }
            }
            if (count>1){
                System.out.println("First repeating character: "+ input.charAt(i));
                found = true;
                break;
            }
        }

        if (!found){
            System.out.println("No repeating character in word");
        }

        scanner.close();
    }
}
