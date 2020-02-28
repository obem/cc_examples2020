package com.company;

public class Example {
    public static void main(String[] args) {
        /*
	    Fall 1:

	    Person darf den Einkauf nur tätigen
	    wenn sie genug Geld dabei hat UND kein Hausverbot hat

	     */
        double myMoney = 1100.0; // Geld das die Person dabei hat
        double myShoppingPrice = 1000.0; // der Einkaufspreis
        boolean haveEnoughMoney = myMoney >= myShoppingPrice; // Evaluierung ob genug Geld dabei ist
        boolean hatHausverbot = true; // Definition das die Person Hausverbot hat

        if (haveEnoughMoney && !hatHausverbot) { // Überprüfung ob die Person genug Geld und KEIN Hausverbot hat
            System.out.println("yeah");
        }

        System.out.println("not yeah");
    }
}
