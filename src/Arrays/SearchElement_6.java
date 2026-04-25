package Arrays;

import java.util.Scanner;

public class SearchElement_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];


        System.out.println("Enter "+size+" elements: ");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search:");
        int key = sc.nextInt();
        boolean isPresent = false;


        for (int i=0; i<arr.length; i++){
            if (arr[i] == key){
                System.out.println("Element at index "+i+" in array");
                isPresent = true;
                break;
            }

        }

        if (!isPresent){
            System.out.println("Element not in array");
        }

        sc.close();
    }
}
