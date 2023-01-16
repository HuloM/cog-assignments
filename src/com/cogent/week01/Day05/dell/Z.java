package com.cogent.week01.Day05.dell;

import com.cogent.week01.Day05.hp.X;

public class Z extends X {
    public static void main(String[] args) {
        X x = new X();
        System.out.println("r: " + x.s);
        Z z = new Z();
        System.out.println("r: " + z.r);

        // ! cannot access p or q due to access modifiers
    }


}
