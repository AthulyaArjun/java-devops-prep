/**
 * Autoboxing --> Automatic Conversion of primitive type --> Wrapper class
 * int a = 10;
 * Integer b = a; --> Java internally does Integer b = Integer.valueOf(a); automatically
 * primitive --> object

 * Unboxing --> Automatic Conversion of Wrapper object --> Primitive type
 * Integer a = 200;
 * int b = a; --> Java internally does int b = a.intValue(); automatically
 * Object --> primitive

 * Example:
 * ArrayList<Integer> list = new ArrayList<>();
 * list.add(10);
 * Wait…Collections store objects.But: 10, is primitive. So Java automatically converts:
 * 10 --> Integer.valueOf(10); -->autoboxing
 *
 * From Java 5 autoboxing was introduced.

 | Wrapper   | Primitive Method |
 | --------- | ---------------- |
 | Integer   | intValue()       |
 | Double    | doubleValue()    |
 | Character | charValue()      |
 | Boolean   | booleanValue()   |

 *Why prefer primitive in performance-critical code?
 * Because wrapper classes:
 * create objects
 * consume more memory
 * slower than primitives

 *Can wrapper classes store null?
 * YES.
 * Integer num = null;
 * Primitive cannot:int num = null;-->INVALID.
 */

package OOPS;

import java.util.ArrayList;

public class Boxing_33 {
    public static void main(String[] args) {

        int num = 10;
        Integer number = num; // autoboxing

        Boolean isFound = true;
        boolean flag = isFound; //java internally does isFound.booleanValue(); unboxing

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // autoboxing Integer.valueOf(10);

        System.out.println(list);

        Integer a = null;
        //int b = a; //NullPointerException


    }
}

/*
Integer num = null;
int value = num;

This causes:
NullPointerException

Why?
Because Java tries unboxing:num.intValue(), but num is null.
 */