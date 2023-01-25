package com.cogent.assignments.day03.q7;

public class Emp {
    private int empId;
    private String empName;
    private String designation;
    private double basic;
    private double hra;

    public Emp(int empId, String empName, String designation, double basic) throws LowSalException {
        if (basic < 500)
            throw new LowSalException();

        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.basic = basic;
    }

    public void printDET() {
        System.out.println("Emp ID: " + empId +
                ", Emp Name: " + empName +
                ", Designation: " + designation +
                ", Basic: " + basic);
    }

    public void calculateHRA() {
        switch (this.designation) {
            case "Manager":
                this.hra = 0.1 * this.basic;
                break;
            case "Officer":
                this.hra = 0.12 * this.basic;
                break;
            case "Clerk":
                this.hra = 0.05 * this.basic;
                break;
            default:
                this.hra = 0;
        }
        System.out.println("HRA will be " + this.hra + " % of " + this.basic);
    }
}
