package com.cogent.week04.day18.restaurant_assignment;

public class Chef {
    public void prepareOrder(Order order, String vegRnonVeg) {
        System.out.println("order number" + Order.getOrderNum() + "is getting ready please wait (" + vegRnonVeg + ")");
        System.out.println("order number"+ Order.getOrderNum() + "is ready("+ vegRnonVeg +")...");
    }

    public void callWaiter(String vegRnonVeg) {
        System.out.println(vegRnonVeg + " Chef to waiter : you can now deliver items to customer");
    }
}
