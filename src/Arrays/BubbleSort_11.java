package Arrays;

import java.util.Scanner;

public class BubbleSort_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter "+size+" elements:");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }


        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

        System.out.println("After sorting:");

        for (int n: arr){
            System.out.println(n);
        }

        sc.close();
    }
}
