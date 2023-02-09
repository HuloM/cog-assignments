package com.example.springassessmentq2.service;

import com.example.springassessmentq2.entity.Author;
import com.example.springassessmentq2.repository.AuthorRepository;
import com.example.springassessmentq2.service.interfaces.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepository repository;
    @Override
    public Author addAuthor(Author author) {
        return repository.save(author);
    }

    @Override
    public Author getAuthorById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Author updateAuthor(Author author) {
        return repository.save(author);
    }

    @Override
    public String deleteAuthorById(int id) {
        repository.deleteById(id);
        return "Author removed with ID: " + id;
    }

    @Override
    public List<Author> getAllAuthors() {
        return (List<Author>) repository.findAll();
    }
}
