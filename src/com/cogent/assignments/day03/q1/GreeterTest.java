package com.cogent.assignments.day03.q1;

import com.cogent.assignments.day03.q1.gl.itp.hyd64.cs.matt.Advisor;
import com.cogent.assignments.day03.q1.gl.itp.hyd64.cs.matt.Greeter;

public class GreeterTest {

    public static void main(String[] args) {
        Advisor a = new Advisor();
        Greeter[] greeters = new Greeter[args.length];
        for (int i = 0; i < args.length; i++) {
            Greeter g = new Greeter(args[i]);
            System.out.println(g.sayHello());
            greeters[i] = g;
        }

        System.out.println(a.getAdvice());
        for (int i = greeters.length - 1; i >= 0; i--) {
            System.out.println(greeters[i].sayGoodbye());
        }
    }
}
