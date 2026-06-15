/**
 * limit() is an intermediate stream operation that returns only the first n elements of a stream.
 * Its like limit(5) --> I only need the first 5 results, ignore the rest.
 * stream.limit(5)
 * n = number of elements to keep
 * | Point                 | Explanation                 |
 * | --------------------- | --------------------------- |
 * | `limit()`             | Intermediate operation      |
 * | Purpose               | Restrict number of elements |
 * | `limit(3)`            | Returns first 3 elements    |
 * | Original collection   | Not modified                |
 * | Order with `sorted()` | Very important              |
 */

package Streams;

import java.util.Arrays;
import java.util.List;

public class LimitMethod_9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,40,50,60);
        numbers.stream()
                .limit(3)
                .forEach(System.out::println);
        System.out.println();
        List<Integer> salary = Arrays.asList(80000,30000,60000,40000,90000);
        salary.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);
        System.out.println();
        salary.stream()
                .limit(3)
                .sorted()
                .forEach(System.out::println);
    }
}
