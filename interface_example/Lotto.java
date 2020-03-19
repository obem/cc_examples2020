package com.company;

public class Lotto implements IGame {
    @Override
    public void playGame(int timeToPlay){
        System.out.println("play lotto");
    }

    @Override
    public int getCountOfMaximumPlayers() {
        return 1;
    }
}
