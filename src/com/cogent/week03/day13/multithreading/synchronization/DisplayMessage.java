package com.cogent.week03.day13.multithreading.synchronization;

public class DisplayMessage {
    public synchronized void sayHello(String name) {
        System.out.println("Hello " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
