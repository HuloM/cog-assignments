package com.cogent.assignments.day03.q8;

public class Usertrail {
    int val1, val2;

    public Usertrail(int val1, int val2) throws IllegalValueException {
        if (val1 < 0 || val2 < 0)
            throw new IllegalValueException();

        this.val1 = val1;
        this.val2 = val2;
    }

    public boolean show() {
        return (val1 > 0 && val2 > 0);
    }
}
