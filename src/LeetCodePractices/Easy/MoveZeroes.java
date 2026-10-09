package LeetCodePractices.Easy;

import java.util.Scanner;

public class MoveZeroes {
    public void moveZero(int[] nums){
        int position = 0;

        for (int i=0; i< nums.length; i++){
            if (nums[i] != 0){
                nums[position++] = nums[i];
            }
        }

        for (int i=position; i< nums.length; i++){
            nums[i] =0;
        }

        for (int n: nums){
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter "+size+ " elements: ");
        for (int i=0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        MoveZeroes obj = new MoveZeroes();

        obj.moveZero(nums);

        sc.close();
    }
}
