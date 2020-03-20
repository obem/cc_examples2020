package com.company;

public class Bassist extends Musician {

    public Bassist(String name, int age, Band band) {
        super(name, age, band);
    }

    @Override
    public String toString() {
        return super.toString() + " Bass";
    }
}