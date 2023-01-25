package com.cogent.week03.day12.collections_part_two;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(30));
        }

        System.out.println(list);

        Set<Integer> set = new HashSet<>(list);

        System.out.println(set);
    }
}
