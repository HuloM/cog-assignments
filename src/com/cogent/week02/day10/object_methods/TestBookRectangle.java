package com.cogent.week02.day10.object_methods;

public class TestBookRectangle {
    public static void main(String[] args) {
        Book b1 = new Book("title", "john", 100, 10.23);
        Book b2 = new Book("title", "john", 110, 10.23);
        Book b3 = new Book("title2", "john", 100, 10.23);
        Book b4 = new Book("title", "john", 100, 10.23);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4.toString());

        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b3));
        System.out.println(b1.equals(b4));

        System.out.println();

        Rectangle r1 = new Rectangle(10, 11);
        Rectangle r2 = new Rectangle(10, 11);
        Rectangle r3 = new Rectangle(11, 11);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3.toString());

        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));
        System.out.println(r2.equals(r3));

    }
}
