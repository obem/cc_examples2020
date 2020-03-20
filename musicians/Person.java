package com.company;

public class Person {
    private int age = 0;
    private String name = "";

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " ist " + age + " Jahre alt.";
    }
}
