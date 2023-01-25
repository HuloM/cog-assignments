package com.cogent.week03.day13.multithreading;

public class MyRunnableClass implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        MyRunnableClass myRunnableClass = new MyRunnableClass();
        Thread thread = new Thread(myRunnableClass);
        thread.start();
    }
}
