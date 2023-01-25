package com.cogent.assignments.day06.q3;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread(1);
        MyThread myThread2 = new MyThread(2);

        Thread thread = new Thread(myThread);
        Thread thread2 = new Thread(myThread2);

        thread.start();
        thread2.start();
    }
}
