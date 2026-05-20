/**
 * this refers to current object
 *, means the object which is currently calling the method or constructor
 * Why this is Needed?
 * Sometimes:
 * local variables
 * constructor parameters
 * instance variables
 * have same names.
 Then confusion occurs. this helps Java identify: instance variable of current object

 * Variable shadowing problem: parameter name and instance variable name same, so parameter gets assigned to itself
 * and instance variable remains null.
 * Solution: this

 Rules:
 * 1. this can access--> instance variables, instance methods and constructors of current object.
 * 2. this cannot be used inside static method directly. Because static belongs to class and this belongs to object
 static void display() {

 System.out.println(this.name);
 } --> error

 * Internal Understanding
 * When object calls method: s1.display();
 * Java internally sends: display(s1);
 * So this receives current object reference.

 | Usage                      | Example        |
 | -------------------------- | -------------- |
 | Access instance variable   | this.name      |
 | Resolve variable shadowing | this.age = age |
 | Call current method        | this.show()    |
 | Call constructor           | this()         |
 | Pass current object        | method(this)   |

 */

package OOPS;

class MyEmployee{
    String name;
    double salary;

    MyEmployee(String  name, double salary){
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("Employee name: "+name);
        System.out.println("Salary: "+salary);
    }
}

public class ThisDemo_18 {
    public static void main(String[] args) {
        MyEmployee employee1 = new MyEmployee("Athulya", 45000.00);

        employee1.display();

        MyEmployee employee2 = new MyEmployee("Arjun", 100000.00);
        employee2.display();

    }
}
