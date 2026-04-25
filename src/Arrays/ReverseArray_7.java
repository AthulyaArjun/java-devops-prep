package Arrays;

import java.util.Scanner;

public class ReverseArray_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter "+size+" elements:");

        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int[] reverse_array = new int[arr.length];

        for (int i=0; i<arr.length; i++){
            reverse_array[i] = arr[arr.length-i-1];
        }

        System.out.println("Reversed array is:");
        for (int n: reverse_array){
            System.out.println(n);
        }

        sc.close();
    }
}
