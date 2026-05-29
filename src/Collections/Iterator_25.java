/**
 * To traverse collections, we use for each or for loops. But Collections provide a standard traversal tool.
 * Iterator works with list and sets
 *
 * Syntax:
 * import java.util.Iterator;
 * Iterator<Integer> it = list.iterator();

 * | Method    | Purpose                  |
 * | --------- | ------------------------ |
 * | hasNext() | Checks if element exists |
 * | next()    | Returns next element     |
 * | remove()  | Removes current element  |
 */

package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_25 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

/*
| Iterator                   | For-each                 |
| -------------------------- | ------------------------ |
| Can remove elements safely | Cannot remove safely     |
| More control               | Simpler                  |
| Works on all collections   | Works on all collections |

 */