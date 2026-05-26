/**
 * Queue is a linear data structure that follows FIFO (First In First Out). The first inserted element is removed first.
 * Queue Structure
 * FRONT → [10][20][30][40] ← REAR
 * Insertion happens at REAR
 * Removal happens at FRONT

 * Queue is an interface, so we cannot create object directly.
 * Queue<Integer> q = new Queue<>(); ❌ Invalid:

 * Common Queue Implementations
 * | Class         | Description         |
 * | ------------- | ------------------- |
 * | LinkedList    | Most common         |
 * | PriorityQueue | Priority-based      |
 * | ArrayDeque    | Faster modern queue |

 * Imports Required:
 * import java.util.Queue;
 * import java.util.LinkedList;

 * Syntax:
 * Queue<Type> queue = new LinkedList<>();

 * | Method    | Purpose        |
 * | --------- | -------------- |
 * | add()     | insert element |
 * | offer()   | insert element |
 * | remove()  | remove front   |
 * | poll()    | remove front   |
 * | peek()    | view front     |
 * | element() | view front     |

 * 1. add() v/s offer() --> both to insert element
 * add() --> throws exception if insertion fails
 * offer() --> returns false

 * 2. remove() v/s poll() --> both removes front
 * remove() --> throws exception if queue is empty
 * poll() --> returns null

 * 3. peek() v/s element() --> both view front element
 * peek() --> returns null if empty
 * element() --> throws exception
 */

package Collections;

import java.util.*;

public class Queue_13 {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println(queue);

        queue.remove();

        System.out.println(queue);

        queue.poll();

        System.out.println(queue);

        System.out.println("Front element: "+queue.peek());
        System.out.println("Front element: "+queue.element());

        queue.clear();

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.remove());
        System.out.println(queue.element());



    }
}

/**
 * Queue does NOT support indexing
 * Invalid: queue.get(0);
 * Because Queue is designed around:
 * front
 * rear
 * not random access
 */