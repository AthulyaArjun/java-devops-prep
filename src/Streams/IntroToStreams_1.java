/**
 * Java Stream API, introduced in Java 8, provides a way to process collections of data in a functional and
 * declarative manner. It allows operations like filtering, mapping, sorting and collecting data without modifying
 * the original collection.
 * Before Java 8 we used loop, this works fine but when operations becomes complex, filtering, sorting etc
 * the code becomes longer.
 * A stream is a sequence of elements that allows us to process data in a declarative and functional way.
 * Instead of telling java how to do each step, we tell java what result we want.

 * Important points about streams
 * 1. Stream do not store data
 * It is not a data structure.
 * ArrayList (stores data)
 *        |
 *        v
 * Stream (processes data)
 *        |
 *        v
 * Result

 * 2. Stream do not modify the original collection
 * List<String> names = Arrays.asList("john", "alex");
 * names.stream()
 *      .map(String::toUpperCase)
 *      .forEach(System.out::println);
 *  Output: JOHN ALEX
 *  But original list is still [john,alex]

 * 3. Streams can be used only once
 * Stream<Integer> stream = numbers.stream();
 * stream.forEach(System.out::println);
 * // Error if used again
 * stream.forEach(System.out::println);
 * A stream is consumed after a terminal operation

 * | Loop                     | Stream                 |
 * | ------------------------ | ---------------------- |
 * | You control iteration    | Java handles iteration |
 * | More code                | Less code              |
 * | Imperative style         | Declarative style      |
 * | Manual filtering/sorting | Built-in operations    |
 */


package Streams;
import java.util.ArrayList;
import java.util.List;
public class IntroToStreams_1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("john");
        names.add("alex");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
