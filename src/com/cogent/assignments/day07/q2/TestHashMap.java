package com.cogent.assignments.day07.q2;

public class TestHashMap {
    public static void main(String[] args) {
        Student c = new Student();

        c.setNames();
        c.setNames();
        c.setNames();
        c.setNames();

        c.printNames();

        c.getName(2);

        c.printNamesKeySet();

        c.printSize();

        c.remove(2);

        c.printSize();
    }
}
