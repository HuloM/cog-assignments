package com.cogent.week01.Day01.Assignments.Q3;

import java.util.Scanner;

public class TestBook {
    Book[] books;
    public static void main(String[] args) {
        TestBook obj = new TestBook();
        obj.createBooks();
        obj.showBooks();
    }

    void createBooks() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of books you need to input");
        int size = sc.nextInt();

        books = new Book[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the title of the book");
            String title = sc.next();

            System.out.println("Please enter the price of the book");
            double price = sc.nextDouble();

            Book newBook = new Book();
            newBook.setBook_price(price);
            newBook.setBook_title(title);

            books[i] = newBook;
        }
    }
    void showBooks() {
        System.out.println("Book Title       Price");
        for (Book book : books) {
            System.out.println(book.getBook_title() + "   Rs." + book.getBook_price());
        }
    }
}
