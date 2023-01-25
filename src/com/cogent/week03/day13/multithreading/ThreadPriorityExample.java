package com.cogent.week03.day13.multithreading;

public class ThreadPriorityExample extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running..." + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadPriorityExample threadPriorityExample = new ThreadPriorityExample();
        ThreadPriorityExample threadPriorityExample2 = new ThreadPriorityExample();

        threadPriorityExample.setPriority(Thread.MIN_PRIORITY);
        threadPriorityExample2.setPriority(Thread.MAX_PRIORITY);


        threadPriorityExample.start();
        threadPriorityExample2.start();
    }
}
