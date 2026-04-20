/**
 * A method can: send a value back to the place where it was called. That is called: return type
 * void means method returns nothing
 * public static double calculateCGPA() --> returns a value of type double back
 *
 * if a method has return type, then return statement is mandatory else compile error
 */

package BasicsJava;

public class ReturnTypeDemo_19 {
    public static void main(String[] args) {

        System.out.println("Sum is :"+add(25,30));
    }

    public static int add(int a, int b){
        int sum = a+b;
        return sum;
    }
}
