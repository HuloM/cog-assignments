package com.cogent.week03.day11.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceExample {

    public static int transformAndAdd(List<Integer> l,
                                      Function<Integer, Integer> f) {
        int result = 0;
        for (Integer s : l)
            result += f.apply(s);

        return result;
    }
    // Operations utility class
    class OpsUtil {

        // Method 1
        // To half the variable
        public static Integer doHalf(Integer x) {
            return x / 2;
        }

        // Method 2
        // Square up the integer number
        public static Integer doSquare(Integer x) {

            return x * x;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        // Using an anonymous class
        transformAndAdd(list, new Function<Integer, Integer>() {
            public Integer apply(Integer i) {
                // The method
                return OpsUtil.doHalf(i);
            }
        });

        // Using a lambda expression
        System.out.println(transformAndAdd(list, i -> OpsUtil.doHalf(i)));

        // Using a method reference
        System.out.println(transformAndAdd(list, OpsUtil::doHalf));

    }
}
