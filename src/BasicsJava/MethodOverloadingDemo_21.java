/**
 * Method overloading means same name but different parameters inside the same class
 * e.g. add(int a, int b)
 * add(int a, int b, int c)
 * add(double a, double b)
 *
 * Valid Ways to Overload
 * Change: number of parameters OR datatype of parameters OR both
 *
 * Invalid Overloading
 * Only changing: return type is NOT enough --> compile error
 */

package BasicsJava;

public class MethodOverloadingDemo_21 {
    public static void main(String[] args) {

       int result1 =  multiply(5,3);
       int result2 = multiply(3,2,6);
        System.out.println("Result 1: "+result1);
        System.out.println("Result 2: "+result2);

    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static int multiply(int a, int b, int c){
        return a*b*c;
    }
}
