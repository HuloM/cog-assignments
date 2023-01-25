package com.cogent.assignments.day06.q6;

public class Printer extends Thread {
    final Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        synchronized (storage) {
            while (storage.getNum() < 20) {
                try {
                    storage.wait();

                    System.out.println(storage.getNum());

                    Thread.sleep(1000);
                    storage.notify();

                } catch (InterruptedException ie) {
                    throw new RuntimeException(ie);
                }
            }
        }
    }
}