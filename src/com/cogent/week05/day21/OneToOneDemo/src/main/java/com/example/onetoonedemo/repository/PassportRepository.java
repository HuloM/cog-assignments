package com.example.onetoonedemo.repository;

import com.example.onetoonedemo.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository extends JpaRepository<Passport, Long> {

}
