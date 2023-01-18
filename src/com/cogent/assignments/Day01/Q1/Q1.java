package com.cogent.assignments.Day01.Q1;

public class Q1 {
    public static void main(String[] args) {
        EvenNum obj = new EvenNum();
        obj.printEvenNum(10);
        obj.printEvenNum(100);
        obj.printEvenNum(1000);
    }
}

class EvenNum {
    void printEvenNum(int n) {
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0)
                System.out.println("Number: " + i + " is even");
        }
    }
}
