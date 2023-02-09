package com.example.springassessmentq2.service.interfaces;

import com.example.springassessmentq2.entity.Author;

import java.util.List;

public interface AuthorService {
    Author addAuthor(Author author);
    Author getAuthorById(int id);
    Author updateAuthor(Author author);
    String deleteAuthorById(int id);
    List<Author> getAllAuthors();
}
