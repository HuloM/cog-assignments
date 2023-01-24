package com.cogent.assignments.day07.q5;

import java.util.ArrayList;
import java.util.List;

public class StudentSortDemo {
    public static void main(String[] args) {
        Student s = new Student();
        List<Student> students = new ArrayList<>();

        students.add(new Student(3, "zak"));
        students.add(new Student(1, "Jacks"));
        students.add(new Student(4, "matthieu"));
        students.add(new Student(2, "Jane"));

        System.out.println(students);

        students.sort(s::compare);

        System.out.println(students);
    }
}
