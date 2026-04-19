package BasicsJava;

import java.util.Scanner;

public class StudentInfoCalculatorSystem_Day2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        int age = student.studentInfo(sc);

        Calculator cal = new Calculator();
        cal.operations(sc, age);

        sc.close();
    }
}

class Student {

    int studentInfo(Scanner sc) {

        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Age: ");
        int age = sc.nextInt();

        System.out.println("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.println("Enter Placement Status (true/false): ");
        boolean isPlaced = sc.nextBoolean();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Placed: " + isPlaced);

        return age;
    }
}

class Calculator {

    void operations(Scanner sc, int age) {
        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Division: " + (a / b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Modulus: " + (a % b));

        System.out.println("Is first number greater than second? " + (a > b));
        System.out.println("Are both numbers equal? " + (a == b));

        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Category based on age: " + result);
    }
}