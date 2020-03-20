package com.company;

public class Musician extends Artist {
    private Band band;

    public Musician(String name, int age, Band band) {
        super(name, age);
        this.band = band;
    }

    @Override
    public String toString() {
        return super.toString() + " Spielt in der Band " + band;
    }
}
