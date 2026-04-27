package Arrays;

import java.util.Scanner;

public class RemoveDuplicate_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter "+size+" elements:");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        //sorting array

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }



        System.out.println("After sorting: ");
        for (int n: arr){
            System.out.print(n+" ");
        }

        System.out.println();
        //removing duplicates

        System.out.println("After removing duplicates:");

        int[] unique = new int[size];
        int j = 0;
        unique[j++] = arr[0];

        for (int i=1; i<arr.length; i++){
            if (arr[i] != arr[i-1]){
                unique[j++] = arr[i];
            }
        }

        for (int i=0; i<j; i++){
            System.out.print(unique[i]+" ");
        }

        sc.close();
    }
}
