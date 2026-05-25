package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOddEven_7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial size:");
        int size = sc.nextInt();

        System.out.println("Enter "+size+" elements:");

        for (int i=0; i<size; i++){
            list.add(sc.nextInt());
        }

        int odd_count = 0;
        int even_count = 0;
        for (Integer integer : list) {
            if (integer % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }
        }

        System.out.println("Odd elements: "+odd_count);
        System.out.println("Even elements: "+even_count);

        sc.close();
    }
}
