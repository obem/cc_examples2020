package com.company;

public class Guitarist extends Musician {
    public Guitarist(String name, int age, Band band) {
        super(name, age, band);
    }

    public void switchGuitar(){
        System.out.println("switched my guitar");
    }

    @Override
    public String toString() {
        return super.toString() + " Gitarre";
    }
}
