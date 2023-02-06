package com.example.rest_api_bookdemo.controller;

import com.example.rest_api_bookdemo.entity.Book;
import com.example.rest_api_bookdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiv1")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookService.getBook(id);
    }

    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping("/book")
    public Book saveBook(@Validated @RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @PutMapping("/book")
    public Book updateBook(@Validated @RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @DeleteMapping("/book/{id}")
    public void deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
    }
}
