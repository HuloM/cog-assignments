package com.example.manytomanydemo;

import com.example.manytomanydemo.entity.Author;
import com.example.manytomanydemo.entity.Book;
import com.example.manytomanydemo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ManyToManyDemoApplication implements CommandLineRunner {

    @Autowired
    BookRepository bookRepository;
    public static void main(String[] args) {
        SpringApplication.run(ManyToManyDemoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Book book = new Book();
        Set<Author> authorList = new HashSet<>();
        Author author1 = new Author();
        author1.setFirstName("Gyanendra");
        author1.setLastName("Singh");
        authorList.add(author1);
        book.setAuthors(authorList);
        book.setIsbn("23423dfd");
        book.setPublisher("Shiva");
        book.setTitle("Java");
        bookRepository.save(book);
    }
}
