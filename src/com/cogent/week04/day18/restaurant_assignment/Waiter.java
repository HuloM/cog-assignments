package com.cogent.week04.day18.restaurant_assignment;

import java.util.Scanner;

public class Waiter {
    String[] listItems;

    private void menu(String custName) {
        System.out.println("hello " + custName + " please select the item number!!!!");
        System.out.println(
                "[ 1.Full meals -- 100, 2.veg biriyani -- 150, 3.veg Rice -- 50, " +
                "4.veg Palav -- 100, 5.veg Manchuria -- 50, 6.gobi Nudles -- 50, " +
                "7.chicken Biriyani -- 200, 8.chicken65 -- 200, 9.chicken Curry -- 100, " +
                "10.chicken Manchuria -- 150 ]");

        System.out.println(custName + " is giving order !!!!");
    }

    public void takeOrder(Customer customer) {
        menu(customer.getCustomerName());

        Order order = customer.orderItems();
        placeOrderToChef(order);

        customer.eat();
    }
    public void placeOrderToChef(Order order) {
        System.out.println("waiter has placed order to chef..........");
        VegChef vegChef = new VegChef();
        NonVegChef nonVegChef = new NonVegChef();

        for (int i = 0; i < order.items[0].length; i++) {
            if (order.items[0][i] <= 6 && order.items[0][i] >= 1) {
                vegChef.vegSection(order);
            } else {
                nonVegChef.nonVegSection(order);
            }
            i++;
        }
        System.out.println("Waiter Brought items to customer.");
    }
}
