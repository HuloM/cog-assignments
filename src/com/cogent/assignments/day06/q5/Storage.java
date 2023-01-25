package com.cogent.assignments.day06.q5;

public class Storage {
    int num = 0;

    public synchronized int getNum() {
        return num;
    }

    public synchronized void setNum(int num) {
        this.num = num;
    }
}
