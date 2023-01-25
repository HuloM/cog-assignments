package com.cogent.week03.day13.multithreading.synchronization;

public class MyThread extends Thread {
    private String name;
    private DisplayMessage displayMessage;

    public MyThread(String name, DisplayMessage displayMessage) {
        this.name = name;
        this.displayMessage = displayMessage;
    }

    @Override
    public void run() {
        displayMessage.sayHello(name);
    }
}
