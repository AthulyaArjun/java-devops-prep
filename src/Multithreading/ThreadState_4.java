/**
 * State 1: NEW
 * MyThread t1 = new MyThread();
 * Thread created, but not started

 * State 2: RUNNABLE
 * t1.start();
 * Now JVM tells OS: this thread is ready to run
 * It does not mean it is currently executing, It means ready and waiting for CPU

 * State 3: RUNNING
 * Scheduler gives CPU to thread.
 * Thread is executing run()

 * State 4: WAITING/ TIMED_WAITING/ BLOCKED
 * Thread.sleep()--> timed_waiting
 * t1.join() -->waiting.
 * waiting for lock --> blocked

 * State 5: TERMINATED
 * when run() finishes--> Terminated
 * Thread is dead
 * NEW
 *  |
 * start()
 *  |
 *  v
 * RUNNABLE
 *  |
 * CPU Assigned
 *  |
 *  v
 * RUNNING
 *  |
 * sleep()/join()/lock
 *  |
 *  v
 * WAITING/BLOCKED
 *  |
 * resume
 *  |
 *  v
 * RUNNING
 *  |
 * run() completed
 *  |
 *  v
 * TERMINATED
 * A terminated thread cannot be started again.
 * Create a new thread object instead.
 */

package Multithreading;

class MyThreading extends Thread {

    public void run() {

        for(int i = 1; i <= 5; i++) {

            System.out.println("Child: " + i);

            try {
                Thread.sleep(1000);
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class ThreadState_4 {
    public static void main(String[] args) throws InterruptedException {

        MyThreading t1 = new MyThreading();

        t1.start();

        t1.join();

        for(int i = 1; i <= 5; i++) {

            System.out.println("Main: " + i);

            try {
                Thread.sleep(1000);
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
