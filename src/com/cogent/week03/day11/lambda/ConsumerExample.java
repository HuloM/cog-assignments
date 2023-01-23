package com.cogent.week03.day11.lambda;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Integer> display = x -> System.out.println("the number is " + x);

        display.accept(22);
        display.accept(25);


        Consumer<String> toUpper = x -> System.out.println(x.toUpperCase());
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a string");
        String str = sc.nextLine();

        toUpper.accept(str);
    }
}
