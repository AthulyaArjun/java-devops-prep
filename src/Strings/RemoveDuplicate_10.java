package Strings;

import java.util.Scanner;

public class RemoveDuplicate_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String s = sc.nextLine().toLowerCase();

        boolean[] visited = new boolean[256]; //ASCII based tracking
        String result = "";

        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(!visited[ch]){
                result = result+ch;
                visited[ch] = true;
            }
        }

        System.out.println(result);



        sc.close();
    }
}
/**
 * 1. Why 256?
 *
 * ASCII characters count = 256
 * So:
 * visited[ch]
 * uses character ASCII value as index.
 * Example:
 * visited['a']
 * means:
 * visited[97]
 */