package com.cogent.week03.day12.collections_part_two;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Random rand = new Random();
        
        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(20);
            set.add(num);
            System.out.println(num);
        }

        System.out.println(set);
    }
}
