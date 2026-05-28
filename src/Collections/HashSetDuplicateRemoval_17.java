package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDuplicateRemoval_17 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(40);
        list.add(10);

        System.out.println("Array List: "+list);

        HashSet<Integer> set = new HashSet<>(list);// take all elements from ArrayList and inserts them into HashSet

        System.out.println("After removing duplicates: "+set);

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("Original Fruits List: " + fruits);

        HashSet<String> fruitSet = new HashSet<>(fruits);

        System.out.println("After Removing Duplicates: " + fruitSet);
    }
}
