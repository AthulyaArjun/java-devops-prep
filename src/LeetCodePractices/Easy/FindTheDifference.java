package LeetCodePractices.Easy;

import java.util.Scanner;

public class FindTheDifference {
    public char difference(String s, String t){
        char result = 0;
        for (char ch : s.toCharArray()){
            result ^= ch;
        }

        for (char ch: t.toCharArray()){
            result ^= ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string s:");
        String s = sc.next();
        System.out.println("Enter string t:");
        String t = sc.next();

        FindTheDifference difference = new FindTheDifference();

        char output = difference.difference(s,t);
        System.out.println(output);
        sc.close();

    }
}
