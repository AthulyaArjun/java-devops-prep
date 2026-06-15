/**
 * sorted() is an intermediate stream operation that sorts the elements of a stream.
 * Its like Collections.sort() but it works inside a stream pipeline
 * Syntax: stream.sorted()
 * Default order is ascending for numbers and alphabetical for strings

 * For descending order we can provide a Comparator
 * | Point           | Explanation                                            |
 * | --------------- | ------------------------------------------------------ |
 * | `sorted()`      | Intermediate operation                                 |
 * | Returns         | A new sorted Stream                                    |
 * | Original List   | ❌ Not modified                                         |
 * | Default sorting | Ascending / natural order                              |
 * | Reverse sorting | `sorted(Comparator.reverseOrder())`                    |
 * | Works on        | Numbers, Strings, objects (with Comparator/Comparable) |
 */

package Streams;
import java.util.*;
public class SortedMethod_7 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5,2,9,1,3);

        numbers.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        List<Integer> salary = Arrays.asList(60000,40000,80000,50000);

        salary.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        salary.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        System.out.println();

        List<String> names = Arrays.asList("Elsa","Anna","Cinderella","Tinker","Jasmine");
        names.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        names.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
