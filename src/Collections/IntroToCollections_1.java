package Collections;

public class IntroToCollections_1 {
    public static void main(String[] args) {
        String message = """
                
                Collection framework in Java is a unified architecture to store, manipulate and process groups 
                of objects efficiently.
                --> Collection framework is a set of interfaces + classes to store and manipulate data efficiently.
                
                Before collections, java used array which:
                has fixed size
                can hold data of only same data type
                lack in-built methods to add, sort, remove, search
                
                Collections overcome all these problems:
                dynamic size
                flexible
                built-in methods- add, remove,contains etc.
                """;
        System.out.println(message);

        String coreInterfaces = """
                | Interface    | Description                                                                        |
                | ------------ | ---------------------------------------------------------------------------------- |
                | `Collection` | Root of all interfaces (super-interface)                                           |
                | `List`       | Ordered collection with duplicates allowed (e.g., `ArrayList`)                     |
                | `Set`        | Unordered collection with **no duplicates** (e.g., `HashSet`)                      |
                | `Queue`      | Follows FIFO (First-In-First-Out) order (e.g., `LinkedList`, `PriorityQueue`)      |
                | `Map`        | Stores data as key-value pairs (e.g., `HashMap`) — **not a child of `Collection`** |
                
                Collection
                 ├── List
                 ├── Set
                 └── Queue
                Map (separate hierarchy)
                
                
                
                             Iterable
                                |
                           Collection
                           /    |     \
                        List   Set   Queue
                         |      |      |
                     ArrayList HashSet PriorityQueue
                     LinkedList TreeSet ...
                
                     Map (not part of Collection)
                         |
                     HashMap, TreeMap, LinkedHashMap
                
                
                
                """;
        System.out.println(coreInterfaces);
    }
}

/*
| `Collection`                 | `Collections`                                 |
| ---------------------------- | --------------------------------------------- |
| An **interface**             | A **utility class**                           |
| Defines methods like `add()` | Has static methods like `sort()`, `reverse()` |
| Part of `java.util` package  | Also part of `java.util` package              |
| Example: `List`, `Set`       | Example: `Collections.sort(list)`             |
L – List → Ordered, Duplicates allowed ✅
S – Set → Unordered, No duplicates ❌
M – Map → Key-value pairs (unique keys, values can repeat)

“Is Map a part of Collection interface?”
✅ No, it’s a separate interface because it's not a collection of individual elements — it's a collection
of key-value pairs.

✅ Collection vs Map – Two Separate Interfaces
🔷 Collection Interface
It’s the root interface for all single-element collections (like lists, sets, queues).

Located in java.util.Collection

Extended by:

List

Set

Queue

🧠 Think of it like a bag of items — all elements are treated individually.
Collection<String> items = new ArrayList<>();
Map Interface
It is not a subtype of Collection

Located in java.util.Map

It deals with key-value pairs

Implemented by:

HashMap

TreeMap

LinkedHashMap

Hashtable

🧠 Think of it like a dictionary — each key maps to a specific value.
Map<Integer, String> users = new HashMap<>();
users.put(1, "Athulya");
users.put(2, "Riya");


 */