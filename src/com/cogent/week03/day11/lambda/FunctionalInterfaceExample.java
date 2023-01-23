package com.cogent.week03.day11.lambda;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Reverse reverse = s -> {
            StringBuffer str = new StringBuffer(s);
            str.reverse();
            return str.toString();
        };

        System.out.println(reverse.reverseString("testing"));

    }
}

interface Reverse {
    String reverseString(String str);
}

