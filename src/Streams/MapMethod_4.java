/**
 * map() is an intermediate operation used to transform each element of a stream into another value.
 * filter() decides whether an element stays or goes
 * map() decides what an element becomes
 * Syntax: stream.map(element -> transformation)
 * It accepts a function, the transformation returns a new value for each element.

 * | `filter()`                   | `map()`                                     |
 * | ---------------------------- | ------------------------------------------- |
 * | Selects elements             | Transforms elements                         |
 * | Returns true/false condition | Returns a new value                         |
 * | Some elements may be removed | Number of elements usually remains the same |
 * | Uses Predicate               | Uses Function                               |

 * map() is an intermediate operation that transforms each element of a stream into another form by applying
 * a given function. It returns a new stream containing the transformed elements and does not modify
 * the original collection.
 */

package Streams;

import java.util.Arrays;
import java.util.List;

public class MapMethod_4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30);

        numbers.stream()
                .map(num -> num*num)
                .forEach(System.out::println);

        List<String> names = Arrays.asList("alex","john","bob");

        names.stream()
                .map(String::toUpperCase) // .map(name -> name.toUpperCase())
                .forEach(System.out::println);
    }
}
