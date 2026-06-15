/**
 * findFirst() is a terminal operation that returns the first element of the stream.
 * But there is a catch. It does not return the element directly. It returns an Optional<T>.
 * Why? Because stream maybe empty, and hence there may be no first element.
 * Syntax: Optional<Type> result = stream.findFirst();
 * | Point                             | Explanation                     |
 * | --------------------------------- | ------------------------------- |
 * | `findFirst()`                     | Terminal operation              |
 * | Returns                           | `Optional<T>`                   |
 * | Purpose                           | Get the first element           |
 * | Empty stream                      | Returns `Optional.empty()`      |
 * | Calling `get()` on empty Optional | Throws `NoSuchElementException` |
 * | Safer approach                    | `orElse()`, `orElseThrow()`     |
 */

package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstMethod_12 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,10,15,20,25,30,35,40);

        Optional<Integer> first = numbers.stream()
                .findFirst();
        System.out.println(first);
        System.out.println(first.get());
        System.out.println();

        Optional<Integer> even = numbers.stream()
                .filter(n -> n%2==0)
                .findFirst();
        System.out.println(even.get());
        System.out.println();

        List<Integer> list =
                Arrays.asList(1, 3, 5, 7);

        int value = list.stream()
                .filter(n -> n%2==0)
                .findFirst()
                .orElse(-1);
        System.out.println(value);
        System.out.println();

        Optional<Integer> result = list.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();
        System.out.println(result);
        System.out.println(result.get());
        System.out.println();



    }
}
