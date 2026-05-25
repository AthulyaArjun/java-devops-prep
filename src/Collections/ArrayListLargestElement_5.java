package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListLargestElement_5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial size:");
        int size = sc.nextInt();

        System.out.println("Enter "+size+" elements:");

        for (int i=0; i<size; i++){
            list.add(sc.nextInt());
        }

        int largest = list.get(0);

        for (int i=1; i<list.size(); i++){
            if (list.get(i)>largest){
                largest = list.get(i);
            }
        }

        System.out.println("Largest element is: "+largest);
        sc.close();
    }
}
