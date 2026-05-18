/**
 * Encapsulation means hide data from direct access
 *
 * Tiny Real-World Analogy
 * ATM machine.
 * You cannot directly access:
 * bank database
 * balance
 * pin
 *
 * You must go through:
 * buttons
 * validation
 * authentication
 *
 * That is encapsulation.
 * Data is hidden and controlled
 */

package OOPS;

public class Encapsulation_6 {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountHolder("Athulya");
        bankAccount.setBalance(5000);

        System.out.println("Account Holder: "+bankAccount.getAccountHolder());
        System.out.println("Balance: "+bankAccount.getBalance());

        System.out.println();

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.setAccountHolder("Arjun");
        bankAccount1.setBalance(-86);

        System.out.println("Account Holder: "+bankAccount1.getAccountHolder());
        System.out.println("Balance: "+bankAccount1.getBalance());
    }
}

class BankAccount{
    private String accountHolder;
    private double balance;

   public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public void setBalance(double balance){
        if (balance>=0){
            this.balance = balance;
        }
        else {
            System.out.println("Invalid balance");
        }
    }

    public double getBalance(){
        return balance;
    }
}