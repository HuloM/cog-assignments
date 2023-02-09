package com.example.springassessmentq2.controller;

import com.example.springassessmentq2.entity.Author;
import com.example.springassessmentq2.service.interfaces.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping("/fetchAll")
    public List<Author> getAuthors() {
        return authorService.getAllAuthors();
    }

    @GetMapping("/fetchById/{id}")
    public Author getAuthorById(@PathVariable int id) {
        return authorService.getAuthorById(id);
    }

    @PostMapping("/save")
    public Author addAuthor(@RequestBody Author author) {
        return authorService.addAuthor(author);
    }

    @PutMapping("/update")
    public Author updateAuthor(@RequestBody Author author) {
        return authorService.updateAuthor(author);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAuthorById(@PathVariable int id) {
        return authorService.deleteAuthorById(id);
    }

}
