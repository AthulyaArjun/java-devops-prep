package Arrays;

import java.util.Scanner;

public class SumOfArray_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter "+size+" elements: ");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;

        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        System.out.println("Sum of all elements in array: "+sum);

        sc.close();
    }
}
