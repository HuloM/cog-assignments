package com.cogent.assignments.day03.q7;

public class TestEmp {
    public static void main(String[] args) {
        try {
            Emp emp1 = new Emp(1, "John", "Manager", 1000);
            emp1.printDET();
            emp1.calculateHRA();

            Emp emp2 = new Emp(2, "Jane", "Officer", 500);
            emp2.printDET();
            emp2.calculateHRA();
        } catch (LowSalException e) {
            System.out.println(e.getMessage());
        }
    }
}
