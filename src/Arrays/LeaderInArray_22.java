/**
 * An element is called a leader if there is no greater element on its right side.
 * Example:
 * Array: 16 17 4 3 5 2
 * Check from left:
 * 16 → not leader because 17 is on right
 * 17 → leader because no greater element on right
 * 4  → not leader because 5 is on right
 * 3  → not leader because 5 is on right
 * 5  → leader
 * 2  → leader because last element always leader
 */

package Arrays;

import java.util.Scanner;

public class LeaderInArray_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter "+size+" elements:");

        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Leaders in the array:");
        int maxRight = arr[arr.length-1];
        System.out.print(maxRight+" ");

        for (int i=arr.length-2; i>=0; i--){
            int currentElement = arr[i];
            if (currentElement>maxRight){
                System.out.print(currentElement+" ");
                maxRight = currentElement;
            }
        }

        sc.close();
    }
}
