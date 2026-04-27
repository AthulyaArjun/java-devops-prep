package Arrays;

import java.util.Scanner;

public class MissingNumber_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter "+size+" elements:");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Missing number is:");

        for (int i=0; i<arr.length-1; i++){
                if (arr[i+1]-arr[i]!= 1){
                    System.out.print(arr[i]+1);
                    break;
                }
        }

        sc.close();
    }
}


/**
 * if sequence starts from 1 to n
 * then
 * package Arrays;
 *
 * import java.util.Scanner;
 *
 * public class MissingNumber_15 {
 *     public static void main(String[] args) {
 *         Scanner sc = new Scanner(System.in);
 *
 *         System.out.println("Enter size:");
 *         int size = sc.nextInt();
 *
 *         int[] arr = new int[size];
 *
 *         System.out.println("Enter elements:");
 *         for (int i = 0; i < size; i++) {
 *             arr[i] = sc.nextInt();
 *         }
 *
 *         int expectedSum = (size + 1) * (size + 2) / 2;
 *
 *         int actualSum = 0;
 *
 *         for (int i = 0; i < size; i++) {
 *             actualSum += arr[i];
 *         }
 *
 *         int missingNumber = expectedSum - actualSum;
 *
 *         System.out.println("Missing number is: " + missingNumber);
 *
 *         sc.close();
 *     }
 * }
 */