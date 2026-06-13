/**
 * In real projects, nobody creates 500 threads like this:
 * new Thread(...).start();
 * new Thread(...).start();
 * new Thread(...).start();
 * Instead they use Thread pool via Executor Framework

 * Creating a thread is expensive, because JVM has to:
 * Allocate memory for a stack
 * Register the thread with the OS
 * Schedule it
 * Manage context switching
 * If 10,000 requests create 10,000 threads:
 * Request 1  -> Thread 1
 * Request 2  -> Thread 2
 * ...
 * Request 10000 -> Thread 10000
 * Your server will spend more time managing threads than doing actual work.
 * Keep 10 waiters permanently.
 * Customer arrives
 * ↓
 * Available waiter serves
 * ↓
 * Waiter becomes free
 * ↓
 * Serves next customer
 * This is exactly what a Thread Pool does.

 * A Thread Pool is a collection of pre-created worker threads that are reused to execute tasks
 * In Java
 * ExecutorService executor = Executors.newFixedThreadPool(2);
 * This creates:
 * Thread 1
 * Thread 2
 * ready to work.

 * Executor Framework
 * Java Provides:
 * import java.util.concurrent.ExecutorService;
 * import java.util.concurrent.Executors;
 * Creating a fixed thread pool:
 * ExecutorService executor = Executors.newFixedThreadPool(3);
 * Maximum 3 worker threads
 * Reuse them again and again

 * Submitting Tasks
 * Instead of new Thread(task).start();
 * we do executor.submit(task);

 * shutdown()
 * After submitting all tasks: executor.shutdown();
 * This means: "Don't accept any new tasks. Finish existing tasks and then stop."
 * Without shutdown():
 * Program may keep running, because the thread pool is still alive.
 */

package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFramework_6 {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i=1; i<=5; i++){
            int taskId = i;

            executor.submit(() -> {
                System.out.println("Task "
                +taskId
                +" executed by "
                +Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}

/*
| Concept         | Purpose                                |
| --------------- | -------------------------------------- |
| Thread          | Smallest unit of execution             |
| start()         | Creates new thread                     |
| run()           | Task executed by thread                |
| sleep()         | Pause thread                           |
| join()          | Wait for another thread                |
| Race Condition  | Multiple threads modifying shared data |
| synchronized    | Prevent race condition                 |
| Thread Pool     | Reuse threads                          |
| ExecutorService | Manages thread pool                    |
| submit()        | Submit task                            |
| shutdown()      | Gracefully stop pool                   |

 */