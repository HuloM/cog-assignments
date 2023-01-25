package com.cogent.week03.day13.multithreading;

import java.util.Scanner;

public class AreaOfCircleThread extends Thread {
    double radius;
    double area;

    @Override
    public void run() {
        area = Math.PI * radius * radius;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        AreaOfCircleThread areaOfCircleThread = new AreaOfCircleThread();

        long start = System.currentTimeMillis();
        System.out.println("Enter a the radius of circle: ");
        Scanner scanner = new Scanner(System.in);
        areaOfCircleThread.radius = scanner.nextDouble();

        areaOfCircleThread.start();
        try {
            areaOfCircleThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Area: " + areaOfCircleThread.area);
        System.out.println("Time taken: " + (end - start)/1000 + " seconds");
    }

}
