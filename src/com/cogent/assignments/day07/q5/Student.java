package com.cogent.assignments.day07.q5;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    private int rollNo;
    private String name;

    public Student() {
    }
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nStudent { " +
                "rollNo= " + rollNo +
                ", name= '" + name + '\'' +
                " }";
    }


    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.length() < o2.name.length() ? -1 :
                o1.name.length() > o2.name.length() ? 1 : 0;
    }
}
