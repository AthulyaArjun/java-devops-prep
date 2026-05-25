/**
 * ArrayList is a class in java.util package
 * It implements the List interface, which allows ordered collections with duplicate elements
 * Internally, ArrayList uses a resizable dynamic array
 * elements can be accessed using indices(like array), but with more flexibility

 * Key features of arraylist include:
 * allows duplicate elements
 * maintains insertion order
 * can dynamically resize when needed
 * provides methods like add(), remove(), get(), set(), contains(), size().
 * syntax:
 * import java.util.ArrayList;
 * ArrayList<Type> listName = new ArrayList<>();
 *
 * Collections work with object, not primitives hence the datatype should be of wrapper classes
 * Integer, String, Double etc
 */

package Collections;

import java.util.ArrayList;

public class ArrayListDemo_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        System.out.println("Initial List: "+list);

        System.out.println("Element at index 0: "+list.get(0));
        System.out.println("Element at index 2: "+list.get(2));

        list.set(3,40);

        System.out.println("Updated list after setting new value: "+list);

        list.remove(2);

        System.out.println("After removing element at index 2: "+list);

        list.remove(Integer.valueOf(40));
        System.out.println("After removing element 40: "+list);

        System.out.println("ArrayList size: "+list.size());

        System.out.println("List contains 30: "+list.contains(30));
        System.out.println("List contains 10: "+list.contains(10));

        list.clear();
        System.out.println("Clearing arraylist: "+list);

    }
}

/**
add() --> to add element

get(index) --> return element at specified index;

set(index, newValue) --> to update/replace element at specified index

Note: add() increases the size of arraylist, but set does not. If we try to set a new value to an unknown index,
it will throw IndexOutOfBoundsException

remove() --> to delete elements
two versions exist: 1. remove by index 2. remove by object/value
remove(index)
remove(Integer.valueOf(value))

size() --> returns number of elements in arraylist

contains(value) --> checks whether element exists in the list and returns true or false

clear(); --> removes all elements from the ArrayList

indexOf(value) --> returns index position or -1 if not found.
It will return the index of the first occurrence of element.
lastIndexOf(value) --> returns index position of value of last occurrence

 */