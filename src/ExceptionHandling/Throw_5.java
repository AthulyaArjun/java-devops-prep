/**
 * throw keyword is used to manually create (throw) an exception in java.
 * Instead of waiting for java to throw an exception, you can create and throw one yourself,
 * often with a custom message or in specific conditions.
 * syntax:
 * throw new ExceptionType("custom message");
 */

package ExceptionHandling;

import java.util.Scanner;

public class Throw_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (sc) { //--> Try_with-Resources; java automatically does sc.close();
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            if (age < 18) {
                throw new IllegalArgumentException("Age must be at least 18");
            } else {
                System.out.println("Eligible to vote");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}

/*
Code after throw is unreachable
throw
↓
Immediately stops normal execution
↓
Looks for nearest matching catch block
↓
If found → executes catch
↓
If not found → program terminates
 */