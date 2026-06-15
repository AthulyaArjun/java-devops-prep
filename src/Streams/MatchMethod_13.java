/**
 * anyMatch(), allMatch(), noneMatch() -->Terminal Operations used for checking conditions on stream elements
 * anyMatch() → "Does at least one element satisfy this condition?"
 * allMatch() → "Do all elements satisfy this condition?"
 * noneMatch() → "Do no elements satisfy this condition?"

 * 1.anyMatch(): returns a boolean
 * Syntax: stream.anyMatch(condition)
 * 2.allMatch(): returns a boolean
 * Syntax: stream.allMatch(condition)
 * 3.noneMatch(): returns a boolean
 * Syntax: stream.noneMatch(condition)
 * | Method        | Meaning                      | Return Type |
 * | ------------- | ---------------------------- | ----------- |
 * | `anyMatch()`  | At least one element matches | `boolean`   |
 * | `allMatch()`  | Every element matches        | `boolean`   |
 * | `noneMatch()` | No elements match            | `boolean`   |
 * All three are:

 * ✅ Terminal operations
 * ✅ Return boolean
 * ✅ Stop early as soon as the answer is known (short-circuiting)
 */

package Streams;

import java.util.Arrays;
import java.util.List;

public class MatchMethod_13 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,5);
        boolean result1 = numbers.stream()
                .anyMatch(n -> n%2 == 0);
        System.out.println(result1);
        System.out.println();

        boolean result2 = numbers.stream()
                .allMatch(n -> n%2 == 0);
        System.out.println(result2);
        System.out.println();

        boolean result3 = numbers.stream()
                .noneMatch(n -> n%2 == 0);
        System.out.println(result3);
        System.out.println();

    }
}
