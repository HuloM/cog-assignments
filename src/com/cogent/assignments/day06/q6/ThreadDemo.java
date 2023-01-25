package com.cogent.assignments.day06.q6;

public class ThreadDemo {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Printer printer = new Printer(storage);
        Counter counter = new Counter(storage);

        printer.start();
        counter.start();
    }
}
