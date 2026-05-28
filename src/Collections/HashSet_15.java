/**
 * A Set is a collection that stores unique elements and does not allow duplicates.
 * | Property       | Description                                                            |
 * | -------------- | ---------------------------------------------------------------------- |
 * | No duplicates  | Automatically prevents adding duplicate elements                       |
 * | No indexing    | Unlike lists, you can't access elements by index (no `get(int index)`) |
 * | Iteration only | Use `for-each` or iterator to loop through elements                    |
 * | Types of Sets  | `HashSet`, `LinkedHashSet`, `TreeSet`                                  |

 * HashSet is a class in Java Collections Framework  that implements Set interface and is used to store unique
 * elements only. If duplicate data is inserted, it is automatically ignored.

 * Characteristics
 * | Feature     | Explanation                     |
 * | ----------- | ------------------------------- |
 * | Duplicates  | ❌ Not allowed                   |
 * | Order       | ❌ Not maintained                |
 * | Null values | ✅ One null allowed              |
 * | Index       | ❌ No indexing                   |
 * | Speed       | ✅ Very fast searching/insertion |

 * Internal Working:
 * HashSet internally uses HashMap.
 *  Java converts the element into a hash value using hashing mechanism.
 *  Stores it in memory buckets
 *  Helps fast searching

 * Syntax:
 * import java.util.HashSet;
 * HashSet<Type> hashSet = new HashSet<>();

 * add(value) --> To insert elements, duplicates ignored
 * remove(value) --> To delete an element. If element exists, it is deleted. if element doesn't exist, nothing happens
 * contains(value) --> check whether an element exists. returns true or false
 * size() --> returns total number of elements
 * isEmpty() --> checks whether HashSet is empty, returns true or false
 * clear() --> removes all elements from HashSet
 *
 */

package Collections;

import java.util.HashSet;

public class HashSet_15 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(30);
        hashSet.add(null);
        hashSet.add(null);

        System.out.println(hashSet);

        hashSet.remove(40);
        System.out.println("After removing 40: "+hashSet);

        System.out.println("Does set contain 10?: "+hashSet.contains(10));

        System.out.println("Size of set: "+hashSet.size());

        System.out.println("Is set empty?: "+hashSet.isEmpty());

        hashSet.clear();
        System.out.println("Is set empty now? : "+hashSet.isEmpty());
    }
}

/*
ArrayList remove() can remove by index and value.
HashSet remove() can only remove by value.

 */