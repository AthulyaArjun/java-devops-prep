/**
 * A map stores data in key --> value pairs
 * Characteristics
 * | Feature           | Explanation               |
 * | ----------------- | ------------------------- |
 * | Key-Value Pair    | ✅ Stores data in pairs    |
 * | Duplicate Keys    | ❌ Not allowed             |
 * | Duplicate Values  | ✅ Allowed                 |
 * | One Value per Key | ✅ Yes                     |
 * | Fast Searching    | ✅ Very fast using hashing |
 *  Keys must be unique, if same key exists, second value replaces the first value and so on.

 *  | Map Type      | Behavior        |
 * | ------------- | --------------- |
 * | HashMap       | Unordered       |
 * | LinkedHashMap | Insertion order |
 * | TreeMap       | Sorted order    |

 * HashMap Syntax:
 * import java.util.HashMap;
 * HashMap<KeyType, ValueType> map = new HashMap<>();

 * | Method                 | Purpose                           |
 * | ---------------------- | --------------------------------- |
 * | put(key, value)        | insert key-value pair             |
 * | get(key)               | retrieve value using key          | get(key) returns null if the key does not exist.
 * | remove(key)            | delete key-value pair             | remove(key) returns the removed value.
 * | containsKey(key)       | check whether key exists          |
 * | containsValue(value)   | check whether value exists        |
 * | size()                 | returns total number of entries   |
 * | isEmpty()              | checks whether map is empty       |
 * | clear()                | removes all entries from the map  |
 */

package Collections;

import java.util.HashMap;

public class HashMap_22 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101,"Rari");
        map.put(102,"Arjun");
        map.put(103,"Rio");
        map.put(104,"Shyla");
        map.put(105,"Jinu");
        map.put(101,"Athulya");

        System.out.println(map);

        System.out.println("Value of 102: "+map.get(102));
        System.out.println("Removing 105: "+map.remove(105));
        System.out.println("Contains key 104: "+map.containsKey(104));
        System.out.println("Contains Value Rari: "+map.containsValue("Rari"));
        System.out.println("Size: "+map.size());
        System.out.println("Is map empty: "+map.isEmpty());
        map.clear();
        System.out.println("Is map empty now: "+map.isEmpty());

    }
}
