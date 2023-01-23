package com.cogent.week02.day09.io_streams;

import java.util.StringTokenizer;

/*
? use delimiter to separate out a string into individual strings
*/
public class StringTokenizerExample {

    public static void main(String[] args) {
        String str = "hello,world,this,is,an,application";
        StringTokenizer token = new StringTokenizer(str, ",");

        while(token.hasMoreTokens())
            System.out.println(token.nextToken());
    }
}
