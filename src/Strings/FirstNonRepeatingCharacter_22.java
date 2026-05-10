package Strings;

import java.util.Scanner;

public class FirstNonRepeatingCharacter_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String string = sc.nextLine();

        boolean found = false;

        for (int i=0; i<string.length(); i++){
            int count = 0;

            for (int j=0; j< string.length(); j++){
                if (string.charAt(i) == string.charAt(j)){
                    count++;
                }
            }

            if (count == 1){
                System.out.println("First Unique character:"+string.charAt(i));
                found = true;
                break;
            }
        }

        if (!found){
            System.out.println("No non repeating character found");
        }

        sc.close();
    }
}
