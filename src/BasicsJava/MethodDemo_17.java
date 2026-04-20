/**
 * A method is a block of code that performs a specific task. Instead of writing the same code again and again,
 * we create a method and reuse it.
 * Method provides: code reusability, better readability, easier debugging.
 *syntax:
 * returnType methodName() {
 *     // code
 * }
 */

package BasicsJava;

public class MethodDemo_17 {
    public static void main(String[] args) {

        displayMessage(); // since its a static method, can be called without an object
    }

    public static void displayMessage(){
        System.out.println("Welcome to Day 4 Java Learning");
    }
}
