/**
Comparable is an interface used to define the natural/default ordering of objects in a class
 (like sorting Students by marks)
If you want your class to be sorted by default using Collections.sort(list), the class should implement comparable.
syntax:
class ClassName implements Comparable<ClassName> {
    // your fields

    @Override
    public int compareTo(ClassName other) {
        // return +ve, 0, or -ve
    }
}
compareTo() method decides how one object compares to another.

Return values:
🔼 Positive → this > other
🟰 Zero → this == other
🔽 Negative → this < other

 */


package Collections;
//This imports all utility classes like List, ArrayList, Collections from the java.util package.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
creating a custom class called Student
This class implements Comparable<Student> meaning this class will define how to compare two Student objects
 */
class Student implements Comparable<Student>{
    //declare fields
    String name;
    int marks;

    /*
    This is a constructor.
    It initializes name and marks when a new Student object is created.
    this.name refers to the current object's name; name is the constructor parameter
     */
    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    /*
    This is the method from the Comparable interface.
    It defines the natural/default way to sort students.
    Logic:
    If this.marks > other.marks → result is positive → this comes after other.
    If this.marks < other.marks → result is negative → this comes before other.
    If both marks are equal → result is 0 → same position.

Thus, this sorts students in ascending order of marks.
     */
    public int compareTo(Student other){
        return this.marks -other.marks;
    }

    public String toString(){
        return name +"-"+marks;
        /*
        This helps to print Student objects nicely.
        When you do System.out.println(s), it will show "Name - Marks" instead of default object memory address.
         */
    }
}


public class Comparable_26 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Athulya",37));
        list.add(new Student("Arjun",28));
        list.add(new Student("Rio",48));
        list.add(new Student("Choco",11));
        //4 students are added to the list with different names and marks.

        Collections.sort(list);//// uses compareTo() of Student class

        for (Student s : list){
            System.out.println(s);
        }
    }
}
/*
👉 Use Comparable when:
You have a custom class (like Student, Employee, Book), and
You want to define how to sort its objects by default
You plan to use Collections.sort(list) directly on that class' objects
🚫 You don’t need Comparable when:
You are sorting built-in types like:
Integer
String
Double
Character
etc.
Because these classes already implement Comparable internally.

Why java.lang Doesn’t Need to Be Imported Manually
java.lang is a core package in Java.
It contains commonly used classes like:
String
Integer
Object
System, Math, Thread, and importantly…
Comparable
Because it’s used so frequently, Java automatically includes it in every program
 */