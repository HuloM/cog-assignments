package com.cogent.week04.day18.restaurant_assignment;

import java.util.Scanner;

public class Customer {
    private String customerName;
    private int customerTableNumber;
    Order order;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    Order orderItems() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many items you want to order");

        int items = sc.nextInt();
        sc.nextLine();

        System.out.println("enter item Numbers and their quantity one by one...");

        Order order = new Order(items);
        for (int i = 0; i < items; i++) {
            System.out.println("-----------------------------");
            int itemNum = sc.nextInt();
            sc.nextLine();
            int itemQuantity = sc.nextInt();
            sc.nextLine();

            order.items[0][i*2] = itemNum;
            order.items[0][i*2+1] = itemQuantity;
        }

        System.out.println("--------------------------------------------------");

        this.order = order;
        return order;
    }

    void eat() {
        System.out.println(this.customerName + " is eating now....");
        Bill bill = new Bill();
        bill.generateBill(this);
    }
}
