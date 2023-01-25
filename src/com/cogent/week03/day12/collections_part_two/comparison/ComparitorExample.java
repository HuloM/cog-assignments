package com.cogent.week03.day12.collections_part_two.comparison;

import java.util.Comparator;

public interface ComparitorExample extends Comparator<String> {
    @Override
    default int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
