package com.cogent.week03.day12.collections_part_two.comparison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySortExample {
    public static void main(String[] args) {
        int[] a = {55,2,34,63,1};

        System.out.println("unsorted");
        for (int num: a) {
            System.out.println(num);
        }

        Arrays.sort(a);

        System.out.println("sorted");
        for (int num: a) {
            System.out.println(num);
        }

        String[] s = {"V", "A", "Z", "P"};

        Arrays.sort(s);

        System.out.println("sorted");
        for (String str: s) {
            System.out.println(str);
        }

        List<String> list = Arrays.asList(s);

        System.out.println(list);

        list = new ArrayList<>(list);

        list.add("O");

        System.out.println(list);

        list.sort(String::compareTo);
        System.out.println(list);
    }
}
