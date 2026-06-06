/**
 * problem without join:
 * class MyThread extends Thread {
 *     public void run() {
 *         System.out.println("Child Started");
 *         try {
 *             Thread.sleep(3000);
 *         } catch (InterruptedException e) {
 *         }
 *         System.out.println("Child Finished");}}
 * public class Main {
 *     public static void main(String[] args) {
 *         MyThread t1 = new MyThread();
 *         t1.start();
 *         System.out.println("Main Finished");}}
 * Child Started
 * Main Finished
 * Child Finished
 * Why? Because Main Thread and Child Thread are running independently. The Main Thread doesn't wait.

 * What if we WANT to wait?
 * Download file
 * ↓
 * After download finishes
 * ↓
 * Process file
 * We cannot process before download completes. We need waiting. That's where join() comes in
 * Syntax: t1.join(); --> current thread, wait until t1 finishes

 * sleep() = Pause myself
 * join() = Wait for another thread
 */

package Multithreading;

class Threads extends Thread{

    @Override
    public void run(){
        System.out.println("Child started");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Child finished");
    }
}
public class ThreadJoin_3 {
    public static void main(String[] args) throws InterruptedException{

        Threads threads = new Threads();
        threads.start();
        threads.join();
        System.out.println("Main ended");
    }
}
