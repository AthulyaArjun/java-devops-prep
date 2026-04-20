/**
 * The break statement is used to terminate a loop or switch statement immediately and transfer control to
 * the next statement after it.
 *
 * The continue statement skips the current iteration of the loop and continues with the next iteration.
 *
 * | break                 | continue            |
 * | --------------------- | ------------------- |
 * | exits loop completely | skips one iteration |
 * | stops execution       | continues loop      |
 *
 * When to use break vs continue?
 * break → when you want to stop loop entirely
 * continue → when you want to skip specific condition but keep looping
 */

package BasicsJava;

public class BreakContinueDemo_16 {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            if (i==8){
                break;
            }

            if (i%3==0){
                continue;
            }
            else {
                System.out.println(i);
            }


        }
    }
}
