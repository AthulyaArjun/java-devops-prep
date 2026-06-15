/**
 * skip() is an intermediate stream operation that ignores the first n elements and processes the remaining elements.
 * Its like skip(3) --> I don't want the first 3 records, start after that.
 * Syntax: stream.skip(n)
 * n= number of elements to ignore
 *| Point               | Explanation               |
 * | ------------------- | ------------------------- |
 * | `skip()`            | Intermediate operation    |
 * | Purpose             | Ignore first `n` elements |
 * | `skip(3)`           | Ignores first 3 elements  |
 * | Works well with     | `limit()` for pagination  |
 * | Original collection | ❌ Not modified            |
 * | Order of operations | ⚠️ Very important         |
 *
 */

package Streams;

import java.util.Arrays;
import java.util.List;

public class SkipMethod_10 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,40,50,60);

        numbers.stream()
                .skip(3)
                .forEach(System.out::println);
        System.out.println();
        numbers.stream()
                .limit(3)
                .skip(1)
                .forEach(System.out::println);
        System.out.println();
        numbers.stream()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);
    }
}
