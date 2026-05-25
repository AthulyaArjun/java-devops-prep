/**
 * Collections.sort() --> utility method in java collections
 * required import --> import java.util.Collections;
 * Collections.sort(list); --> modifies ORIGINAL list directly. It does NOT create new sorted list.
 * Default sorting is ascending order
 * To get it in descending order
 * Collections.sort(list, Collections.reverseOrder())
 */

package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting_9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(27);
        list.add(13);
        list.add(56);
        list.add(49);
        list.add(11);

        System.out.println("Initial list: "+list);
        Collections.sort(list);
        System.out.println("After sorting: "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("In descending order: "+list);
    }
}
