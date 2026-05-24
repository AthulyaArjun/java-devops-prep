/**
 * Java framework and collections work with objects not primitive types. This is where Wrapper classes becomes
 * necessary. The problem is int, char, double etc. are not objects. But many java features requires objects.
 * e.g., ArrayList<int> --> invalid
 * Because generics only support object and int is primitive
 * Solution to this problem is Wrapper Class
 * Java provides object version of primitive types
 * | Primitive | Wrapper Class |
 * | --------- | ------------- |
 * | int       | Integer       |
 * | double    | Double        |
 * | char      | Character     |
 * | boolean   | Boolean       |
 * | byte      | Byte          |
 * | short     | Short         |
 * | long      | Long          |
 * | float     | Float         |
 *
 * Wrapper classes:
 *      Convert primitives into objects
 *      provide utility methods
 *      works with collections/frameworks
 * int is like raw value. Wrapper Integer is like fully featured object version of int.
 * Wrapper class also provides useful methods.
 * Using Integer.parseInt() we can convert String to int;
 * Wrapper Integer can store null, whereas primitive int cannot store null
 *
 */

package OOPS;

public class WrapperClass_32 {
    public static void main(String[] args) {

        int a = 10;
        Integer b = 20;
        String c = "30";
        int d = Integer.parseInt(c);// String is converted to primitive int
        Integer num = Integer.valueOf("200");// here String/int is converted into Object Integer

        System.out.println(a);
        System.out.println(b);
        System.out.println(b.byteValue());
        System.out.println(b.doubleValue());
        System.out.println(b.toString());
        System.out.println(d);
        System.out.println(num);
        System.out.println(Integer.parseInt("50")+10);
        System.out.println(Integer.valueOf("50")+10);
    }
}

/*
Difference Between parseInt() and valueOf()
This is the MOST IMPORTANT part.
Method	Returns
Integer.parseInt()	primitive int
Integer.valueOf()	Integer object
 */