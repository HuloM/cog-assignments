package com.cogent.assignments.day06.q3;

public class MyThread implements Runnable {
    int id;
    MyThread(int id) {
        this.id = id;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + this.id + " is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
