package com.cogent.week02.day09.strings;

public class StringPoolingExample {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "xyz";
        String s3 = "abc";

        String s4 = new String("abc");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        System.out.println(s1 == s3);

        System.out.println(s1.equals(s3));

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        // false since it only looks at the reference
        System.out.println(s1 == s4);

        //true since it looks at the values
        System.out.println(s1.equals(s4));
    }
}
