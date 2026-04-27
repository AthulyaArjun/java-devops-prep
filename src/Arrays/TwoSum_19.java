package Arrays;
import java.util.Scanner;
public class TwoSum_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter "+size+" elements:");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target to check:");
        int target = sc.nextInt();

        boolean found = false;
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] + arr[j] == target){
                    System.out.println(arr[i] +" "+arr[j]);
                    found = true;
                    break;
                }
            }

            if (found){
                break;
            }
        }

        if (!found){
            System.out.println("No pair found");
        }

        sc.close();
    }
}
