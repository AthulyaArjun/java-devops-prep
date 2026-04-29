/**
 * An element is a majority element if it appears more than n/2 times.
 * Example:
 * 2 2 1 1 2 2 2
 * Size = 7
 * n/2 = 3
 * 2 appears 5 times, so output
 * Majority element is: 2
 */
package Arrays;

import java.util.Scanner;

public class MajorityElement_25 {

    public int majorityElement(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > n / 2) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter "+ size +" elements:");
        for (int i = 0; i< size; i++){
            arr[i] = sc.nextInt();
        }

        MajorityElement_25 obj = new MajorityElement_25();

        int result = obj.majorityElement(arr);
        if (result!= -1){
            System.out.println("Majority element in the array is:"+result);
        }
        else {
            System.out.println("No majority element");
        }

        sc.close();
    }
}
