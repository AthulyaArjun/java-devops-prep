/**
 * distinct() is an intermediate stream operation that removes duplicate elements from the stream.
 * It keeps only the unique elements
 * Its like converting a list to set, but it is done within the stream pipeline.
 * Syntax: stream.distinct()
 * It removes the duplicates but doesn't sort it and keeps the original encounter order.
 *| Point               | Explanation                            |
 * | ------------------- | -------------------------------------- |
 * | `distinct()`        | Intermediate operation                 |
 * | Purpose             | Remove duplicate elements              |
 * | Uses                | `equals()` and `hashCode()` internally |
 * | Sorting             | ❌ Does not sort                        |
 * | Original collection | ❌ Not modified                         |
 * | Order               | Keeps original encounter order         |
 */

package Streams;

import java.util.Arrays;
import java.util.List;

public class DistinctMethod_8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6,6,1,2,2,3,4,4,4,5);
        numbers.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        List<String> names = Arrays.asList("John","Bob","John","Cindy");
        names.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
