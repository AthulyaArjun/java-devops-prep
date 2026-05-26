/**
 * Stack is a linear data structure that follows LIFO (Last In First Out), meaning last inserted element is
 * removed first. Stack extends vector so indirectly implements List interface.
 * Syntax:
 * import java.util.Stack;
 * Stack<Type> stack = new Stack<>();
 * | Method   | Purpose        |
 * | -------- | -------------- |
 * | push()   | insert element |
 * | pop()    | remove top     |
 * | peek()   | view top       |
 * | empty()  | check empty    |
 * | search() | search element |
 *
 * Since Stack extends Vector, stack is also thread-safe.
 *
 * search() returns 1-based position from TOP if element exists, otherwise returns -1.
 * Position counting starts from TOP =1. not from bottom or index
 *
 * | Return Value    | Meaning           |
 * | --------------- | ----------------- |
 * | positive number | position from top |
 * | -1              | element not found |
 */
package Collections;

import java.util.Stack;

public class Stack_12 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(10);
        stack.push(30);
        stack.push(40);

        System.out.println("Initial Stack: "+stack);

        stack.pop(); // removes top

        System.out.println("After pop: "+stack);

        System.out.println("Top element: "+stack.peek());

        System.out.println("Is empty: "+stack.empty());

        System.out.println("Search 30: "+stack.search(30));

        System.out.println("Size: "+stack.size());
    }
}

/**
 * What happens if we call pop() on empty stack?
 * stack.pop();
 * on empty stack throws:EmptyStackException. Same for:peek() on empty stack.
 */