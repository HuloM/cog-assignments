package com.cogent.assignments.day07.q1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Student {
    private String name;


    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name = '" + name + '\'' +
                " }";
    }
}
