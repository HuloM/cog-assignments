package com.cogent.assignments.day06.q5;

public class Printer extends Thread {
    final Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(storage.num);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
    }
}
