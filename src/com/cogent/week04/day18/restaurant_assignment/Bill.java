package com.cogent.week04.day18.restaurant_assignment;

public class Bill {
    Order order;
    int bill;
    int count;
    static int totalBill = 0;

    void generateBill(Customer c) {
        order = c.order;
        bill = 0;
        count = 0;
        for (int i = 0; i < order.noOfItems; i++) {
            System.out.println(order.items[0][i*2]);
            bill += Order.getPrice(order.items[0][i*2]) * order.items[0][i*2+1];
        }
        totalBill += bill;
        System.out.println("Item             Quant BIll");
        System.out.println("----             ----- ----");
        for (int i = 0; i < order.noOfItems; i++) {
            System.out.println(Order.getItemName(order.items[0][i*2]) + "             " + order.items[0][i*2+1] + " " + Order.getPrice(order.items[0][i*2]) * order.items[0][i*2+1]);
        }
        System.out.println("---------------------------");
        System.out.println("Total bill is: " + totalBill);
    }
}
