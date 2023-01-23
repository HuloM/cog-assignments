package com.cogent.assignments.day03.q3;

public class CalcAverage {
    public double avgFirstN(int n) throws IllegalArgumentException {
        if(n < 0) throw new IllegalArgumentException("this is a non natural number, please try again");
        double sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum / n;
    }

}
