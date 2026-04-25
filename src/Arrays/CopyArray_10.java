package Arrays;

import java.util.Scanner;

public class CopyArray_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter "+size+" elements: ");

        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int[] copyArray = new int[arr.length];

        for (int i=0; i<size; i++){
            copyArray[i] = arr[i];
        }

        System.out.println("Copied array: ");

        for (int n : copyArray){
            System.out.println(n);
        }

        sc.close();
    }
}
