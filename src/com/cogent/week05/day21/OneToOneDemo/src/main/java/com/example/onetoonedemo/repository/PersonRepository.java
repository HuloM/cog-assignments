package com.example.onetoonedemo.repository;

import com.example.onetoonedemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
