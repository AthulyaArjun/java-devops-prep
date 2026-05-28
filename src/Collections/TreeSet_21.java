/**
 * A TreeSet is a class that stores unique elements, removes duplicates, and automatically sorts elements.
 * Default Sort: Ascending
 * Strings get sorted alphabetically

 * | Feature            | Explanation    |
 * | ------------------ | -------------- |
 * | Duplicates         | ❌ Not allowed  |
 * | Order              | ✅ Sorted order |
 * | Sorting            | ✅ Automatic    |
 * | Null values        | ❌ Not allowed  | --> null cannot be compared during sorting operations.
 * | Indexing           | ❌ No indexing  |
 * | Internal Structure | Red-Black Tree |

 * | Collection    | Order Type      |
 * | ------------- | --------------- |
 * | HashSet       | Unordered       |
 * | LinkedHashSet | Insertion order |
 * | TreeSet       | Sorted order    |

 * TreeSet internally uses Red-Black Tree which is a self-balancing binary search tree.
 * Syntax:
 * import java.util.TreeSet;
 * TreeSet<Type> set = new TreeSet<>();

 * TreeSet elements must be: comparable
 * Meaning: Java must know how to compare them for sorting. Integers and Strings already support comparison.
 * Custom objects require special handling later using:
 * Comparable
 * Comparator

 | Method     | Purpose              |
 | ---------- | -------------------- |
 | first()    | the smallest element     |
 | last()     | the largest element      |
 | higher(x)  | next greater element | returns null if no element is greater
 | lower(x)   | next smaller element | returns null if no element is smaller
 | ceiling(x) | greater or equal element | returns null if no greater/equal element exists |
 | floor(x)   | smaller or equal element | returns null if no smaller/equal element exists |

 */

package Collections;

import java.util.TreeSet;

public class TreeSet_21 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(10);
        //set.add(null); --> NullPointerException

        System.out.println(set);

        System.out.println("Smallest element: "+set.first());
        System.out.println("Largest element: "+set.last());

        System.out.println("Larger than 30: "+set.higher(30));
        System.out.println("Smaller than 30: "+set.lower(30));

        System.out.println("Greater than or equal to 25: "+set.ceiling(25));
        System.out.println("Less than or equal to 25: "+set.floor(25));
    }
}
