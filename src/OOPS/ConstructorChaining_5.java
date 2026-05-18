/**
 * Constructor chaining means calling another constructor in same class using this()
 * this() --> should always be the first line
 * To avoid:
 * repeated code
 * repeated initialization
 * messy constructors
 *
 * Constructor chaining follows top-down calling, bottom-up execution. Meaning: calls go downward first,
 * print happen while returning upward
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