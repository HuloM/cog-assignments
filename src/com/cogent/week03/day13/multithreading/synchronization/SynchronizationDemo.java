package com.cogent.week03.day13.multithreading.synchronization;

public class SynchronizationDemo {
public static void main(String[] args) {
        DisplayMessage displayMessage = new DisplayMessage();

        MyThread myThread1 = new MyThread("John", displayMessage);
        MyThread myThread2 = new MyThread("Jane", displayMessage);

        myThread1.start();
        myThread2.start();
    }
}
