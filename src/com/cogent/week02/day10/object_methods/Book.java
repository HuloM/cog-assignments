package com.cogent.week02.day10.object_methods;

import java.util.Objects;

public class Book {
    String title;
    String author;
    int pages;
    double price;

    public Book(String title, String author, int pages, double price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        return pages == book.pages &&
                price == book.price &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public String toString() {
        return this.title + " was written by " + this.author +
                " with " + this.pages + " pages and costs: $" + this.price + "\n";
    }
}
