package com.cogent.week04.day18.restaurant_assignment;

public class Order {
    static int orderNum = 0;
    int[][] items;
    int noOfItems;

    public Order(int numOfItems) {
        items = new int[1][numOfItems * 2];
        this.noOfItems = numOfItems;
        orderNum++;
    }

    public static int getOrderNum() {
        return orderNum;
    }

    public static int getPrice(int itemNum) {
        return switch (itemNum) {
            case 1, 4, 9 -> 100;
            case 2, 10 -> 150;
            case 3, 6, 5 -> 50;
            case 7, 8 -> 200;
            default -> 0;
        };
    }

    public static String getItemName(int itemNum) {
        return switch (itemNum) {
            case 1 -> "Full meals";
            case 2 -> "veg biriyani";
            case 3 -> "veg Rice";
            case 4 -> "veg Palav";
            case 5 -> "veg Manchuria";
            case 6 -> "gobi Nudles";
            case 7 -> "chicken Biriyani";
            case 8 -> "chicken65";
            case 9 -> "chicken Curry";
            case 10 -> "chicken Manchuria";
            default -> "Invalid Item";
        };
    }
}
