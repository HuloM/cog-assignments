package com.cogent.week03.day13.multithreading.synchronization;

public class MyThreadTwo extends Thread{
    int total;
    public void run() {
        System.out.println("child thread is calculating total");
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                total += i;
            }
            notify();
        }
    }
}
