package com.cogent.week03.day12.collections_part_two.comparison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {
        StringLengthComparator stringLengthComparator = new StringLengthComparator();

        List<String> list = new ArrayList<>();

        list.add("7EMpZJaJ6Z8nNtgs");
        list.add("LRUgG");
        list.add("6Y43gdG99DR25634mS1");
        list.add("oh4Zq6t1q");

        System.out.println(list);

        list.sort(stringLengthComparator);
        System.out.println(list);

        String[] s = {"Hg2d8K3hs", "vyPh2Q7q9sHI6Z", "OvJxOQ", "QVtfOBaB2YC4UK7yO", "Bll7r8dXXZ5l24"};

        System.out.println(Arrays.toString(s));

        Arrays.sort(s, stringLengthComparator);
        System.out.println(Arrays.toString(s));

    }
}
