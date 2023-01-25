package com.cogent.week03.day13.multithreading.synchronization;

public class MainThread {
    public static void main(String[] args) {
        MyThreadTwo myThreadTwo = new MyThreadTwo();
        myThreadTwo.start();
        synchronized (myThreadTwo) {
            try {
                System.out.println("Main thread is waiting for child thread to complete");
                myThreadTwo.wait();
                System.out.println("Main thread is notified");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Total is: " + myThreadTwo.total);
        }
    }
}
