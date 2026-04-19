package BasicsJava;

/**
 * Operators are used to perform operations on values
 * Types:
 * Arithmetic - Used of mathematical
 *| Operator | Meaning             |
 * | -------- | ------------------- |
 * | +        | Addition            |
 * | -        | Subtraction         |
 * | *        | Multiplication      |
 * | /        | Division            |
 * | %        | Modulus (remainder) |
 *
 *
 * Relational - Used for comparison, Result is always true or false
 * | Operator | Meaning          |
 * | -------- | ---------------- |
 * | ==       | equal to         |
 * | !=       | not equal        |
 * | >        | greater than     |
 * | <        | less than        |
 * | >=       | greater or equal |
 * | <=       | less or equal    |
 *
 *
 * Logical - Used to combine conditions
 * | Operator | Meaning |
 * | -------- | ------- |
 * | &&       | AND     |
 * | ||       | OR      |
 * | !        | NOT     |
 *
 *
 * Assignment - Used to assign values
 * | Operator | Meaning             |
 * | -------- | ------------------- |
 * | =        | assign              |
 * | +=       | add and assign      |
 * | -=       | subtract and assign |
 * | *=       | multiply and assign |
 *
 *
 * Unary - operate on a single operand
 * +
 * -
 * ++
 * --
 * !
 *
 *
 * Ternary - short form of if-else. improving readability for basic decisions.
 * condition ? truePart : falsePart
 *
 *
 * Increment / Decrement
 * ++
 * --
 *
 *
 * instanceOf - The instanceof operator checks whether an object belongs to a specific class or interface.
 * if (obj instanceof Student) {
 * }
 *
 */

public class Operators_6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int c = a+b;
        int d = a%b;



        System.out.println(c);
        System.out.println(d);
        System.out.println(c>b);
        System.out.println(a>b && a>c);
        c += 10;
        System.out.println(c);
        int age = 18;
        String result = (age>18) ? "Adult" : "Minor";
        System.out.println(result);

        c++;
        System.out.println(c);




    }
}


/**
 * Q: Difference between = and == in Java.
 * A: = is assignment (stores a value into a variable). == is comparison operator which checks equality.
 * For primitives, == compares values. For objects, == compares references (whether both point to the same object).
 *
 *
 * Q: Can operators work on objects?
 * A: Most operators work on primitive types, but:
 * •	+ can be used with String (concatenation)
 * •	instanceof works with objects
 * Q: Which operators cannot be overloaded in Java?
 * A: Java does not support operator overloading except for + with String.
 * Operators that cannot be overloaded include:
 * + - * / && || instanceof
 */