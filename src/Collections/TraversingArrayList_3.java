/**
 * array --> array.length
 * ArrayList --> list.size()
 * Syntax for loop:
 * for (int i = 0; i < list.size(); i++) {
 *     System.out.println(list.get(i));
 * }
 *
 * Syntax for enhanced for loop
 * for (Integer value : list){
 *     System.out.println(value);
 * }
 */

package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class TraversingArrayList_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements to add:");
        int num = sc.nextInt();

        System.out.println("Enter "+num+" elements:");
        for (int i=0; i<num; i++){
           list.add(sc.nextInt());
        }

        System.out.println("Initial list:" +list);

        list.add(60);
        list.add(70);
        list.set(2,90);

        System.out.println("Traversing ArrayList using for loop ");
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }

        System.out.println();
        System.out.println("Traversing ArrayList using enhanced for loop");
        for (Integer n: list){
            System.out.print(n+" ");
        }

        sc.close();
    }
}
