package Collections;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetUnion_19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array: ");
        int size = sc.nextInt();

        int[] arr1 = new int[size];

        System.out.println("Enter "+size+" elements:");

        for (int i=0; i<size; i++){
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = {3,4,5,6};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1){
            set.add(num);
        }

        for (int num : arr2){
            set.add(num);
        }

        System.out.println("Union of 2 arrays: "+set);

    }
}
