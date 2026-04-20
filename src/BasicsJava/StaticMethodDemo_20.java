/**
 * A static method belongs to the class, not to an object. It can be called directly from main()
 * main() itself is static and static methods can directly call static
 *
 * A non-static method belongs to an object. To call it, object is required.
 *
 * Why can’t static method directly call non-static method?
 * Non-static belongs to object and static method does not have object context. So object must be created first
 */

package BasicsJava;

public class StaticMethodDemo_20 {
    public static void main(String[] args) {

        printStatic();

        StaticMethodDemo_20 obj = new StaticMethodDemo_20();
        obj.printNonStatic();
    }

    public static void printStatic(){
        System.out.println("Static Method");
    }

    public void printNonStatic(){
        System.out.println("Non Static Method");
    }
}
