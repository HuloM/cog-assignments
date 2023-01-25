package com.cogent.week03.day13.multithreading;

import java.util.Scanner;

public class JoinDemo extends Thread {
    static int n, sum = 0;
    @Override
    public void run() {
        for (int i = 1; i < n; i++) {
            sum += i;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("Enter a big number: ");
        Scanner scanner = new Scanner(System.in);
        JoinDemo.n = scanner.nextInt();

        JoinDemo joinDemo = new JoinDemo();

        joinDemo.start();
        try {
            joinDemo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Sum: " + sum);
        System.out.println("Time taken: " + (end - start)/1000 + " seconds");
    }

}
