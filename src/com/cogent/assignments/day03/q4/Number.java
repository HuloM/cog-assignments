package com.cogent.assignments.day03.q4;

public class Number {
    int firstNum;
    int secondNum;
    double result;

    public Number(int x, int y) {
        this.firstNum = x;
        this.secondNum = y;
    }

    void add() {
        this.result = this.firstNum + this.secondNum;
    }

    void sub() {
        this.result = this.firstNum - this.secondNum;
    }

    void mul() {
        this.result = this.firstNum * this.secondNum;
    }

    void div() throws NumberFormatException {
        if(this.secondNum == 0) throw new NumberFormatException("a number cannot be divided by 0");
        this.result = this.firstNum / (double) this.secondNum;
    }
}
