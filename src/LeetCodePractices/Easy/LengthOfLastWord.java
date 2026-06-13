package LeetCodePractices.Easy;

import java.util.Scanner;

public class LengthOfLastWord {
    public int length(String s){
        int count = 0;
        int i = s.length()-1;

        while (i>=0 && s.charAt(i) == ' '){
            i--;
        }

        while (i>=0 && s.charAt(i) != ' '){
            count++;
            i--;
        }

        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine();

        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

        int result = lengthOfLastWord.length(s);
        System.out.println(result);

        sc.close();
    }
}
