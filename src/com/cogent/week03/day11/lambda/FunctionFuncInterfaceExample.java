package com.cogent.week03.day11.lambda;

import java.util.function.Function;

public class FunctionFuncInterfaceExample {
    public static void main(String[] args) {
        Function<Integer, Boolean> func = (x) -> (x >= 20);
        Boolean isOfAge = func.apply(2);
        Boolean isOfAge2 = func.apply(22);
        System.out.println(isOfAge);
        System.out.println(isOfAge2);

        Function<Integer, Double> areaOfTriangle = radius -> Math.PI * radius * radius;
        double area = areaOfTriangle.apply(4);
        System.out.println("the area of the triangle is " + area);
    }
}
