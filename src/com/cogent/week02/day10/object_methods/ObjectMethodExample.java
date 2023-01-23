package com.cogent.week02.day10.object_methods;

import java.util.Objects;

public class ObjectMethodExample {
    public static void main(String[] args) {
        Person p1 = new Person(20, "john");
        Person p2 = new Person(20, "john");
        Person p3 = new Person(21, "john");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3.toString());


        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p2.equals(p3));
    }
}

class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
