package com.company;

public class CalculateTax {
    /*
     Methoden:
     Wir möchten den Preis inkl. Mehrwertsteuer berechnen, da wir dies aber nicht mehrfach
     im Code implementieren möchten, behelfen wir uns der Methoden.
     Wir unterscheiden hierbei zwei Fälle:
     Fall 1:
     Uns ist der Betrag und die Mehrwertsteuer bekannt
     Fall 2:
     Uns ist der Betrag und das Land für das wir den Preis inkl. MWST berechnen bekannt
     */
    public static void main(String[] args){
        // uns ist sowohl die MWST wie auch der Preis bekannt
        caseOne();

        // uns ist der Preis und das Land bekannt
        caseTwo();
    }

    public static void caseOne(){
        System.out.println("caseOne");
        double myTaxAustria = 1.20; // initialisiert eine Variable mit der Österreichischen MWST
        double amount = 1000.0; // initialisiert eine Variable mit dem Betrag

        // verwendet für die Ausrechnung die Methode "calculateMyTaxAmount und
        // speichert das Ergebnis in die Variable
        double myAustriaAmount = calculateMyTaxAmount(amount, myTaxAustria);

        System.out.println("my austrian amount with tax: " + myAustriaAmount);

        double myTaxGermany = 1.19; // initialisiert eine Variable mit der Deutschen MWST
        // verwendet für die Ausrechnung die Methode "calculateMyTaxAmount" und
        // speichert das Ergebnis in die Variable
        double myGermanAmount = calculateMyTaxAmount(amount, myTaxGermany);

        System.out.println("my german amount with tax: " + myGermanAmount);
    }

    public static void caseTwo(){
        System.out.println("caseTwo");
        double amount = 1000.0;
        String countryCode = "AT";

        // verwendet zur Ausrechnung die Methode "calculateMyTaxAmount" mit dem Ländercode
        // welche wiederum in der Methode zur Berechnung endet
        double myAustriaAmount = calculateMyTaxAmount(amount, countryCode);

        System.out.println("my austrian amount with tax: " + myAustriaAmount);

        countryCode = "DE";

        // verwendet zur Ausrechnung die Methode "calculateMyTaxAmount" mit dem Ländercode
        // welche wiederum in der Methode zur Berechnung endet
        double myGermanAmount = calculateMyTaxAmount(amount, countryCode);

        System.out.println("my german amount with tax: " + myGermanAmount);
    }

    public static double calculateMyTaxAmount(double amount, String country) {
        /*
        WERT AUS DATENBANK oder so ähnlich, vereinfacht hier weiß ihn das Programm
        */
        double myTax = 0; // initialisiert die MWST Variable mit 0
        switch (country) {
            case "DE": // im Falle von Deutschland wird mit 19 % gerechnet
                myTax = 1.19;
                break;

            case "AT": // im Falle von Österreich wird mit 20 % gerechnet
                myTax = 1.20;
                break;
        }
        return calculateMyTaxAmount(amount, myTax); // ruft die Methode der eigentlichen Rechnung auf und gibt das Ergebnis zurück
    }

    public static double calculateMyTaxAmount(double amount, double myTax) {
        // die MWST wird ausgerechnet und zurückgegeben
        return amount * myTax;
    }


}
