/**
 * filter() is an intermediate operation used to select elements that satisfy a given condition.
 * Think of it like an if statement inside streams.
 * Syntax: stream.filter(element -> condition)
 * It accepts a predicate and condition must return true/false
 * true--> keep the element
 * false--> discard the element

 * filter() is an intermediate operation in the Stream API used to select elements that satisfy a given condition.
 * It accepts a Predicate and returns a new stream containing only the matching elements.
 * It is lazy and does not execute until a terminal operation is called.
 */

package Streams;

import java.util.Arrays;
import java.util.List;

public class FilterMethod_3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alex","John","Bob","Alice");

        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}
