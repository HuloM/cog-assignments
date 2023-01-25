package com.cogent.week03.day12.streams;

import java.util.stream.Stream;

public class StreamCustomClassExample {

    public static void main(String[] args) {
        Stream<Part> stream = Stream.of(
                new Part("A", 1, 1, 1, 1),
                new Part("B", 2, 2, 2, 2),
                new Part("C", 3, 3, 3, 3),
                new Part("D", 4, 4, 4, 4),
                new Part("E", 5, 5, 5, 5)
        );

        stream.forEach(System.out::println);
    }
}
