package com.cogent.week03.day11.lambda;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> p = s -> s.length() > 5;
        System.out.println(p.test("test"));
        System.out.println(p.test("tests"));
        System.out.println(p.test("testss"));

        Scanner sc = new Scanner(System.in);
        Predicate<Integer> p2 = i -> i >= 20;

        System.out.println("please enter a number");
        int value = sc.nextInt();
        System.out.println(p2.test(value) ?
                value + " is greater than or equal to 20"
                : "not greater than or equal to 20");

        System.out.println("please enter your age");
        int age = sc.nextInt();
        System.out.println(p2.test(age) ? "You are eligible to vote"
                : "You are not eligible to vote");
    }
}
