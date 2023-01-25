package com.cogent.assignments.day06.q5;

public class Counter extends Thread {
    final Storage storage;

    public Counter(Storage storage) {
        this.storage = storage;
    }

    @Override
    public synchronized void run() {
            for (int i = 0; i < 20; i++) {
                storage.setNum(i);
                Thread.yield();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
