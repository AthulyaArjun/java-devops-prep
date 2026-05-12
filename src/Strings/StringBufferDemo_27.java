/**
 * StringBuffer just like StringBuilder is a mutable set of characters
 * StringBuffer is thread-safe i.e., multiple threads can use it safely.
 * StringBuffer methods are synchronized.
 * Meaning:
 * only one thread can access at a time
 * This prevents data corruption in multithreading.
 * Because of synchronization StringBuffer is slower than StringBuilder
 */

package Strings;

public class StringBufferDemo_27 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        System.out.println("Original String: " + sb);
        System.out.println("Length: " + sb.length() + ", Capacity: " + sb.capacity());

        sb.append(" Devops");

        System.out.println("After append: " + sb);
        System.out.println("Length: " + sb.length() + ", Capacity: " + sb.capacity());

        sb.insert(5, " Backend ");

        System.out.println("After insert: " + sb);

        sb.replace(0, 4, "Spring");

        System.out.println("After replace: " + sb);

        sb.delete(7, 15);

        System.out.println("After delete: " + sb);

        sb.reverse();

        System.out.println("After reverse: " + sb);

        sb.setLength(5);
        System.out.println("After setLength(5): " + sb);

        sb.ensureCapacity(50);
        System.out.println("After ensureCapacity(50), Capacity: " + sb.capacity());

        String str = "Java";

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuffer sb2 = new StringBuffer("Java");

        sb1.append(" DevOps");
        sb2.append(" Backend");

        System.out.println("String: "+str);
        System.out.println("StringBuilder: "+sb1);
        System.out.println("StringBuffer: "+sb2);
    }
}

/**
 * | Feature           | String | StringBuilder | StringBuffer |
 * | ----------------- | ------ | ------------- | ------------ |
 * | Mutable?          | No     | Yes           | Yes          |
 * | Thread Safe?      | Yes    | No            | Yes          |
 * | Performance       | Slow   | Fastest       | Slower       |
 * | Synchronized?     | N/A    | No            | Yes          |
 * | Memory Efficient? | Less   | More          | More         |
 */