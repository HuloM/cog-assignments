package com.cogent.week03.day13.multithreading;

public class ThreadSleepExample extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread is running...");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ThreadSleepExample myTreadClass = new ThreadSleepExample();
        myTreadClass.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread is running...");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
