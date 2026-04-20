/**
 * while loop is used when the number of iterations is not known at compile time or when we prefer flexibility.
 * Loop run as long as the condition is true.
 * syntax:
 * while (condition) {
 *     // code
 * }
 */

package BasicsJava;

public class WhileLoopDemo_14 {
    public static void main(String[] args) {
        int i = 1;
        while (i<=10){
            System.out.println(i);
            i++;
        }
    }
}
