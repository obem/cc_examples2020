package com.company;

public class Playmobil implements IGame {
    @Override
    public void playGame(int timeToPlay) {
        System.out.println("play some playmobil");

        if(timeToPlay > 30){
            System.out.println("stop playing");
        }
    }
    @Override
    public int getCountOfMaximumPlayers() {
        return 100;
    }
}
