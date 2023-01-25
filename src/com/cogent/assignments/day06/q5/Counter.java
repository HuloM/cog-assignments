package com.cogent.assignments.day06.q5;

public class Counter extends Thread {
    final Storage storage;

    public Counter(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        synchronized (storage) {
            for (int i = 0; i < 100; i++) {
                storage.num++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
