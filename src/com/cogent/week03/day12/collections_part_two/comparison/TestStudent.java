package com.cogent.week03.day12.collections_part_two.comparison;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(3, "John", "Doe"));
        students.add(new Student(1, "John", "Doe"));
        students.add(new Student(4, "John", "Doe"));
        students.add(new Student(2, "Jane", "Doe"));

        System.out.println(students);

        Collections.sort(students);

        System.out.println(students);
    }
}
