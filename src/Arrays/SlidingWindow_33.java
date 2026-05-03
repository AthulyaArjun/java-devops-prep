package Arrays;

public class SlidingWindow_33 {
    public static void main(String[] args) {
        int [] arr = {2,1,5,1,3,2};
        int k = 3;

        //1.first window
        int windowSum = 0;

        for (int i=0; i<k; i++){
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        //2. slide
        for (int i=k ; i<arr.length; i++){
            windowSum = windowSum-arr[i-k] + arr[i];
            if (windowSum > maxSum){
                maxSum = windowSum;
            }
        }

        System.out.println("Maximum sum in the subarray is: "+maxSum);
    }
}
