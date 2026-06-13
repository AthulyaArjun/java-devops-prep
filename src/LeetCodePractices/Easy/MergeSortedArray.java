package LeetCodePractices.Easy;

import java.util.Scanner;

public class MergeSortedArray {

    public void mergeArray(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;   // points to last real element of nums1
        int p2 = n - 1;   // points to last element of nums2
        int p  = m + n - 1; // points to last position of nums1

        // compare from the end, place larger element at position p
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // if nums2 still has remaining elements, place them
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }

        // print result
        for (int i : nums1) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take nums1 input
        System.out.println("Enter number of elements in nums1 (m):");
        int m = sc.nextInt();

        int[] nums1 = new int[m + 3]; // extra space for nums2 elements
        System.out.println("Enter " + m + " sorted elements for nums1:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        // take nums2 input
        System.out.println("Enter number of elements in nums2 (n):");
        int n = sc.nextInt();

        int[] nums2 = new int[n];
        System.out.println("Enter " + n + " sorted elements for nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        System.out.println("Merged sorted array:");
        MergeSortedArray obj = new MergeSortedArray();
        obj.mergeArray(nums1, m, nums2, n);

        sc.close();
    }
}