/**
 * min() and max() are terminal operations and return an Optional object.
 * It returns Optional object because it may or may not have a result. Instead of returning null and causing
 * a NullPointerException, java returns Optional.empty()
 * Integer::compareTo() --> method reference
 * It compares two integers
 * a < b → negative number
 * a = b → 0
 * a > b → positive number
 * min() and max() return an Optional because the stream might be empty. Instead of returning null and causing
 * a NullPointerException, Java returns Optional.empty() to safely represent the absence of a value
 * optional.orElse(defaultValue)
 * is safer because it provides a fallback value when the Optional is empty.
 */

package Streams;

import java.util.*;

public class MinMaxMethod_15 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,50,20,90,40);
        Optional<Integer> minimum = list.stream()
                .min(Integer::compareTo);
        Optional<Integer> minimumComparator = list.stream()
                        .min(Comparator.naturalOrder());
        System.out.println(minimumComparator.get());
        System.out.println(minimum.get());
        System.out.println();
        Optional<Integer> maximum = list.stream()
                .max(Integer::compareTo);
        System.out.println(maximum.get());
        Optional<Integer> maximumComparator = list.stream()
                .max(Comparator.naturalOrder());
        System.out.println(maximumComparator.get());

        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(5);
        list1.add(5);

        int min = list1.stream()
                .min(Integer::compareTo)
                .orElse(0);

        System.out.println(min);
    }
}
