package com.cogent.assignments.day06.q5;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Storage storage = new Storage();
        Counter counter = new Counter(storage);
        Printer printer = new Printer(storage);

        printer.start();
        counter.start();
    }
}
