package com.cogent.week02.day09.io_streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
? reads the input from console to print out a statement
*/
public class Buffered_Reader {
    public static void main(String[] args) {
        BufferedReader buffer = new BufferedReader((new InputStreamReader(System.in)));

        try {
            System.out.println("Please enter first name");
            String firstName = buffer.readLine();

            System.out.println("Please enter last name");
            String lastName = buffer.readLine();

            System.out.println("Please enter your age");
            String age = buffer.readLine();

            System.out.println("Hello, " + firstName + " " + lastName + " you are " + age + " years old");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
