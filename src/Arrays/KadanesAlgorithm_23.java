/**
 * You are given:
 * An array of integers (can include positive and negative numbers)
 * 👉 Your task is to find the maximum possible sum of any continuous sub array.
 */


package Arrays;

import java.util.Scanner;

public class KadanesAlgorithm_23 {

    public int kadane(int[] arr){

        int currentSum = 0;

        int maxSum = arr[0];

        for (int i=0; i<arr.length; i++){
            currentSum += arr[i];

            if (currentSum>maxSum){
                maxSum = currentSum;
            }

            if (currentSum<0){
                currentSum = 0;
            }

        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter "+size+" elements:");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }


        KadanesAlgorithm_23 kadane = new KadanesAlgorithm_23();


        System.out.println("Maximum possible sum is: "+kadane.kadane(arr));

        sc.close();

    }
}
