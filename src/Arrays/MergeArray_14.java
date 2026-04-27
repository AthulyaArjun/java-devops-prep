package Arrays;

import java.util.Scanner;

public class MergeArray_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first array:");
        int size1 = sc.nextInt();

        int[] arr1 = new int[size1];

        System.out.println("Enter " + size1 + " elements:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }


        System.out.println("Enter the size of the second array:");
        int size2 = sc.nextInt();

        int[] arr2 = new int[size2];

        System.out.println("Enter " + size2 + " elements:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] merge = new int[size1+size2];

        for (int i=0; i<arr1.length; i++){
            merge[i] = arr1[i];
        }

        for (int i=0; i<arr2.length; i++){
            merge[size1+i] = arr2[i];
        }

        System.out.println("After merging: ");
        for (int n: merge){
            System.out.print(n+" ");
        }

        sc.close();
    }
}

