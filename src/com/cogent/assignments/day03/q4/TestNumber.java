package com.cogent.assignments.day03.q4;

import java.util.Scanner;

public class TestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Number n = new Number(10, 0);

        int choice = 0;

        do {
            System.out.println("****** Menu ******");
            System.out.println("1 - add");
            System.out.println("2 - subtract");
            System.out.println("3 - multiply");
            System.out.println("4 - divide");
            System.out.println("5 - exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    n.add();
                    System.out.println("result of addition: " + n.result);
                }
                case 2 -> {
                    n.sub();
                    System.out.println("result of subtraction: " + n.result);
                }
                case 3 -> {
                    n.mul();
                    System.out.println("result of multiplication: " + n.result);
                }
                case 4 -> {
                    n.div();
                    System.out.println("result of division: " + n.result);
                }
                default -> {}
            }
        } while (choice < 5);
        System.out.println("application exiting");
    }
}
