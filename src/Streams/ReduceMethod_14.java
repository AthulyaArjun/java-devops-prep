/**
 * reduce() is a terminal operation used to combine all elements of a stream into a single result.
 * eg:
 * [10, 20, 30, 40]
 *         |
 *         ↓
 *   Add all numbers
 *         |
 *         ↓
 *         100
 * Many elements → One final value.
 * Syntax: stream.reduce(identity, accumulator)
 * It has 2 parts
 * A. Identity: The initial value
 * e.g. for addition it is 0 and for multiplication it is 1
 * B. Accumulator: A lambda expression that tells java how to combine the values
 * e.g. (a,b) -> a+b
 * a -> current result
 * b -> next element in the stream
 * Why use reduce()?
 * We use it when we want to convert a stream into one single value:
 * Examples:
 * Sum of all numbers
 * Product of all numbers
 * Maximum value
 * Minimum value
 * Combining strings
 * Complex object calculations (e.g., total salary of employees)
 * | Operation  | Purpose                                     |
 * | ---------- | ------------------------------------------- |
 * | `map()`    | Transform each element into another element |
 * | `reduce()` | Combine all elements into one result        |
 */

package Streams;

import java.util.Arrays;
import java.util.List;

public class ReduceMethod_14 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30);

        int sum = list.stream()
                .reduce(0,(a,b) -> a+b);
        System.out.println("sum: "+sum);

        int product = list.stream()
                .reduce(1, (a,b) -> a*b);
        System.out.println("product: "+product);
    }
}
