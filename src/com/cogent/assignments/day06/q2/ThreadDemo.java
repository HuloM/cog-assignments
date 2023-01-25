package com.cogent.assignments.day06.q2;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();

        Thread thread = new Thread(myThread);
        Thread thread2 = new Thread(myThread2);

        thread.start();
        thread2.start();
    }
}
