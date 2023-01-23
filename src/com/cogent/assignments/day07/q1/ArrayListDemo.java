package com.cogent.assignments.day07.q1;

public class ArrayListDemo {
    public static void main(String[] args) {
        Class classroom = new Class();

        classroom.setNames();

        classroom.printNames();

        classroom.searchName("Jessica");

        classroom.removeName("Jessica");

        classroom.searchName(2);

        classroom.searchName("Jessica");
    }
}
