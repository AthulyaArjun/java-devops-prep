package Strings;

import java.util.Scanner;

public class FrequencyCount_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String s = sc.nextLine().toLowerCase();

        /**
         * Example:
         * Input -> hello world
         *
         * Output:
         * h -> 1
         * e -> 1
         * l -> 3
         * o -> 2
         * w -> 1
         * r -> 1
         * d -> 1
         *
         * Boolean visited array is used to avoid
         * printing duplicate frequencies.
         */

        boolean[] visited = new boolean[s.length()];

        /**
         * Outer loop selects each character one by one.
         */
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            /**
             * Ignore spaces, numbers, and special characters.
             */
            if (Character.isLetter(ch)) {

                /**
                 * If character is already counted,
                 * skip it.
                 */
                if (visited[i]) {
                    continue;
                }

                int frequency = 0;

                /**
                 * Inner loop counts frequency of current character.
                 */
                for (int j = i; j < s.length(); j++) {

                    if (ch == s.charAt(j)) {
                        frequency++;
                        visited[j] = true;
                    }
                }

                System.out.println("Frequency of " + ch + " = " + frequency);
            }
        }

        sc.close();
    }
}

/**
 * TC = O(n^2) -->nested loop
 * SC = O(n) --> extra array
 */