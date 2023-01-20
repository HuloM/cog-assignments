package com.cogent.week02.day09.strings;

import java.util.Arrays;

public class StringsExample {
    public static void main(String[] args) {
        String str = new String("str");
        System.out.println(str);

        byte[] bytes = new byte[] {65, 66, 67};

        String str2 = new String(bytes);
        System.out.println(str2);

        String s = "Hello world";

        System.out.println("lenght: " + s.length());
        System.out.println("index of o: " + s.indexOf('o'));
        System.out.println("charAt 3: " + s.charAt(3));

        System.out.println("substring with beginning index: " + s.substring(2));
        System.out.println("substring with start and end index: " + s.substring(0, 4));

        String[] result = s.split(" ");
        for (String st: result) {
            System.out.println(st);
        }

        System.out.println("replace" + s.replace('l', 'k'));
        System.out.println("uppercase: " + s.toUpperCase());
        System.out.println("lowercase: " + s.toLowerCase());

        String s1 = "hello";
        String s2 = "world";

        System.out.println(s1 + " " + s2);

        s2 = s1.concat(s2);
        System.out.println(s1 + " " + s2);
    }
}
