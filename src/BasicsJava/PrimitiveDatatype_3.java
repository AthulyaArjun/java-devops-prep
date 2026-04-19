package BasicsJava;

/**
 * Java has 8 primitive datatypes. These are basic built-in basic data storage types.
 *
 * | Data Type |          Size | Example      |
 * | --------- | ------------: | ------------ |
 * | byte      |        1 byte | 100          | Range -128 to 127, rarely used
 * | short     |       2 bytes | 20000        | Bigger than byte, rarely used
 * | int       |       4 bytes | 100000       | Default integer type, most used
 * | long      |       8 bytes | 999999999    | Very large numbers, L at the end
 * | float     |       4 bytes | 5.5f         | Decimal number, 4 bytes, less precise, f at the end
 * | double    |       8 bytes | 99.99        | Default decimal number,8 bytes, more precise
 * | char      |       2 bytes | 'A'          | Single character, use only single quotes
 * | boolean   | JVM dependent | true / false | Only true or false
 */

public class PrimitiveDatatype_3 {
    public static void main(String[] args) {
        byte a = 100;
        short b = 20000;
        int c = 100000;
        long d = 999999999L;
        float e = 5.5f;
        double f = 99.99;
        char g = 'A';
        boolean h = true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

    }
}

/**
 * Java is not 100% object-oriented because it supports primitive data types such as int, boolean, char, etc.,
 * which are not objects. These primitive types do not belong to any class and do not have methods or properties
 * like objects. They are provided to improve performance and memory efficiency.
 */