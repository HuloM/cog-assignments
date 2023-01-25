package com.cogent.assignments.day06.q5;

public class Printer extends Thread {
    final Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(storage.getNum());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
