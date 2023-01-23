package com.cogent.week03.day11.lambda;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Date> supply = () -> new Date();

        Consumer<Date> displayDate = date -> System.out.println("today's date is " + date);

        displayDate.accept(supply.get());
    }
}
