package com.cogent.week03.day12.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListStreamExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        Stream<String> stream = list.stream();

        stream.forEach(System.out::println);

        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop", 1000));
        products.add(new Product(2, "Mouse", 100));
        products.add(new Product(3, "Keyboard", 200));
        products.add(new Product(4, "Monitor", 300));

        Stream<Product> productStream = products.stream();

        productStream.filter(product -> product.price > 250)
                .map(product -> product.name).forEach(System.out::println);
    }
}

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product { " +
                "id= " + id +
                ", name = '" + name + '\'' +
                ", price = " + price +
                " }";
    }
}