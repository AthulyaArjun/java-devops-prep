/**
 * Else-if ladder is used when we have:
 * multiple conditions and we have to check one by one
 *
 * if (condition1) {
 *     // block 1
 * }
 * else if (condition2) {
 *     // block 2
 * }
 * else if (condition3) {
 *     // block 3
 * }
 * else {
 *     // default block
 * }
 *
 * Java checks from top to bottom. As soon as one condition becomes true:
 * it stops checking further. Very important. So order matters.
 *
 *
 * if-else
 * Only 2 paths:
 * true / false
 *
 * else-if ladder
 * Multiple conditions handled one by one
 */


package BasicsJava;
import java.util.Scanner;
public class ElseIfLadderDemo_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks:");
        int num = sc.nextInt();

        if (num >= 90){
            System.out.println("Grade A");
        } else if (num >= 75) {
            System.out.println("Grade B");
        } else if (num >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
