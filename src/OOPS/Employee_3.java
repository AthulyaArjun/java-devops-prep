/**
 * A constructor is a special method used to initialize objects.
 * It runs automatically when object is created.
 * e.g.,
 * Student s1 = new Student();
 * When object is created:
 * new Student()
 * the constructor executes automatically.
 *
 * Why Constructor is Needed?
 * Without constructor:
 * Student s1 = new Student();
 * s1.name = "Athulya";
 * s1.age = 24;
 *
 * We must manually assign values.
 * Constructors make initialization easier and cleaner.
 *
 * Important Rules of Constructor
 * Rule 1: Constructor name MUST match class name.
 * Rule 2: Constructor has NO return type
 * Rule 3: Constructor executes automatically during object creation.
 *
 * Default Constructor
 * A constructor with NO parameters.
 * Example:
 * class Student{
 *     Student(){
 *         System.out.println("Constructor Called");
 *     }
 * }
 *
 * When object is created:
 * Student s1 = new Student();
 * Java does 3 things:
 * Step 1: Allocates memory in heap.
 * Step 2: Initializes instance variables with default values.
 * Step 3: Calls constructor automatically.
 *
 * | Datatype | Default Value |
 * | -------- | ------------- |
 * | int      | 0             |
 * | double   | 0.0           |
 * | boolean  | false         |
 * | String   | null          |
 *
 * class Student{
 *     int age;
 *     String name;
 *     void display(){
 *         System.out.println(age); --> 0
 *         System.out.println(name); --> null , Because Java gives default values.
 *     }
 * }
 *
 *Parameterized Constructor
 * Constructor with parameters.
 * class Student{
 *     String name;
 *     int age;
 *     Student(String n, int a){
 *         name = n;
 *         age = a;
 *     }
 *     void display(){
 *         System.out.println(name);
 *         System.out.println(age);
 *     }
 * }
 *
 * Problem Without this
 * Example:
 * Student(String name, int age){
 *     name = name;
 *     age = age;
 * }
 * This causes confusion.
 * Why?
 * Because: local variable name & instance variable name have same names.
 * Java gives priority to local variables.
 * So:name = name;
 * actually means: localVariable = localVariable;
 Instance variable never changes.
 * Solution — this Keyword
 * this.name = name;
 * this.age = age;
 * Meaning:
 * Left Side	        Right Side
 * instance variable	local variable
 * this: refers to CURRENT OBJECT.
 *
 * Constructor Overloading
 * Multiple constructors with different parameters.
 * class Student{
 *
 *     String name;
 *     int age;
 *
 *     Student(){
 *         System.out.println("Default Constructor");
 *     }
 *
 *     Student(String name){
 *         this.name = name;
 *     }
 *
 *     Student(String name, int age){
 *         this.name = name;
 *         this.age = age;
 *     }
 * }
 * Why Constructor Overloading?
 * Flexibility: We can create objects in different ways
 *
 * | Constructor        | Method             |
 * | ------------------ | ------------------ |
 * | Initializes object | Performs action    |
 * | Same name as class | Any name           |
 * | No return type     | Has return type    |
 * | Auto executes      | Must call manually |
 */

package OOPS;

public class Employee_3 {
    String name;
    int id;
    double salary;

    public Employee_3(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void  displayEmployee(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Salary: "+salary);
    }

    public static void main(String[] args) {

        Employee_3 emp = new Employee_3("Athulya", 101, 30000);
        emp.displayEmployee();

        System.out.println();

        Mobile mob1 = new Mobile("Iphone", 126, 8);
        mob1.displayMobile();
        System.out.println();

        Mobile mob2 = new Mobile("Samsung", 128, 16);
        mob2.displayMobile();
        System.out.println();

        Mobile mob3 = new Mobile("Google Pixel", 128,8);
        mob3.displayMobile();
        System.out.println();

        Book book = new Book("Harry Potter", "J K Rowling", 500);
        book.displayBook();

    }
}

class Mobile{
    String brand;
    int ram;
    int storage;

    public Mobile(String brand, int ram, int storage){
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
    }

    void displayMobile(){
        System.out.println("Brand: "+brand);
        System.out.println("Ram: "+ram);
        System.out.println("Storage: "+storage);
    }
}

class Book{
    String title;
    String author;
    int price;

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

     void displayBook(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price );
    }
}
