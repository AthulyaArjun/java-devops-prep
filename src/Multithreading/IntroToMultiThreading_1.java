/**
 * Process: It is a running program. Each process has its own memory, own resources, own execution environment.
 * Thread: A thread is a lightweight unit of execution inside a process. One process can have many threads.
 * Creating processes is expensive because: separate memory & resources, context switching is costly.
 * Threads are: faster, lightweight, share memory, better performance
 * Whenever we run public static void main(String[] args), Java automatically creates Main Thread.

 * 2 ways in creating thread:
 * 1. Extend Thread class
 * run() --> contains the task to execute, no new thread is created, behaves like a normal method. Main thread executes it
 * start() --> create thread and begin execution. internally calls run()

 * 2. Runnable Interface
 * This is more preferred because it supports multiple inheritance
 * class MyTask extends Employee implements Runnable{
 * }
 * Runnable interface contains only one method run(). We need to implement it.
 * Runnable = Work --> Runnable defines the work
 * Thread   = Worker --> Thread executes the work
 * Create task: MyTask task = new MyTask();
 * Give task to thread: Thread t1 = new Thread(task);
 * Start thread: t1.start();, Java creates a new thread and executes task.run();

 * ✅ Runnable is preferred
 * Reasons:
 * Supports inheritance from another class.
 * Better design (separates task from thread).
 * Used heavily in Spring Boot and enterprise applications.
 * Foundation for ExecutorService and Thread Pools
 * */


package Multithreading;

class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("Thread is running....");
    }
}

class MyTask implements Runnable{

    @Override
    public void run(){
        System.out.println("Task is running");
    }
}

public class IntroToMultiThreading_1 {
    public static void main(String[] args) {

        MyThreading t1 = new MyThreading();
        t1.start();
       // t1.start(); --> not allowed, same thread object started twice, will throw IllegalThreadStateException
        // it's a runtime exception

        MyTask task = new MyTask();

        Thread thread = new Thread(task);
        thread.start();

    }
}
