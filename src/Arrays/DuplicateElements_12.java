package Arrays;

import java.util.Scanner;

public class DuplicateElements_12 {
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

            boolean isChecked = false;

            for (int k=0; k<i; k++){
                if (arr[i] == arr[k]){
                    isChecked = true;
                    break;
                }

            }

            if (isChecked){
                continue;
            }

            for (int j=i+1; j<arr.length; j++){
                if (arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }

        sc.close();
    }
}
