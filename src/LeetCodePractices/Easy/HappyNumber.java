/**
 * Write an algorithm to determine if a number n is happy.
 * A happy number is a number defined by the following process:
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.

 * Example 1:
 * Input: n = 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 * Example 2:
 * Input: n = 2
 * Output: false

 * Constraints: 1 <= n <= 2^31 - 1
 */

package LeetCodePractices.Easy;

import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber {

    public boolean isHappy(int number){

        HashSet<Integer> set = new HashSet<>();

        while (number!=1){

            if (set.contains(number)) return false;

            set.add(number);

            int sum = 0;
            while (number>0){
                int digit = number%10;
                sum += (int) Math.pow(digit,2);
                number = number/10;
            }

            number = sum;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        HappyNumber happyNumber = new HappyNumber();

        boolean result = happyNumber.isHappy(number);

        System.out.println(result);

        sc.close();
    }
}
