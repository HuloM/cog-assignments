package com.cogent.week01.Day02;

import java.util.Scanner;

public class day02 {
    public static void main(String[] args) {
        listAllEvenNumbers();
    }

    static void listAllEvenNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++)
            if(i % 2 == 0)
                System.out.println(i);
    }

    static void switchStatement() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the day");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Saturday");
        }
    }

    static void bitWiseOperator() {
        int x = 1;
        int y = 2;
        int z = 1;

        System.out.println("AND Operator (true): " + (x == z && y > z));
        System.out.println("AND Operator (false): " + (x == z && y < z));
        System.out.println("OR Operator (true): " + (x == z || y < z));
        System.out.println("OR Operator (false): " + (x != z || y < z));
        System.out.println("XOR Operator (true): " + (x == z ^ y < z));
        System.out.println("XOR Operator (false): " + (x == z ^ y > z));
    }

    static void ComparisionOperator() {
        int x = 20, y =10;

        String result = x > y ? "x is greater" : "y is greater";
        System.out.println(result);
    }

    static void UnaryOperators() {
        int x = 10;
        int y = ++x;
        System.out.println("preIncrement: x: " + x + " y: "+ y);
        x = 10;
        y = x++;
        System.out.println("postIncrement: x: " + x + " y: "+ y);
        x = 10;
        y = --x;
        System.out.println("preDecrement x: " + x + " y: "+ y);
        x = 10;
        y = x--;
        System.out.println("postDecrement x: " + x + " y: "+ y);
    }
    static void ArithmeticOperations() {
        System.out.println("addition: " + (20+3));
        System.out.println("subtraction: " + (20-3));
        System.out.println("multiplication:" + (20*3));
        System.out.println("division: " + (20/3));
        System.out.println("modulo: " + (20%3));
    }
    static void printItemDetails() {
        int itemId = 1;
        String itemName = "Pen";
        double itemPrice = 1.5f;

        System.out.println("Item ID: " + itemId);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + itemPrice);

    }
}