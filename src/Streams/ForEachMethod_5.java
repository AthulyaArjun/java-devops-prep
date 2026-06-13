/**
 * forEach() is a terminal operation that performs an action on every element of the stream
 * Syntax: stream.forEach(element -> action);
 * It accepts a consumer, and consumer takes a value and performs an action, but returns nothing
 * List<Integer> numbers = Arrays.asList(10, 20, 30);
 * numbers.stream()
 *        .forEach(num -> System.out.println(num));
 * Instead of numbers.stream()
 *        .forEach(num -> System.out.println(num));
 * we can write
 * numbers.stream()
 *        .forEach(System.out::println);
 * This is called method reference
 * System.out::println
 * is shorthand for
 * x -> System.out.println(x)

 * | for loop                                  | `forEach()`                             |
 * | ----------------------------------------- | --------------------------------------- |
 * | External iteration (you control the loop) | Internal iteration (Stream controls it) |
 * | Can use `break` and `continue`            | Cannot use `break` and `continue`       |
 * | Works on arrays, collections, etc.        | Works on Stream elements                |

 * forEach() is a terminal operation that performs a given action on each element of a stream.
 * It accepts a Consumer, triggers stream execution, and does not return any result.
 */

package Streams;

public class ForEachMethod_5 {
    public static void main(String[] args) {

    }
}

/*
| Functional Interface | Takes | Returns          | Common use  |
| -------------------- | ----- | ---------------- | ----------- |
| Predicate            | Input | `boolean`        | `filter()`  |
| Function             | Input | Output           | `map()`     |
| Consumer             | Input | Nothing (`void`) | `forEach()` |

 */