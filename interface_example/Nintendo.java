package com.company;

public class Nintendo implements IGame {
    @Override
    public void playGame(int timeToPlay) {
        System.out.println("play some nintendo");
    }

    @Override
    public int getCountOfMaximumPlayers() {
        return 4;
    }
}
