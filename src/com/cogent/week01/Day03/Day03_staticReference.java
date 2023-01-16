package com.cogent.week01.Day03;

public class Day03_staticReference {
    public static void main(String[] args) {
        test2 obj = new test2();
        System.out.println(obj.i);
        System.out.println(test2.j);
        System.out.println(test2.str);
        System.out.println(test2.calcExponent(2));
        System.out.println(obj.isStrInitialized());

        System.out.println("\n this is from main2");
        Day03_staticReference obj2 = new Day03_staticReference();
        obj2.main2();
    }
    void main2() {
        test2 obj = new test2();
        System.out.println(obj.i);
        System.out.println(test2.j);
        System.out.println(test2.str);
        System.out.println(test2.calcExponent(2));
        System.out.println(obj.isStrInitialized());
    }
}

class test2 {
    double i = 25.6f;
    static int j = 4;
    static String str = "this is a static string";

    public boolean isStrInitialized() {
        return str.length() > 0;
    }

    public static double calcExponent(int a) {
        return Math.pow(j, a);
    }
}