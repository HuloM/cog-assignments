package com.cogent.week01.Day05.hp;

public class Y {
    public static void main(String[] args) {
        X x = new X();
        System.out.println("q: " + x.q);
        System.out.println("r: " + x.r);
        System.out.println("s: " + x.s);
        // ! cannot access p due to private
    }
}

