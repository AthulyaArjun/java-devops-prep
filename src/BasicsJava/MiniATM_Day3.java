package BasicsJava;
import java.util.Scanner;
public class MiniATM_Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 50000;

        System.out.println("Enter your pin:");
        int pin = sc.nextInt();

        if (pin != 1234){
            System.out.println("Incorrect pin!...");
        }

        else {
            boolean isExit = false;
            do {
                System.out.println("Choose your option:");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Current Balance: " + balance);
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("Enter deposit amount:");
                        int deposit = sc.nextInt();
                        balance += deposit;
                        System.out.println("Updated Balance: " + balance);
                        System.out.println();
                        break;

                    case 3:
                        System.out.println("Enter withdraw amount:");
                        int withdraw = sc.nextInt();

                        if (withdraw > balance) {
                            System.out.println("Insufficient balance");
                            System.out.println();
                        } else {
                            balance -= withdraw;
                            System.out.println("Updated Balance: " + balance);
                            System.out.println();
                        }
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        isExit = true;
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            } while (!isExit);
        }

        sc.close();


    }
}
