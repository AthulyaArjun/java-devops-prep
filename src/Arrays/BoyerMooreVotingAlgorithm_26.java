/**
 * Boyer Moore Voting Algorithm is the optimized version of Majority Element
 * It reduces the TC from O(n^2) to O(n) and SC to O(1)
 *
 * Same like in voting, same numbers support each other, different number cancel each other
 * end -->strongest survives
 */

package Arrays;

import java.util.Scanner;

public class BoyerMooreVotingAlgorithm_26 {

    public void boyerMoore(int[] arr){

        int count = 0;
        int candidate = 0;

        for (int i=0; i<arr.length; i++){
            if (count == 0){
               candidate  = arr[i];
            }

            if (arr[i] == candidate){
                count++;
            }
            else {
                count--;
            }
        }

        int frequency = 0;

        for (int i=0; i<arr.length; i++){
            if (arr[i] == candidate){
                frequency++;
            }
        }

        if (frequency>arr.length/2){
            System.out.println("Majority element is:"+candidate);
        }
        else {
            System.out.println("No majority element");
        }

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

        BoyerMooreVotingAlgorithm_26 boyer = new BoyerMooreVotingAlgorithm_26();

        boyer.boyerMoore(arr);

        sc.close();
    }
}
