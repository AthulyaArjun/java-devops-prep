/**
 *
 */

package LeetCodePractices.Easy;

import java.util.Scanner;

public class BuyAndSellStock {

    public int maxProfit(int[] prices){
        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i=1; i<prices.length; i++){
            if (prices[i]< minPrice){
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            maxProfit = Math.max(profit,maxProfit);
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        int[] prices = new int[size];

        System.out.println("Enter "+size+" elements: ");
        for (int i=0; i<size; i++){
            prices[i] = sc.nextInt();
        }

        BuyAndSellStock stock = new BuyAndSellStock();

        int result = stock.maxProfit(prices);

        if (result !=0 ){
            System.out.println("Maximum profit is: "+result);
        }else {
            System.out.println(result);
        }

        sc.close();
    }
}
