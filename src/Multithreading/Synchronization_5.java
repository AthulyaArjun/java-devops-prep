/**
 * In a Bank Account, Balance=1000;
 * Two threads withdrawing 100 simultaneously.
 * Thread 1--> balance 1000--> withdraw 100--> balance=900
 * Thread 2--> balance 1000--> withdraw 100--> balance=900
 * Expected balance=800
 * This problem is called Race Condition. Multiple threads are racing to modify the shared data
 * Solution: Synchronized.
 * synchronized void withdraw(int amount){ --> Critical section: code that accesses shared data
     balance = balance - amount;
    }
 * Meaning: Only one thread can enter this method at a time.
 * If thread A is inside, then thread B must wait outside.
 * Thread A --> balance
 * Thread B --> WAIT
 * Thread A exits
 * Thread B --> balance

 * There are 2 ways to synchronize
 * 1. synchronized method: entire method is locked
 * synchronized void withdraw() {
      // code
     }

 * 2. synchronized block: only the code inside the block is locked.
 * void withdraw() {
      synchronized(this) {
          balance -= 100;
         }
     }
 * Only the balance update is critical.The print statements don't need locking.So synchronization becomes
 * more efficient.
 */

package Multithreading;

class BankAccount{
    private int balance = 1000;

    synchronized void withdraw(int amount){
        balance -= amount;
        System.out.println(Thread.currentThread().getName()
        + " withdrew "
        + amount
        + " Balance: "
        +balance);
    }
}

class Customer extends Thread{
    BankAccount account;

    Customer(BankAccount account){
        this.account = account;
    }

    @Override
    public void run(){
        account.withdraw(100);
    }
}

public class Synchronization_5 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Customer customer1 = new Customer(account);
        Customer customer2 = new Customer(account);

        customer1.start();
        customer2.start();
    }

}

/*
What problem does synchronized solve?
It prevents race conditions by ensuring that only one thread can access a critical section of code at a time.
 */