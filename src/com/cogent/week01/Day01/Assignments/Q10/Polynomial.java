package com.cogent.week01.Day01.Assignments.Q10;

public class Polynomial {
    private Term[] terms;
    private int termCount;
    public Polynomial(int size) {
        this.terms = new Term[size];
        this.termCount = 0;
    }

    public Polynomial() {
        this.terms = new Term[5];
        this.termCount = 0;
    }

    public void setTerm(int coeff, int expo) {
        if (expo < 0) {
            System.out.println("the exponent cannot be negative");
            return;
        }
        if(checkCurrentExponents(expo)) {
            System.out.println("the exponent is already being used");
            return;
        }
        if(termCount < this.terms.length) {
            this.terms[termCount] = new Term(coeff, expo);
            termCount++;
        }
        else {
            System.out.println("no more terms can be loaded");
        }
    }

    private boolean checkCurrentExponents(int expo) {
        for (int i = 0; i < termCount; i++)
            if(expo == this.terms[i].getExponent())
                return true;
        return false;
    }
}
