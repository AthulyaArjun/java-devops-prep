/**
 * Vector is a dynamic (resizable) array class similar to ArrayList. It stores elements dynamically, but is thread-safe.
 *Syntax:
 * import java.util.Vector;
 * Vector<Type> vector = new Vector<>();
 * | Feature         | ArrayList        | Vector       |
 * | --------------- | ---------------- | ------------ |
 * | Thread Safe     | No               | Yes          |
 * | Performance     | Faster           | Slower       |
 * | Synchronization | Not synchronized | Synchronized |
 * | Introduced      | Java 1.2         | Java 1.0     |
 * | Modern Usage    | Common           | Rare         |
 *
 * Synchronization means Only one thread can execute synchronized method/block at a time. This prevents data inconsistency in
 * multithreading. Since every operation is synchronized, Vector is slower than ArrayList.
 *
 */

package Collections;

import java.util.Vector;

public class Vector_11 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        vector.add(10);
        vector.add(20);
        vector.add(10);
        vector.add(30);
        vector.add(40);
        vector.add(20);
        vector.add(50);

        System.out.println("Initial vector: "+vector);

        vector.remove(2);
        vector.remove(Integer.valueOf(20));

        System.out.println("After removing: "+vector);

        System.out.println("Size: "+vector.size());
        System.out.println("Contains 10: "+vector.contains(10));
        System.out.println("Element at index 4: "+vector.get(4));
    }
}

/**
 * Iterable
 *    ↓
 * Collection
 *    ↓
 * List
 *    ├── ArrayList
 *    ├── LinkedList
 *    └── Vector
 *            ↓
 *          Stack

 * Does Stack directly implement List?
 * No. Stack extends Vector. Since Vector already implements List: Stack indirectly implements List
 */