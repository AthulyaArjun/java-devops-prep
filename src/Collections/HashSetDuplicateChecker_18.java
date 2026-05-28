package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDuplicateChecker_18 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);

        int size = list.size();

        HashSet<Integer> set = new HashSet<>(list);

        if (set.size() < size){
            System.out.println("Duplicates present");
        }
        else {
            System.out.println("No duplicates");
        }
    }
}
