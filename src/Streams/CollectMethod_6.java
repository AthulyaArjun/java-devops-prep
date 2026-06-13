/**
 * collect() is a terminal operation used to convert the processed stream into a collection or another final result.
 * forEach() → Do something with each element (usually print or perform an action)
 * collect() → Gather the processed elements and store them in a new object

 * | Collector                 | Purpose                      |
 * | ------------------------- | ---------------------------- |
 * | `Collectors.toList()`     | Convert stream into a List   |
 * | `Collectors.toSet()`      | Convert stream into a Set    |
 * | `Collectors.joining()`    | Join strings into one String |
 * | `Collectors.groupingBy()` | Group elements by a property |
 * | `Collectors.counting()`   | Count elements               |

 * | `forEach()`                               | `collect()`                             |
 * | ----------------------------------------- | --------------------------------------- |
 * | Performs an action on each element        | Gathers elements into a new object      |
 * | Usually used for printing or side effects | Used to store and return processed data |
 * | Returns `void`                            | Returns a collection or another result  |
 * | Terminal operation                        | Terminal operation                      |
 * Streams are generally non-mutating. They process data and produce a new result.
 */

package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethod_6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,20,25,30);

        List<Integer> even = numbers.stream()
                .filter(num -> num%2==0)
                .collect(Collectors.toList());
        
        System.out.print(even);
        
        
    }
}
