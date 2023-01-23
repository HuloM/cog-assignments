package com.cogent.assignments.day03.q1.gl.itp.hyd64.cs.matt;

import java.util.Arrays;
import java.util.Collections;

public class Advisor {
    String[] message = new String[5];

    public Advisor() {
        String[] advice = {"work hard", "study", "practice everyday", "focus", "pay attention"};

        message = Arrays.copyOf(advice, 5);
    }

    public String getAdvice() {
        return this.message[(int) (Math.random() * this.message.length)];
    }
}
