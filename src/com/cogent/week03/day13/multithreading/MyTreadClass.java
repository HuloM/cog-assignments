package com.cogent.week03.day13.multithreading;

public class MyTreadClass extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        MyTreadClass myTreadClass = new MyTreadClass();
        myTreadClass.start();
    }
}
