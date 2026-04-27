package Arrays;

import java.util.Scanner;

public class ElementFrequency_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter "+size+" elements:");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        boolean[] checkArray = new boolean[size];
        for (int i=0; i<arr.length; i++){

            int count = 1;

            if (checkArray[i]){
                continue;
            }

            for (int j=i+1; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    checkArray[j] = true;
                    count++;
                }
            }

            System.out.println(arr[i]+" occurs "+count+" times");
        }

        sc.close();
    }
}
