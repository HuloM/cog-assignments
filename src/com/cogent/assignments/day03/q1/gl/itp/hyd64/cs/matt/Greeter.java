package com.cogent.assignments.day03.q1.gl.itp.hyd64.cs.matt;

public class Greeter {
    String name;

    public Greeter(String aName) {
        this.name = aName;
    }

    public String sayHello() {
        return this.name + " says hello";
    }

    public String sayGoodbye() {
        return this.name + " says good bye";
    }

}
