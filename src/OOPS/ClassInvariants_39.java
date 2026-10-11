/**
 * A class invariant is a condition that must remain true throughout an objects valid, externally
 * observable states.
 * For example, suppose we have a StudentRecord class with the following rules:
 * - Student age must be between 16 and 100.
 * - Student marks must be between 0 and 100.
 * These rules are our class invariants.
 * Mathematically:
 * 16 <= age <= 100
 * 0 <= marks <= 100
 *
 * How do we maintain class invariants?
 * 1. Validate data during object construction.
 * 2. Validate data before modifying an object's state.
 * 3. Reject invalid inputs using exceptions.
 * 4. Avoid exposing mutable internal state in ways that bypass validation.
 * Important: Declaring fields private helps with encapsulation,
 * but doesn't automatically guarantee valid values.
 *
 * Separation of Concerns (SoC)
 * Definition: Separation of Concerns is a design principle in which different responsibilities
 * are assigned to appropriate components.
 * For example:
 * Class	Responsibility
 * StudentRecord	Store and validate student information
 * GradeCalculator	Calculate grades
 * StudentReportGenerator	Generate student reports
 * This makes the system easier to maintain because changes to the grading rules can be made
 * in GradeCalculator without modifying unrelated responsibilities.
 * Relationship with SRP
 * Single Responsibility Principle (SRP) states that a class should have one primary reason to change.
 * SoC is a broader principle of organising responsibilities, while SRP applies that thinking to
 * individual classes.
 */

package OOPS;


class StudentRecord {

    private final String name;
    private int age;
    private int marks;

    public StudentRecord(String name, int age, int marks) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                    "Name cannot be empty");
        }

        this.name = name;
        setAge(age);
        setMarks(marks);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMarks() {
        return marks;
    }

    public void setAge(int age) {

        if (age < 16 || age > 100) {
            throw new IllegalArgumentException(
                    "Age must be between 16 and 100");
        }

        this.age = age;
    }

    public void setMarks(int marks) {

        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException(
                    "Marks must be between 0 and 100");
        }

        this.marks = marks;
    }
}

// Responsibility: Calculate student grades
class GradeCalculator {

    public String calculateGrade(int marks) {

        if (marks >= 70) {
            return "Distinction";
        } else if (marks >= 60) {
            return "Merit";
        } else if (marks >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}

// Responsibility: Generate student reports
class StudentReportGenerator {

    private final GradeCalculator gradeCalculator;

    public StudentReportGenerator(GradeCalculator gradeCalculator) {

        this.gradeCalculator = gradeCalculator;
    }

    public void printReport(StudentRecord student) {

        System.out.println("----- Student Report -----");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Marks: " + student.getMarks());

        String grade = gradeCalculator.calculateGrade(
                student.getMarks());

        System.out.println("Grade: " + grade);
    }
}

public class ClassInvariants_39 {

    public static void main(String[] args) {

        StudentRecord student = new StudentRecord("Alice", 22, 85);

        GradeCalculator calculator = new GradeCalculator();

        StudentReportGenerator reportGenerator = new StudentReportGenerator(calculator);

        reportGenerator.printReport(student);

        System.out.println();

        // Attempt an invalid update
        try {
            student.setAge(150);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Check that the invariant is preserved
        System.out.println(
                "Age after invalid update: "
                        + student.getAge());
    }
}

