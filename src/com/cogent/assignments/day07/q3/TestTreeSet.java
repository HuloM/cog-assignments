package com.cogent.assignments.day07.q3;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestTreeSet {

    public static void main(String[] args) {
        SortedSet<String> product = new TreeSet<>();

        product.add("table");
        product.add("chair");
        product.add("computer");
        product.add("table");
        product.add("computer");
        product.add("mouse");
        product.add("keyboard");

        Iterator<String> itr = product.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("first: " + product.first() +
                "\nlast: " + product.last());

        System.out.println("size: " + product.size());

        product.remove("keyboard");
        System.out.println(product);
        System.out.println("size: " + product.size());
    }
}
