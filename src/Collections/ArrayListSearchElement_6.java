package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSearchElement_6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial size:");
        int size = sc.nextInt();

        System.out.println("Enter "+size+" elements:");

        for (int i=0; i<size; i++){
            list.add(sc.nextInt());
        }

        System.out.println("Enter element to search: ");
        int key = sc.nextInt();

        int index = list.indexOf(key);

        if (index != -1){
            System.out.println(key + " found at index: " + index);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
