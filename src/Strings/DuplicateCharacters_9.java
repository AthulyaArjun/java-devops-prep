package Strings;

import java.util.Scanner;

public class DuplicateCharacters_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String s = sc.nextLine().toLowerCase();

        /**
         * Example:
         * Input -> programming
         *
         * Output:
         * r -> 2
         * g -> 2
         * m -> 2
         *
         * Boolean visited array is used to avoid
         * printing duplicate characters multiple times.
         */

        boolean[] visited = new boolean[s.length()];

        /*
         * Outer loop selects each character one by one.
         */
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            /*
             * Ignore spaces, numbers, and special characters.
             */
            if (Character.isLetter(ch)) {

                /*
                 * If character is already counted,
                 * skip it.
                 */
                if (visited[i]) {
                    continue;
                }

                int frequency = 1;

                /*
                 * Inner loop checks remaining characters
                 * and counts duplicates.
                 */
                for (int j = i + 1; j < s.length(); j++) {

                    if (ch == s.charAt(j)) {
                        frequency++;
                        visited[j] = true;
                    }
                }

                /*
                 * Print only duplicate characters.
                 */
                if (frequency > 1) {
                    System.out.println(ch + " --> " + frequency);
                }
            }
        }

        sc.close();
    }
}