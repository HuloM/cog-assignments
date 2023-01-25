package com.cogent.week03.day12.collections_part_two.comparison;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() < o2.length() ? -1 :
                o1.length() > o2.length() ? 1 : 0;
    }
}
