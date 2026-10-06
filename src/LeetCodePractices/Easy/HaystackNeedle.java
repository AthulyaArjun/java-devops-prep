package LeetCodePractices.Easy;

import java.util.Scanner;

public class HaystackNeedle {

    public int strStr(String haystack, String needle){
        int m = haystack.length();
        int n = needle.length();


        for (int i=0; i<=m-n; i++){
            boolean match = true;
            for (int j=0; j<n; j++){
                if (haystack.charAt(i+j) != needle.charAt(j) ){
                    match = false;
                    break;
                }
            }
            if (match){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter haystack:");
        String haystack = sc.next();

        System.out.println("Enter needle: ");
        String needle = sc.next();

        HaystackNeedle obj = new HaystackNeedle();

        int result = obj.strStr(haystack,needle);
        System.out.println(result);

        sc.close();

    }
}
