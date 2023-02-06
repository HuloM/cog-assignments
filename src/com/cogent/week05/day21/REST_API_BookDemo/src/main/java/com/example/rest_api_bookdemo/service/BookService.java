package com.example.rest_api_bookdemo.service;

import com.example.rest_api_bookdemo.entity.Book;

import java.util.List;

public interface BookService {
    Book saveBook(Book book);
    Book getBook(int id);
    Book updateBook(Book book);
    void deleteBook(int id);
    List<Book> getAllBooks();

}
