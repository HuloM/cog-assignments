package com.cogent.week03.day12.streams;

public class Part {

    String name;
    int weight;
    int number;
    int price;
    int quantity;
    public Part(String name, int weight, int number, int price, int quantity) {
        this.name = name;
        this.weight = weight;
        this.number = number;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Part { " +
                "name = '" + this.name + '\'' +
                ", weight = " + this.weight +
                ", number = " + this.number +
                ", price = " + this.price +
                ", quantity = " + this.quantity +
                " }";
    }
}
