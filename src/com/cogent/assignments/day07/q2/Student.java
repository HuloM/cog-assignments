package com.cogent.assignments.day07.q2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {
    Map<Integer, String> empNames = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    public void setNames() {
        System.out.println("please enter the roll number for the student");
        int rollNo = sc.nextInt();
        System.out.println("please enter tha name of the student");
        String name = sc.next();

        this.empNames.put(rollNo, name);
    }

    public void printNames() {
        System.out.println(this.empNames);
    }

    public void getName(Integer key) {
        if(this.empNames.containsKey(key))
            System.out.println("Roll #" + key + " Student Name: " + this.empNames.get(key));
    }

    public void printNamesKeySet() {
        for(Integer key : this.empNames.keySet())
            System.out.println("Roll #" + key + " Student Name: " + this.empNames.get(key));
    }

    public void printSize() {
        System.out.println("there are " + this.empNames.size() + " students");
    }

    public void remove(Integer key) {
        if(this.empNames.containsKey(key)) {
            String student = this.empNames.remove(key);
            System.out.println(student + " has been removed");
        }
    }

    public void printNames(String value) {

    }
}
