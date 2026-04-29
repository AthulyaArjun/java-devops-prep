package Arrays;

import java.util.Scanner;

public class BuyAndSell_24 {

    public int calculateProfit(int[] arr){

        int maxProfit = 0;
        int minPrice = arr[0];

        for (int i=1; i<arr.length; i++){
         int currentPrice = arr[i];
         if (currentPrice<minPrice){
             minPrice = currentPrice;
         }

         int profit = currentPrice - minPrice;

         if (profit>maxProfit){
             maxProfit = profit;
         }

        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter "+size+" elements:");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        BuyAndSell_24 obj = new BuyAndSell_24();

        System.out.println("Maximum possible profit is:"+obj.calculateProfit(arr));

        sc.close();
    }
}
