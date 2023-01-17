package com.cogent.week01.Day01.Assignments.Q7;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        numSumSequence();
    }

    static void numSumSequence() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num1 = scanner.nextInt();
        System.out.println("Please enter another number");
        int num2 = scanner.nextInt();

        int prev = num2;
        System.out.println(num1);
        System.out.println(num2);
        int curr = num2 + num1;
        System.out.println(curr);

        for (int i = 0; i < 12; i++) {
            int temp = curr;
            curr += prev;
            prev = temp;
            System.out.println(curr);
        }
    }
}
