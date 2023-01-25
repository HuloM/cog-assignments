package com.cogent.week03.day12.collections_part_two;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("john", 2);
        map.put("jesse", 5);
        map.put("jake", 6);
        map.put("josh", 7);

        System.out.println(map);


        System.out.println("size: " + map.size());

        System.out.println("john has: " + map.get("john"));

        for (String key : map.keySet()) {
            System.out.println("Key: " + key + " value: " + map.get(key));
        }
    }
}
