package com.example.onetoonedemo;

import com.example.onetoonedemo.entity.Passport;
import com.example.onetoonedemo.entity.Person;
import com.example.onetoonedemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToOneDemoApplication implements CommandLineRunner {

    @Autowired
    PersonRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(OneToOneDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Person person = new Person();
        person.setName("Meenakshi");
        person.setEmail("meena@gmail.com");

        Passport passport = new Passport();
        passport.setPassportNumber("24-07-2030");
        passport.setPassportCountry("Bangalore");

        person.setPassport(passport);
        repository.save(person);
        System.out.println("Saved!!!");
    }
}
