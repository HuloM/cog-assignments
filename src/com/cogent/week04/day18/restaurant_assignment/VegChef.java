package com.cogent.week04.day18.restaurant_assignment;

public class VegChef extends Chef {
    public void vegSection(Order order) {
        System.out.println("your order reached veg section");
        this.prepareOrder(order, "veg");
    }
}
