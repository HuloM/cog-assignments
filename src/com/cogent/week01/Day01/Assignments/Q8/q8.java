package com.cogent.week01.Day01.Assignments.Q8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number between 1-40");
        int num1 = scanner.nextInt();
        System.out.println("Please enter a number between 1-40");
        int num2 = scanner.nextInt();

        bingo(num1, num2);
    }

    static void bingo(int num1, int num2) {
        if (num1 > 40 || num1 < 0 || num2 > 40 || num2 < 0) {
            System.out.println("these are not valid numbers");
            return;
        }

        int[] bingoBoard = new int[5];

        for (int i = 0; i < 5; i++) {
            int num = (int) Math.floor(Math.random() * 40);
            bingoBoard[i] = num;
        }
        System.out.println(Arrays.toString(bingoBoard));
        System.out.println(String.format("Your first number was %d \nYour second number was %d", num1, num2));
        int[] numbers = new int[] {num1, num2};
        boolean isBingo = true;
        for (int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < bingoBoard.length; j++) {
                if (bingoBoard[j] == numbers[i]) {
                        break;
                }
                else if (j == bingoBoard.length - 1) {
                    isBingo = false;
                    break;
                }
            }
            if (!isBingo)
                break;
        }
        if(isBingo)
            System.out.println("Bingo");
    }
}
