package com.cogent.week01.day03;

public class productArray {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        String[] productNames = new String[] {"pen","paper", "mouse", "keyboard", "computer"};
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product(i, productNames[i], Math.floor(Math.random() * 80));
        }

        for (Product product : products) {
            System.out.println(product.toString());
        }
    }
}

class Product {
    int productId;
    String productName;
    double productPrice;

    public Product() {
        this.productId = -1;
        this.productName = "Invalid Product";
        this.productPrice = 0.0;
    }

    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}