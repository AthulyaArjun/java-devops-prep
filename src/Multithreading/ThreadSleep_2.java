/**
 * sleep(): It pauses the currently executing thread for a specific amount of time.
 * Syntax: Thread.sleep(milliseconds); --> pause current thread for __ seconds
 * sleep does not kill the thread. It only pauses it.
 * sleep() -> must handle InterruptedException
 * public static void main(String[] args) throws InterruptedException {
 *     Thread.sleep(5000);
 * }
 * ✅ Main Thread. Because sleep always affects the thread that is currently executing.
 */

package Multithreading;

class Task implements Runnable{

    @Override
    public void run(){
        try {
            for (int i=1; i<=5; i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
public class ThreadSleep_2 {
    public static void main(String[] args) {

        Task t1 = new Task();
        Thread thread = new Thread(t1);
        thread.start();
    }
}
