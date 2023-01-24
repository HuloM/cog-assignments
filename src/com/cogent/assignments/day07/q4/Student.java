package com.cogent.assignments.day07.q4;

public class Student implements Comparable<Student>{

    private int rollNo;
    private String name;

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
    public int compareTo(Student o) {
        return this.name.length() < o.name.length() ? -1 :
                this.name.length() > o.name.length() ? 1 : 0;
    }
}
