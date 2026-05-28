/**
 * | Traversal Method | What Traverses       |
 * | ---------------- | -------------------- |
 * | keySet()         | Returns all keys     | Since Keys are unique, Java returns them as a Set
 * | values()         | Returns all values   | values() --> Returns Collection of all values
 * | entrySet()       | key + value together |
 */

package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTraversal_23 {
    public static void main(String[] args) {
        HashMap<Integer, String > map = new HashMap<>();

        map.put(101,"Java");
        map.put(102,"AWS");
        map.put(103,"Docker");

        System.out.println("Keys: ");
        for (Integer key : map.keySet()){
            System.out.println(key);
        }

        System.out.println("Values: ");
        for (String value: map.values()){
            System.out.println(value);

        }

        System.out.println("Key-Value Pairs: ");
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " --> " + entry.getValue());
            
        }

    }
}

/*
| keySet()                  | entrySet()             |
| ------------------------- | ---------------------- |
| returns only keys         | returns key-value pair |
| requires get() for values | direct access          |
| slightly slower           | more efficient         |

 */