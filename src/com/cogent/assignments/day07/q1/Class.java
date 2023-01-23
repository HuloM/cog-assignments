package com.cogent.assignments.day07.q1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Class {
    private ArrayList<Student> students = new ArrayList<>();

    public void setNames() {
        Scanner sc = new Scanner(System.in);

        System.out.println("how many names would you like to add?");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println("please enter a name");
            this.students.add(new Student(sc.next()));
        }
    }

    public void searchName(String name) {
        for (Student student: this.students) {
            if (student.getName().equals(name)) {
                System.out.println("student found: " + student.getName());
                return;
            }
        }
        System.out.println(name + " not found");
    }

    public void searchName(int index) {
        if (index >= this.students.size()) {
            System.out.println("index out of bounds");
            return;
        }
        System.out.println("student found: " + this.students.get(index));
    }

    public void printNames() {
        Iterator<Student> itr = this.students.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public void removeName(String name) {
        this.students.remove(new Student(name));
        System.out.println(name + " has been removed");
    }
}
