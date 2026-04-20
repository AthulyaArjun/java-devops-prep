/**
 *Loops are used to execute a block of code repeatedly as long as a given condition remains true.
 * Java provides three types of loops:
 * 1.	for loop
 * 2.	while loop
 * 3.	do-while loop
 *
 * for loop :is more suitable when you know the number of iterations in advance
 * syntax:
 * for (initialization; condition; update/increment/decrement) {
 *     // code
 * }
 */

package BasicsJava;

public class ForLoopDemo_13 {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            System.out.println("5 * "+i+" = "+(5*i));
        }
    }
}
