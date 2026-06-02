/**
 * throws is used to declare that a method may throw an exception
 * Suppose we have a method:
 * public static void vote(int age)
 * If age is invalid, we may throw an exception: throw new IllegalArgumentException("Age must be at least 18");

 * Now imagine another method calls vote().
 * How will the caller know that vote() can throw an exception?
 * We declare it: public static void vote(int age) throws IllegalArgumentException
 * This is called exception declaration

 * syntax:
 * returnType methodName() throws ExceptionType {
 *     ...
 * }
 *
 * | throw                       | throws                       |
 * | --------------------------- | ---------------------------- |
 * | Used inside method body     | Used in method declaration   |
 * | Throws one exception object | Declares possible exceptions |
 * | Action                      | Warning/Declaration          |
 */

package ExceptionHandling;

import java.util.Scanner;

public class Throws_6 {

    public static void checkAge(int age) throws IllegalArgumentException{
            if (age<18){
                throw new IllegalArgumentException("Age must be over 18");
            }
            else {
                System.out.println("Eligible to vote");
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (sc) {
            System.out.println("Enter age:");
            int age = sc.nextInt();
            checkAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}

/*
throw
↓
Actually throws exception

throws
↓
Declares possibility of exception

The purpose of:

throws IllegalArgumentException

is:

"I'm NOT handling it here.
The caller must handle it."
 */