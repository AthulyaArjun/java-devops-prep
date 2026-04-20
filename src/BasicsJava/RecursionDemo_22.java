/**
 * Recursion means a method calling itself
 *
 * Base case --> condition to stop recursion
 * without a proper base case, it causes infinite method calls and leads to StackOverflowError
 */

package BasicsJava;

public class RecursionDemo_22 {
    public static void main(String[] args) {
        printNumbers(5);
    }

    public static void printNumbers(int num){

        if (num==0){ // -->base case
            return;
        }

        System.out.println(num);
        printNumbers(num-1);
    }
}
