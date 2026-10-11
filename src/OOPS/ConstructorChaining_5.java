/**
 * Constructor chaining means calling another constructor in same class using this()
 * this() --> should always be the first line
 * To avoid:
 * repeated code
 * repeated initialization
 * messy constructors
 *
 * constructor calls go inward, and the remaining statements execute as the calls return outward.
 */

package OOPS;

public class ConstructorChaining_5 {
    public static void main(String[] args) {

        Demo demo = new Demo(10,20);
    }
}

class Demo{

    Demo(){
        System.out.println("1");
    }

    Demo(int x){
        this();
        System.out.println("2");
    }

    Demo(int x, int y){
        this(10);
        System.out.println("3");
    }
}