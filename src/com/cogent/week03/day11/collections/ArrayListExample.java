package com.cogent.week03.day11.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(23);
        list.add(24);
        list.add(25);

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

        for(Integer i : list)
            System.out.println(i);

        list.forEach(System.out::println);

        System.out.println(list);

        list.add(0, 2);
        list.forEach(System.out::println);

        list.set(3, 3);

        ArrayList<Integer> listTwo = new ArrayList<>();
        listTwo.add(222);
        listTwo.add(444);
        listTwo.add(555);

        list.addAll(listTwo);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println(list.get(0));
    }
}
