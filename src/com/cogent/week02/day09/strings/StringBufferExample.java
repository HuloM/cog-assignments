package com.cogent.week02.day09.strings;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer strBuffer = new StringBuffer();
        System.out.println("initial capacity: " + strBuffer.capacity()); //16 bytes
        //mutable-changeable

        strBuffer.append(" new strings appended");
        strBuffer.append(" new strings appended");
        strBuffer.append(" new strings appended");
        System.out.println(strBuffer);
        System.out.println("new capacity: " + strBuffer.capacity()); //16 bytes

        System.out.println(strBuffer.charAt(3));

        StringBuffer strBuffer1 = new StringBuffer("abcde");
        System.out.println(strBuffer1.reverse());

        System.out.println(strBuffer1.insert(3, "xyz"));
        System.out.println(strBuffer1.delete(10,20));
    }
}
