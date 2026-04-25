package Arrays;

import java.util.Scanner;

public class LargestInArray_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter "+size+" elements:");

        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];

        for (int i=1; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        System.out.println("Largest in the array is: "+largest);

        sc.close();
    }
}
