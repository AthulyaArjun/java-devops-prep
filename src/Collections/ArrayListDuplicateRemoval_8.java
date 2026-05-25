package Collections;

import java.util.ArrayList;

public class ArrayListDuplicateRemoval_8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);

        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (Integer value: list){
            if (!uniqueList.contains(value)){
                uniqueList.add(value);
            }
        }

        System.out.println("Original List: "+list);
        System.out.println("After removing duplicates: "+uniqueList);
    }
}
