/**
 * Switch is used when we want to compare one variable against multiple fixed values.
 * More clean approach than long if-else chains
 *
 * syntax:
 * switch (variable) {
 *
 *     case value1:
 *         // code
 *         break;
 *
 *     case value2:
 *         // code
 *         break;
 *
 *     default:
 *         // code
 * }
 *
 * Without break, Java keeps executing the next cases too. This is called: fall-through
 * default, Works like final else, runs when no case matches. It is optional but recommended
 * Java switch supports:
 * •	byte, short, int, char
 * •	enum
 * •	String (from Java 7 onward)
 */

package BasicsJava;
import java.util.Scanner;
public class SwitchDemo_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        switch (num){
            case 1:
                System.out.println("Deposit");
                break;

            case 2:
                System.out.println("Withdraw");
                break;

            case 3:
                System.out.println("Check Balance");
                break;

            default:
                System.out.println("Invalid choice!....");
        }

        sc.close();

    }
}

/**
The break statement is used to terminate a loop or switch statement immediately and transfer control to the
 next statement after it.
 */