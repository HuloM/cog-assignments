package com.cogent.week03.day12.streams;

import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one", "two", "three", "four", "five");

        stream.forEach(System.out::println);

        Stream<String> stream2 = Stream.of("Hellow world, this is a stream".split(" "));

        stream2.forEach(System.out::println);
    }
}
