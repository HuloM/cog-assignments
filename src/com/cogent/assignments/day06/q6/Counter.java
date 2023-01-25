package com.cogent.assignments.day06.q6;

public class Counter extends Thread {
    final Storage storage;

    public Counter(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 20) {
            synchronized (storage) {

                storage.setNum(i++);

                storage.notify();

                try {
                    storage.wait();
                } catch (InterruptedException ie) {
                    throw new RuntimeException(ie);
                }
            }
        }
    }
}