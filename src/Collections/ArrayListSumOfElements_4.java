package Collections;

import java.util.ArrayList;

public class ArrayListSumOfElements_4 {
    public static void main(String[] args) {
     ArrayList<Integer> arrayList = new ArrayList<>();

     arrayList.add(10);
     arrayList.add(20);
     arrayList.add(30);
     arrayList.add(10);

     int sum =0;

     for (Integer value: arrayList){
         sum += value;
     }

        System.out.println("Sum: "+sum);
    }
}
