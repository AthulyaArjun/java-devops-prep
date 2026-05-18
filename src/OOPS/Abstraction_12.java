/**
 * Abstraction: Hiding implementation details and show only essential behaviour
 * In Java, abstraction is achieved using 1: Abstract class 2. Interface

 * An abstract class is declared using keyword abstract
 * syntax: abstract class Animal{

  }
 * Important Rule
 * Abstract class object cannot be created.
 * ❌ Invalid:Animal a = new Animal();-->Compile-time error.
 * Why? Because abstract class is incomplete. It is only a blueprint/base design

 * Abstract method means method without body
 * abstract void sound(); --> no implementation

 * child class must implement method

 * Abstract class can contain:
 * ✅ abstract methods
 * ✅ normal methods
 * ✅ variables
 * ✅ constructors

 * VERY Important Rule
 * ------------------
 * If child class does NOT implement abstract method:
 * abstract void draw();
 * then child class ALSO becomes abstract. Otherwise, compile-time error.

 * One More Important Point
 _________________________
 * This is invalid:
 * abstract final class Demo
 * Why?
 * Because:
 * abstract → meant for inheritance
 * final → prevents inheritance

 * Both contradict each other.
 */

package OOPS;

public class Abstraction_12 {
    public static void main(String[] args) {
        UPIPayments upi = new UPIPayments();

        upi.pay();
        upi.transactionMessage();


    }
}

abstract class Payments{
    abstract void pay();

    void transactionMessage(){
        System.out.println("Transaction Started");
    }
}

class UPIPayments extends Payments{
    @Override
    void pay(){
        System.out.println("Payment using UPI");
    }
}