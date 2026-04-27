package Arrays;

import java.util.Scanner;

public class RightRotate_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter "+size+" elements:");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int temp = arr[arr.length-1];

       for (int i=arr.length-1; i>0; i--){
           arr[i] = arr[i-1];
       }

        arr[0] = temp;

        System.out.println("After right rotation by one:");

        for (int n: arr){
            System.out.print(n+" ");
        }

        sc.close();
    }
}
