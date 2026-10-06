package LeetCodePractices.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i< nums.length; i++){
            int required = target - nums[i];

            if (map.containsKey(required)){
                return new int[]{map.get(required),i};
            }

            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter "+size+" elements:");

        for (int i=0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the target: ");
        int target = sc.nextInt();

        int[] result = obj.twoSum(nums,target);

        System.out.println(result[0] +","+ result[1]);

        sc.close();

    }
}
