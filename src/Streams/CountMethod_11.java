/**
 * count() is a terminal operation that returns the total number of elements in a stream
 * "How many elements are there after all filtering and processing"
 * Syntax: long count = stream.count();
 *| Point                | Explanation                                   |
 * | -------------------- | --------------------------------------------- |
 * | `count()`            | Terminal operation                            |
 * | Return type          | `long`                                        |
 * | Purpose              | Counts elements in the final stream           |
 * | Can be combined with | `filter()`, `distinct()`, `skip()`, `limit()` |
 * | After `count()`      | Stream is closed and cannot be reused         |
 */

package Streams;

import java.util.*;


public class CountMethod_11 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,20,30,40,45,50);
        long total = numbers.stream()
                .count();
        System.out.println(total);
        System.out.println();
        long evenNumbers = numbers.stream()
                .filter(num -> num%2==0)
                .count();
        System.out.println(evenNumbers);
        System.out.println();
    }
}
/*
Why does count() return long instead of int?

Because a stream may contain a very large number of elements, potentially more than the maximum
 value an int can hold (2,147,483,647).
 */