/**
 * arr1 = 1 2 3 4
 * arr2 = 2 3 5
 * output -->2 3
 * only common elements
 */

package Arrays;

import java.util.Scanner;

public class IntersectionOfArray_28 {
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

        System.out.println("Intersection of two arrays:");

        for (int i=0; i<arr1.length; i++){
            for (int j=0; j<arr2.length; j++){
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i]+" ");
                    break;
                }
            }

        }

        sc.close();

    }
}
