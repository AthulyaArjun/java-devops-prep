/**
 * Given an encoded string, return its decoded string.
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is
 * being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 * You may assume that the input string is always valid; there are no extra white spaces,
 * square brackets are well-formed, etc. Furthermore, you may assume that the original data does not
 * contain any digits and that digits are only for those repeat numbers, k.
 * For example, there will not be input like 3a or 2[4].
 * The test cases are generated so that the length of the output will never exceed 105.
 * Example 1:
 * Input: s = "3[a]2[bc]"
 * Output: "aaabcbc"
 * Example 2:
 * Input: s = "3[a2[c]]"
 * Output: "accaccacc"
 * Example 3:
 * Input: s = "2[abc]3[cd]ef"
 * Output: "abcabccdcdcdef"
 */

package LeetCodePractices.Medium;

import java.util.Stack;

public class DecodeString {

    public String decode(String s){
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        int count = 0;
        StringBuilder current = new StringBuilder();

        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if (Character.isDigit(ch)){
                count = count * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(count);
                stringStack.push(current.toString());
                count=0;
                current = new StringBuilder();
            } else if (ch == ']') {
                int repeat = countStack.pop();
                String previous = stringStack.pop();

                StringBuilder temp = new StringBuilder(previous);

                for (int j=0; j<repeat; j++){
                    temp.append(current);
                }
                current = temp;
            }else {
                current.append(ch);
            }
        }

        return current.toString();
    }

    public static void main(String[] args) {
        DecodeString obj = new DecodeString();

        System.out.println(obj.decode("3[a]2[bc]"));
        System.out.println(obj.decode("3[a2[c]]"));
        System.out.println(obj.decode("2[abc]3[cd]ef"));
    }
}
