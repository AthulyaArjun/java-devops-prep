package BasicsJava;

import java.util.Scanner;
/**
 * With Scanner class, program interacts with user
 * import java.util.Scanner; --> imports Scanner class
 * Scanner sc = new Scanner(System.in); --> create Scanner object
 * sc --> tool for taking input
 *
 * methods of Scanner class include:
 * | Method        | Used For      |
 * | ------------- | ------------- |
 * | nextInt()     | integer       |
 * | nextDouble()  | decimal       |
 * | nextLine()    | full sentence |
 * | next()        | single word   |
 * | nextBoolean() | true/false    |
 */
public class Scanner_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter age:");
        int age = sc.nextInt();

        System.out.println("Enter cgpa");
        double cgpa = sc.nextDouble();

        System.out.println("Are you placed? True or False?");
        boolean isPlaced = sc.nextBoolean();

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("CGPA: "+cgpa);
        System.out.println("Placement Status: "+isPlaced);

        sc.close();
    }
}


/**
 * Very Common Problem
 * nextInt() + nextLine() issue
 *
 * int age = sc.nextInt();
 * String name = sc.nextLine();
 * name gets skipped
 *
 * Why?
 * Because nextInt() leaves Enter key (\n) in buffer.
 *
 * Solution
 *Always use an extra sc.nextLine() if a string follows after an int
 *
 * int age = sc.nextInt();
 * sc.nextLine(); // clears buffer
 * String name = sc.nextLine();
 */