package com.company;
/*
Wir haben Personen die die Funktion haben "playSomeGame"
Hier sollte es möglich sein Spiele jeglicher Art zu spielen
* draußen
* kinderspielzeug
* konsole
* lotto
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person = new Person();
        HideAndSeek hideAndSeek = new HideAndSeek();
        person.playSomeGame(hideAndSeek, 10);
        Lotto lotto = new Lotto();
        person.playSomeGame(lotto, 1);
        Nintendo nintendo = new Nintendo();
        person.playSomeGame(nintendo, 30);
        Playmobil playmobil = new Playmobil();
        person.playSomeGame(playmobil, 29);

        int countOfPlayers = hideAndSeek.getCountOfMaximumPlayers();
    }
}
