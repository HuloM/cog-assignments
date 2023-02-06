package com.example.rest_api_bookdemo.repository;

import com.example.rest_api_bookdemo.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
}
