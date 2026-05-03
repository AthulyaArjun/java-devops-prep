/**
 * Input --> [1, 2, 3, 4]
 * Prefix Sum --> [1, 3, 6, 10]
 * Meaning:
 * index 0 → 1
 * index 1 → 1 + 2 = 3
 * index 2 → 1 + 2 + 3 = 6
 * index 3 → 1 + 2 + 3 + 4 = 10
 *
 * prefix[i] = prefix[i-1] + arr[i]
 */

package Arrays;

import java.util.Scanner;

public class PrefixSumArray_31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter "+size+" elements:");

        if (size == 0){
            System.out.println("Array is empty");
            return;
        }

        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int[] prefix = new int[size];

        prefix[0] = arr[0];

        for (int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for (int n: prefix){
            System.out.print(n+" ");

        }

        sc.close();
    }
}
