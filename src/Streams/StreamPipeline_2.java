/**
 *A stream generally has 3 stages: source --> intermediate operations --> Terminal operation

 * 1. Source: The place from where stream gets the data
 * List<Integer> numbers = Arrays.asList(10, 20, 30);
 * Stream<Integer> stream = numbers.stream();
 * Here, List is the source.

 * 2. Intermediate Operations: These are operations that transform the stream
 * eg: filter(), map(), sorted(), distinct(), limit() etc.
 * Important Characteristics: They are lazy, they do not execute immediately.
 * numbers.stream()
 *        .filter(num -> {
 *            System.out.println("Checking " + num);
 *            return num > 10;
 *        });
 * Output: prints nothing
 * Because no terminal operation has started the stream processing
 * Intermediate operations are lazy because java avoids unnecessary work and improves performance.
 * numbers.stream()
 *        .filter(num -> num > 10);
 *  No result is requested, so Java does not process anything.

 * 3. Terminal Operation: This produces the final result and triggers the stream execution
 * eg: forEach(), collect(), count(), reduce(), findFirst(), anyMatch() etc.
 * numbers.stream()
 *        .filter(num -> num > 10)
 *        .forEach(System.out::println);
 */

package Streams;
import java.util.Arrays;
import java.util.List;

public class StreamPipeline_2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30);

        numbers.stream()
                .filter(num -> num>10)
                .forEach(System.out::println);

    }
}
