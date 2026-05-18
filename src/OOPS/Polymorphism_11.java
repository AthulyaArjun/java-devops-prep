/**
 * Polymorphism: One thing behaving in multiple forms
 *
 * Types of Polymorphism
 * Compile-time Polymorphism --> Method Overloading
 * Runtime Polymorphism --> Method Overriding
 *
 * Parent ref = child object; --> Heart of runtime polymorphism
 * Parent reference = new Child(); //Upcasting, child object stored inside parent reference.
 * reference.method(); --> child method will run
 * Because object decides overriding method execution, not reference variable
 * Parent reference is only reference type, actual object is new Child(). Hence, overriden child method runs.
 * This is called runtime polymorphism, because decision happens during runtime
 *
 * VERY Important Rule
 * ---------------------
 * Using parent reference:
 * parent methods accessible
 * overridden methods execute from child
 * child-specific methods NOT accessible
 *
 * Accessible methods:
 * decided by reference type.
 * Executing overridden method:
 * decided by object type.
 */

package OOPS;

public class Polymorphism_11 {
    public static void main(String[] args) {

        Employee e1 = new Developer();
        Employee e2 = new Tester();
        Employee e3 = new Employee();

        e1.work();
        e2.work();
        e3.work();
        //e1.debug();--> compile time error because parent doesn't know child methods.
    }
}

class Employee{
    void work(){
        System.out.println("Employee is working");
    }
}

class Developer extends Employee{
    @Override
    void work(){
        System.out.println("Developer writing code");
    }

    void debug(){
        System.out.println("Debugging application");
    }
}

class Tester extends Employee{
    @Override
    void work(){
        System.out.println("Tester testing application");
    }
}
