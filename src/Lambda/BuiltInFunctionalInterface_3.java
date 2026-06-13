/**
 * Java 8 provides ready-made functional interfaces in java.util.function;
 * | Interface      | Method     | Takes   | Returns | Used in                   |
 * | -------------- | ---------- | ------- | ------- | ------------------------- |
 * | Predicate<T>   | `test()`   | Input   | boolean | `filter()`                |
 * | Function<T, R> | `apply()`  | Input   | Output  | `map()`                   |
 * | Consumer<T>    | `accept()` | Input   | Nothing | `forEach()`               |
 * | Supplier<T>    | `get()`    | Nothing | Output  | Creating/providing values |

 * Predicate<T>: A predicate represents a condition that checks something and returns true/false
 * Input → Check condition → Return boolean
 * method: test()
 * boolean test(T t);
 * T means the type of input.
 * It takes one parameter.
 * It always returns true or false.
 * with Streams, filter() expects a Predicate<T> because it needs a condition which returns true/false
 * Predicate is a built-in functional interface from the java.util.function package that
 * represents a condition. It takes one input using the test() method and returns a boolean value.

 * Function<T,R>: A Function represents an operation that takes one input and transforms it into another output
 * Input --> Transformation --> Output
 * method: apply()
 * R apply(T t)
 * T = input type
 * R = return type/result type
 * Function<Integer, Integer> --> Integer input, Integer Output

 * Consumer<T>: A Consumer represents an operation that takes an input and performs an action but does not return
 * any result.
 * Input → Action → No return
 * method: accept()
 * void accept(T t)
 * T = type of input
 * Return type = void (nothing)
 * Consumer is a built-in functional interface from java.util.function that accepts one
 * input using the accept() method and performs an action without returning any result.

 * Supplier<T>: A supplier represents an operation that provides a value without taking any input
 * No input → Generate/Provide → Output
 * method: get()
 * T get();
 * Takes no parameters
 * Returns a value of type T
 */

package Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionalInterface_3 {
    public static void main(String[] args) {
        Predicate<Integer> isEven =
                num -> num%2==0;
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(5));
        System.out.println();

        Function<Integer,Integer> cube =
                num -> num*num*num;
        Function<String, Integer> length =
                String::length;
        System.out.println(cube.apply(5));
        System.out.println(cube.apply(9));
        System.out.println(length.apply("Java"));
        System.out.println(length.apply("Athulya"));
        System.out.println();

        Consumer<String> printName = System.out::println;
        Consumer<Integer> square = num -> System.out.println(num*num);
        printName.accept("Athulya");
        printName.accept("Rio");
        square.accept(25);
        square.accept(14);
        System.out.println();

        Supplier<String> greeting = () -> "Hello Athulya";
        Supplier<Integer> random = () -> (int) (Math.random()*100);
        System.out.println(greeting.get());
        System.out.println(random.get());


    }
}

/*
| Predicate<T>        | Function<T, R>       |
| ------------------- | -------------------- |
| Checks a condition  | Transforms a value   |
| Input → boolean     | Input → output       |
| Method: `test(T t)` | Method: `apply(T t)` |
| Used in `filter()`  | Used in `map()`      |

| Interface     | Method              | Meaning                   |
| ------------- | ------------------- | ------------------------- |
| Predicate<T>  | `boolean test(T t)` | Check a condition         |
| Function<T,R> | `R apply(T t)`      | Convert input to output   |
| Consumer<T>   | `void accept(T t)`  | Perform action, no return |
| Supplier<T>   | `T get()`           | Return a value, no input  |

| Interface     | Method        | Takes    | Returns | Stream Relation           |
| ------------- | ------------- | -------- | ------- | ------------------------- |
| Predicate<T>  | `test(T t)`   | Input    | boolean | `filter()`                |
| Function<T,R> | `apply(T t)`  | Input    | Output  | `map()`                   |
| Consumer<T>   | `accept(T t)` | Input    | `void`  | `forEach()`               |
| Supplier<T>   | `get()`       | No input | Output  | Creating/providing values |

 */