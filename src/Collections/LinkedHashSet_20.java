/**
 * LinkedHashSet solves one major problem of HashSet. HashSet removes duplicates but does not maintain insertion order.
 * LinkedHashSet is a class that stores unique elements, removes duplicates and maintains insertion order.

 * | Feature     | Explanation                  |
 * | ----------- | ---------------------------- |
 * | Duplicates  | ❌ Not allowed                |
 * | Order       | ✅ Maintained                 |
 * | Null values | ✅ One null allowed           |
 * | Indexing    | ❌ No indexing                |
 * | Speed       | Slightly slower than HashSet |
 * Why is LinkedHashSet slower?
 * Because it additionally maintains linked list connections for order tracking. More work internally.

 * LinkedHashSet internally uses hashing and doubly linked list. hashing for fast searching and linked list
 * for maintaining insertion order.

 * Syntax:
 * import java.util.LinkedHashSet;
 * LinkedHashSet<Type> set = new LinkedHashSet<>();
 */

package Collections;
import java.util.LinkedHashSet;
public class LinkedHashSet_20 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(40);
        set.add(null);
        set.add(50);
        set.add(null);

        System.out.println(set);

        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println(fruits);
    }
}
