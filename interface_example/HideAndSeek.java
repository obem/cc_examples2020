package com.company;

public class HideAndSeek implements IGame {
    @Override
    public void playGame(int timeToPlay){
        System.out.println("wir sind 5 personen 4 gehen sich nun verstecken");
        goAndHide();
        System.out.println("der über geblieben zählt auf 10 und geht suchen");
        System.out.println("play some hide and seek");
    }

    private void goAndHide(){
        System.out.println("4 personen versteckt!");
    }

    @Override
    public int getCountOfMaximumPlayers() {
        return 100;
    }
}
