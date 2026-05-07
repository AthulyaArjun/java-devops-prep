package Strings;

import java.util.Scanner;

public class RemoveSpace_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine();

        String s2 = s.replaceAll("\\s","");
        System.out.println(s2);

        sc.close();
    }
}
