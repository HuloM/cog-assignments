package com.cogent.week04.day18.restaurant_assignment;

public class Restaurant {
    public static void main(String[] args) {
        Customer c1 = new Customer("John");
        Waiter w1 = new Waiter();
        w1.takeOrder(c1);
    }
}
