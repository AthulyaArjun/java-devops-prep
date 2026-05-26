/**
 * A LinkedList is a class in Java Collections used to store multiple elements dynamically like ArrayList.
 * But internally, storage is different.
 * ArrayList internally uses resizable array with continuous memory, whereas LinkedList uses Doubly linked list
 * (node based structure).
 * Each node contains:previous node address, Data, address of next node. each node points to next node
 * null <- [10] <-> [20] <-> [30] -> null
 *
 * Syntax:
 * import java.util.LinkedList;
 * LinkedList<Type> list = new LinkedList<>();
 * | Method        | Purpose             |
 * | ------------- | ------------------- |
 * | add()         | add element         |
 * | addFirst()    | insert at beginning |
 * | addLast()     | insert at end       |
 * | remove()      | remove element      |
 * | removeFirst() | remove first        |
 * | removeLast()  | remove last         |
 * | get()         | get element         |
 * | size()        | total elements      |
 * | set(index, value) | update element   |
 * | contains(value)   | checks existence |
 */

package Collections;

import java.util.LinkedList;

public class LinkedList_10 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.addFirst(5);
        list.addLast(60);

        System.out.println(list);

        list.remove(2);
        list.removeFirst();
        list.removeLast();

        System.out.println("First element: "+list.getFirst());
        System.out.println("Last element: "+list.getLast());
        System.out.println("LinkedList Size: "+list.size());
    }
}

/**
 * Internal Working
 * Suppose: numbers.addFirst(5);
 * LinkedList does NOT shift all elements. It simply creates new node and changes pointer.
 * That’s why insertion at beginning is very fast.

 * | Operation           | ArrayList | LinkedList |
 * | ------------------- | --------- | ---------- |
 * | Access by index     | Fast      | Slow       |
 * | Insert at beginning | Slow      | Fast       |
 * | Insert in middle    | Slow      | Faster     |
 * | Memory usage        | Less      | More       |

 * LinkedList access is slow because it must travel node by node. It cannot directly jump like array indexing.
 * When should we use LinkedList?
 * Use LinkedList when:
 * Frequent insertion/deletion
 * Less searching/accessing
 * Queue implementations
 * Dynamic node operations

 * Use ArrayList when:
 * Frequent searching/accessing
 * Reading data more.
 * Less insertion in middle

 * LinkedList implements:List, Deque,Queue
 * So LinkedList can behave like:List, Queue, Stack

 * Final Summary: ArrayList vs LinkedList
 * 🔹 They Are Similar Because:
 * Both are classes that implement the List interface but have different performance trade-offs.
 * Both support:
 * Duplicates ✅
 * Indexing ✅
 * Iteration ✅
 * Common methods: add(), remove(), get(), set(), contains(), etc.

 * Why memory usage is higher in LinkedList?
 * Because every node stores extra references/pointers.
 * ArrayList stores only data.
 * LinkedList stores:
 * data
 * next pointer
 * previous pointer
 * So memory increases.
 */