/**
 * Parameter are variables declared in method definition. They act like placeholders
 * e.g. public static void greet(String name) --> String name is the parameter
 *
 * Arguments are actual value passed when calling the method
 * e.g. greet("Athulya"); --> Athulya is the argument
 */

package BasicsJava;

public class ParameterArgumentDemo_18 {
    public static void main(String[] args) {

        studentDetails("Athulya",29);
    }

    public static void studentDetails(String name, int age){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
