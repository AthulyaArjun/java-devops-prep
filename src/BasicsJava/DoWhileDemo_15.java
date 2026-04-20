/**
 * A do-while loop executes the loop body at least once, because the condition is checked after execution
 * syntax:
 * do {
 *     // code
 * } while (condition);
 *
 * while: Condition checked first, May run zero times
 *
 * do-while: Code runs first, Condition checked later, Runs at least once
 */

package BasicsJava;

public class DoWhileDemo_15 {
    public static void main(String[] args) {
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while (i<=5);
    }
}
