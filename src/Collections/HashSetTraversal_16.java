/**
 * Since HashSet has no indexing and no get(index) method, we access elements using for-each loop or iterator.

 * 1. For-Each Loop:
 * Syntax: for (dataType variable : collection)

 * 2. Using Iterator:
 * Iterator is very important in Java Collections. It is used for traversing collections and safely removing elements
 * during traversal, framework/internal processing

 * Syntax:
 * import java.util.Iterator;
 * Iterator<Type> iterator = collection.iterator();

 * | Method    | Purpose                    |
 * | --------- | -------------------------- |
 * | hasNext() | checks next element exists | is another element available? if yes, true
 * | next()    | returns next element       | returns current element and moves iterator forward
 */

package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTraversal_16 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println("Traversing HashSet: ");

        for (Integer num : set){
            System.out.print(num+" ");
        }

        System.out.println();
        Iterator<Integer> iterator = set.iterator();
        System.out.println("Traversing using Iterator:");

        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
            
        }

    }
}

/*
| for-each                              | Iterator                |
| ------------------------------------- | ----------------------- |
| Simple traversal                      | Advanced traversal      |
| Easy syntax                           | More control            |
| Cannot safely remove during traversal | Can safely remove       |
| Mostly used                           | Internally heavily used |
 */