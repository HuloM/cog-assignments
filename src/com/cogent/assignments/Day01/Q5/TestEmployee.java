package com.cogent.assignments.Day01.Q5;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(1, "sarah", new Date(1,2,2000));
        Employee emp3 = new Employee(2, "luke", new Date(25,8,2018));
        Employee emp4 = new Employee(3, "terry", new Date(6,7,2005));
        Employee emp5 = new Employee(4, "matt", new Date(12,6,2022));

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println(emp4.toString());
        System.out.println(emp5.toString());
    }
}
