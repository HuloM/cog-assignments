package com.cogent.assignments.Day02.Q4;

import java.util.Scanner;

public class TestOperationCalc {
    public static void main(String[] args) {
        TestOperationCalc obj = new TestOperationCalc();
        System.out.println(obj.Calculate());
    }

    int Calculate() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input the first number");
        int num1 = sc.nextInt();

        System.out.println("Please input the second number");
        int num2 = sc.nextInt();

        char operator = getOperator(sc);

        switch (operator) {
            case '+' -> { return num1 + num2; }
            case '-' -> { return num1 - num2; }
            case '*' -> { return num1 * num2; }
            case '/' -> { return num1 / num2; }
        }
        return -1;
    }

    char getOperator(Scanner sc) {
        char operator = '!';
        while (operator != ('+') && operator != '*' &&
                operator != ('-') &&  operator != ('/')) {
            System.out.println("Please input your operator (+,-,*,/)");
            operator = sc.next().charAt(0);
        }
        return operator;
    }
}
