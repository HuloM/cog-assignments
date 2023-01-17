package com.cogent.week01.Day01.Assignments.Q5;

public class Employee {
    int empNum;
    String empName;
    Date joiningDate;

    public Employee(int empNum, String empName, Date joiningDate) {
        this.empNum = empNum;
        this.empName = empName;
        this.joiningDate = joiningDate;
    }

    public Employee() {
        this.empNum = -1;
        this.empName = "John";
        this.joiningDate = new Date();
    }

    @Override
    public String toString() {
        return "Employee { " +
                "empNum= " + empNum +
                ", empName= '" + empName + '\'' +
                ", joiningDate= " + joiningDate.toString() +
                " }";
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }
}
