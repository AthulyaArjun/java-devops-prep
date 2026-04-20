/**
Nested if is used when one condition depends on another condition, i.e., an if inside another if

if (condition1) {

    if (condition2) {
        // code
    }

}

 if-else
 Choose between two paths

 nested if
 Condition inside another condition. Used when second check depends on first
 */

package BasicsJava;
import java.util.Scanner;
public class NestedIfDemo_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();

        if (age>=18){
            if (marks>=60){
                System.out.println("Eligible for admission");
            }
            else {
                System.out.println("Not eligible for admission");
            }
        }
        else {
            System.out.println("Age criteria not met");
        }

        sc.close();
    }
}
