package Arrays;

import java.util.Scanner;

public class UnionArray_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first array:");
        int size1 = sc.nextInt();

        int[] arr1 = new int[size1];

        System.out.println("Enter "+ size1 +" elements:");
        for (int i = 0; i< size1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the second array:");
        int size2 = sc.nextInt();

        int[] arr2 = new int[size2];

        System.out.println("Enter "+ size2 +" elements:");
        for (int i = 0; i< size2; i++){
            arr2[i] = sc.nextInt();
        }

        System.out.println("Union of two array");

        for (int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }

        for (int i=0; i<arr2.length; i++){
            boolean isPresent = false;

            for (int j=0; j<arr1.length; j++){
                if (arr2[i] == arr1[j]){
                    isPresent = true;
                    break;
                }
            }
            
            if (!isPresent){
                System.out.print(arr2[i]+" ");
                
            }
        }

        sc.close();

    }
}
