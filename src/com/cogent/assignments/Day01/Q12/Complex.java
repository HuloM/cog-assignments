package com.cogent.assignments.Day01.Q12;

public class Complex {
    private float complexNum1;
    private float complexNum2;

    public Complex() {
        this.complexNum1 = 1.1f;
        this.complexNum2 = 1.1f;
    }

    public Complex(float complexNum1, float complexNum2) {
        this.complexNum1 = complexNum1;
        this.complexNum2 = complexNum2;
    }

    public String addComplexNumbers(Complex complex) {
        return "Sum of " + this.display() + " & " + complex.display() +
                " is : a" + (complex.complexNum1 + this.complexNum1) + "+b" +
                (complex.complexNum2 + this.complexNum2) + " i";
    }

    public String subtractComplexNumbers(Complex complex) {
        return "Subtraction of " + this.display() + " & " + complex.display() +
                " is : a" + (this.complexNum1 - complex.complexNum1) + "+b" +
                (this.complexNum2 - complex.complexNum2) + " i";
    }

    public String display() {
        return "a" + this.complexNum1 + "+b" + this.complexNum2 + " i";
    }
}
