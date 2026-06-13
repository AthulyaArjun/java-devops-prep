/**
 * A lambda expression is a short way to write an implementation of a functional interface.
 * Syntax: (parameters) -> {
     body
  }
 * It has 3 parts:
 * parameters --> input values
 * arrow operator -> separates parameter and implementation
 * body --> the code to execute
 * () -> System.out.println("Hello");
 * equivalent to void method() {
      System.out.println("Hello");
  }
 * A Lambda Expression, introduced in Java 8, is a concise way to provide the implementation of a
 * functional interface. It reduces boilerplate code by replacing anonymous classes and
 * enables functional programming features like Streams.
 */
package Lambda;

import java.util.Arrays;
import java.util.List;

public class IntroToLambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,10,20,30);

        numbers.stream()
                .filter(x -> x%2==0)
                .map(x -> x*2)
                .forEach(System.out::println);
    }
}
