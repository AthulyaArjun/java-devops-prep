package Arrays;

import java.util.Scanner;

public class RearrangePositiveNegative_30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] < 0) {
                left++;
            }

            else if (arr[right] > 0) {
                right--;
            }

            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println("Rearranged array:");

        for (int n : arr) {
            System.out.print(n + " ");
        }

        sc.close();
    }
}