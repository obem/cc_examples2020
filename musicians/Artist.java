package com.company;

public class Artist extends Person {
    private String artistName = "";

    public Artist(String name, int age) {
        super(name, age);
    }

    public void setArtistName(String artistName){
        this.artistName = artistName;
    }
}
