/**
 * Inheritance means one class acquires properties and methods of another class
 * Parent Class
 * Also called:
 * superclass
 * base class
 *
 * Child Class
 * Also called:
 * subclass
 * derived class
 * Syntax:
 * class Parent{
 *
 * }
 *
 * class Child extends Parent{
 *
 * }
 * Keyword - extends
 *
 * Child class can access:
 * its own methods
 * parent methods
 *
 * Major Benefit of Inheritance
 * Code Reusability
 *
 * Without inheritance:
 * duplicate code
 * repeated methods
 * harder maintenance
 *
 * With inheritance:
 * reuse parent code
 *
 * Important Understanding
 * Object of child class can access:
 *
 * ✅ parent methods
 * ✅ child methods
 *
 * But parent object cannot access child methods.
 */

package OOPS;

public class Inheritance_7 {
    public static void main(String[] args) {

        Students students = new Students("Athulya",24, 95);
        students.displayPerson();
        students.displayStudent();
    }
}

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void displayPerson(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Students extends Person{
    int marks;

    Students(String name, int age, int marks){
        super(name,age);
        this.marks = marks;
    }

    void displayStudent(){
        System.out.println("Marks: "+marks);
    }
}

/**
 * If parent has parameterized constructor,
 * child must explicitly call parent constructor using:
 *
 * super()
 */