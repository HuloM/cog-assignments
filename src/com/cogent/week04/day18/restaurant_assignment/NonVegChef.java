package com.cogent.week04.day18.restaurant_assignment;

public class NonVegChef extends Chef {
    public void nonVegSection(Order order) {
        System.out.println("your order reached non veg section");
        this.prepareOrder(order, "nonVeg");
    }
}
