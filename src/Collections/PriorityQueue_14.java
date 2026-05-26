/**
 * Priority Queue is a Queue implementation where elements are removed based on priority instead of insertion order.
 * Normal Queue follows FIFO. Whereas, in priority queue elements are automatically arranged by priority.
 * Default priority: smallest element first
 * e.g., Inserted 30, 10, 50, 20
 * Internally priority queue arranges it to 10, 20, 30, 50, so 10 is removed first not insertion order
 * Priority queue internally uses Heap Data Structure
 *
 * import java.util.PriorityQueue;
 * PriorityQueue<Type> pq = new PriorityQueue<>();
 *
 * | Method   | Purpose                 |
 * | -------- | ----------------------- |
 * | add()    | insert                  |
 * | offer()  | insert                  |
 * | remove() | remove highest priority |
 * | poll()   | remove highest priority |
 * | peek()   | view highest priority   |
 *
 * It allows duplicates but not null and is not thread-safe
 *
 * We can reverse priority using
 * PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
 * highest value gets highest priority
 */

package Collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue_14 {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        queue.add(10);
        queue.add(50);
        queue.add(30);
        queue.add(20);
        queue.add(5);
        queue.add(40);

        System.out.println(queue);

        queue.remove();
        System.out.println("Removing highest priority element: "+queue);

        queue.poll();
        System.out.println("Removing highest priority element: "+queue);

        System.out.println("Current highest priority: "+queue.peek());


        pq.offer(10);
        pq.offer(50);
        pq.offer(30);
        pq.offer(20);
        pq.offer(5);
        pq.offer(40);

        System.out.println(pq);

        pq.remove();
        System.out.println("Removing highest priority element: "+pq);

        pq.poll();
        System.out.println("Removing highest priority element: "+pq);

        System.out.println("Current highest priority: "+pq.peek());

        pq.add(null); // NullPointerException



    }
}

/**
 * P.S. PriorityQueue does NOT fully sort elements internally.
 * It maintains: Heap Structure. Meaning only: highest priority element guaranteed at top. NOT complete sorting.
 */