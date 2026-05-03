/**
 * Find sum of range [L,R]
 * sum = prefix[R] - prefix[L-1]
 * if L==0
 * sum = prefix[R]
 */

package Arrays;

import java.util.Scanner;

public class PrefixRangeSum_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        if (size == 0) {
            System.out.println("Array is empty");
            return;
        }

        int[] arr = new int[size];
        int[] prefix = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Build prefix
        prefix[0] = arr[0];
        for (int i = 1; i < size; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        System.out.println("Enter left and right index:");
        int L = sc.nextInt();
        int R = sc.nextInt();

        if (L < 0 || R >= size || L > R) {
            System.out.println("Invalid range");
            return;
        }

        int sum;
        if (L == 0) {
            sum = prefix[R];
        } else {
            sum = prefix[R] - prefix[L - 1];
        }

        System.out.println("Sum of elements from index " + L + " to " + R + " is " + sum);

        sc.close();
    }
}

/**
 * We use prefix sum to avoid repeated calculations and make queries faster.
 * Suppose array:
 * [2, 4, 6, 8, 10]
 * You are asked:
 * 👉 Find sum from index 1 to 3
 * ❌ Normal way:
 * 4 + 6 + 8 = 18
 * 👉 You loop every time → O(n)
 *
 * 🚨 Now imagine:
 * 1 query → OK
 * 100 queries → slow
 * 10,000 queries → very slow
 *
 * 🚀 Solution: Prefix Sum
 * We precompute once:
 * prefix = [2, 6, 12, 20, 30]
 *
 * Now any query:
 * 👉 L = 1, R = 3
 * sum = prefix[3] - prefix[0]
 *      = 20 - 2
 *      = 18
 *
 * ⚡ Key Benefit
 * Approach	Time per query
 * Normal loop	O(n)
 * Prefix sum	O(1)
 * 👉 That’s a huge optimization
 */