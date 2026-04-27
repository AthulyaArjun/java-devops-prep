package Arrays;

import java.util.Scanner;

public class LeftRotate_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter "+size+" elements:");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int temp = arr[0];

        for (int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }

        arr[arr.length-1] = temp;

        System.out.println("After left rotation by one:");

        for (int n : arr){
            System.out.print(n+" ");
        }

        sc.close();
    }
}
