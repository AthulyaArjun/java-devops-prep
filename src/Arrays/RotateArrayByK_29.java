package Arrays;

import java.util.Scanner;

public class RotateArrayByK_29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter "+size+" elements:");

        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter rotating factor:");
        int k = sc.nextInt();

        if (k>size){
            k = k%size;
        }

        int[] temp = new int[k];

        for (int i=0; i<k; i++){
            temp[i] = arr[i];
        }

        for (int i=0; i<arr.length-k; i++){
            arr[i] = arr[i+k];
        }

        for (int i = 0; i < k; i++) {
            arr[arr.length - k + i] = temp[i];
        }
        for (int n: arr){
            System.out.print(n+" ");

        }

        sc.close();
    }
}
