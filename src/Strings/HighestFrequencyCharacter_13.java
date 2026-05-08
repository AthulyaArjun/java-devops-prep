package Strings;

import java.util.Scanner;

public class HighestFrequencyCharacter_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String s = sc.nextLine().toLowerCase();

        boolean[] visited = new boolean[s.length()];

        int highestFrequency = 1;
        char highestChar = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {

            if (visited[i]) {
                continue;
            }

            char ch = s.charAt(i);
            int frequency = 1;

            for (int j = i + 1; j < s.length(); j++) {

                if (ch == s.charAt(j)) {
                    frequency++;
                    visited[j] = true;
                }
            }

            if (frequency > highestFrequency) {
                highestFrequency = frequency;
                highestChar = ch;
            }
        }

        System.out.println("Highest frequency character: " + highestChar);
        System.out.println("Frequency: " + highestFrequency);

        sc.close();
    }
}


/**
 * Index Tracking
 * Tracks:
 * WHERE character exists
 *
 * ASCII Tracking
 * Tracks:
 * WHAT character exists
 */