/**
 * An interface is a blueprint of behavior or contract. It is used to achieve abstraction and multiple inheritance in java.
 * Declared using interface keyword
 * Traditionally interfaces contained only abstract methods.From Java 8 onward, interfaces can also
 contain default and static methods with body.

 * An interface tells what should be done but not how it should be done. The implementation class decides it.

 * Vehicle Interface
 * Suppose every vehicle must:
 * start()
 * stop()
 * accelerate()

 * But:
 * Car implementation differs
 * Bike implementation differs
 * Bus implementation differs
 * The common contract is the interface.

 * Why we need Interface?
 * Without interfaces, every developer may implement methods differently, no standard structure, difficult to manage large
 * systems.
 * Interface brings: standardization, loose coupling, flexibility, and scalability

 *Syntax: interface InterfaceName{
            void method();
 }

 * Important--> keyword interface, methods are public and abstract. i.e., public abstract void method();

 * To implement an interface, the keyword used is implements
 * Rule:
 * 1. If a class implements an interface, it must implement all its methods. Otherwise, class becomes abstract
 or compilation error occurs.
 * 2. Interface methods are public abstract by default.so when a class implements the method, it should also be public
 this is because in java, you cannot assign a more restrictive access modifier when overriding a method
 * 3. Variables inside interface are public static final by default. meaning constant only and cannot be modified.
 * 4. Object of interface cannot be created, because interface is incomplete.
 if Vehicle is an interface Vehicle v = new Vehicle is not allowed
 * 5. Reference variable is allowed. Vehicle v = new Car(); is allowed
  we can also use same reference variable to create another object v = new Bus(); is allowed
 No code rewrite is needed
 */

package OOPS;

interface Animals{
    void sound();

    void eat();
}

class Dogs implements Animals{

    public void sound(){
        System.out.println("Dog is barking");
    }

    public void eat(){
        System.out.println("Dog is eating");
    }
}

class Cats implements Animals{

    public void sound(){
        System.out.println("Cat meows");
    }

    public void eat(){
        System.out.println("Cat is eating");
    }
}

public class Interface_13 {
    public static void main(String[] args) {

        Animals animals = new Dogs();
        animals.sound();
        animals.eat();

        animals = new Cats();
        animals.sound();
        animals.eat();
    }
}


/**
 * | Abstract Class               | Interface                          |
 * | ---------------------------- | ---------------------------------- |
 * | Can have normal methods      | Mainly abstract methods            |
 * | Uses extends                 | Uses implements                    |
 * | Supports partial abstraction | Used for full abstraction (mostly) |
 * | Single inheritance only      | Multiple interfaces possible       |
 *
 * A class can implement multiple interfaces.
 * This is how Java achieves multiple inheritance.
 *
 * interface Camera {
 *     void click();
 * }
 *
 * interface MusicPlayer {
 *     void playMusic();
 * }
 *
 * class Phone implements Camera, MusicPlayer {
 *
 *     public void click() {
 *         System.out.println("Photo clicked");
 *     }
 *
 *     public void playMusic() {
 *         System.out.println("Music playing");
 *     }
 * }
 *
 * Can interface have constructor?
 * No.
 * Because interface has no object creation.

 * Can interface extend another interface?
 * Yes.
 */
