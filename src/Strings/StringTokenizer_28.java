/**
 * StringTokenizer is an older java utility class used to split strings into smaller parts called tokens.
 * A token is a small separated part of string
 * It is used to split text, parse data, process words one by one
 * Importing is required import java.util.StringTokenizer;
 * Default delimiter is space
 *
 */

package Strings;

import java.util.StringTokenizer;

public class StringTokenizer_28 {
    public static void main(String[] args) {

        String sentence = "Java AWS Python DevOps";

        StringTokenizer st = new StringTokenizer(sentence);

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        String input = "Apple-Mango-Grapes-Orange";
        StringTokenizer st1 = new StringTokenizer(input,"-");

        while (st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }

    }
}


/**
 * | Method          | Purpose                 |
 * | --------------- | ----------------------- |
 * | hasMoreTokens() | checks tokens remaining |
 * | nextToken()     | returns next token      |
 */