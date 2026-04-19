package BasicsJava;

import java.util.Arrays;

/**
 *These are reference datatypes. Unlike Primitive datatypes, they store addresses (references), not direct values.
 * e.g. String, Arrays
 *
 * String : To store text, enclosed with double quotes ""
 * Array: To store multiple values of same datatype
 * int[] marks = {90, 85, 88, 92};
 */

public class NonPrimitiveDatatype_4 {
    public static void main(String[] args) {
        String university = "Newcastle University";
        char grade = 'A';
        int[] marks = {90,85,88,92};

        System.out.println(university);
        System.out.println(grade);
        System.out.println(marks); // here reference will be printed because directly printing marks and marks store references
        System.out.println(Arrays.toString(marks)); // built in method toString() from Arrays class to print values of Array
    }
}


/**
 * String is a class in Java, not a built-in primitive type.
 * It stores reference to an object.
 */