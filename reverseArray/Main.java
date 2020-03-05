package com.company;

public class Main {

    /*
        Reverse Array:
        Drehe ein integer Array um.

        Fall1: Gegeben ist ein integer Array der Länge 5 mit ebenso vielen verschiedenen
        Zahlen. Versuche die Zahlen dieses Array verkehrt in ein neues (leeres) zu schreieben
        Array 1         ==>         Array 3
        5                           2
        11                          9
        19                          19
        9                           11
        2                           5
     */
    public static void main(String[] args) {
        // initialisiere das Zahlenarray mit 5 Werten
        int[] originalArray = {5, 11, 19, 9, 2};
        // initialisiere das umgedrehte Array mit der Länge 5
        int[] reverseArray = new int[originalArray.length];

        // printe die Überschrift
        System.out.println("Array1\t\t\tArray2");
        // iteriere mein oiriginales Array
        for (int i = 0; i < originalArray.length; i++) {
            // schreibe den Wert in verkehrter Folge ins reversed
            // da Arrays 0 basiert sind und die Länge die Anzahl angibt
            // nehmen wir die Länge - 1 und dann - der aktuellen Runde
            // Runde 0: 5 - 1 - 0 => 4
            // Runde 1: 5 - 1 - 1 => 3
            // Runde 2: ....
            reverseArray[originalArray.length - 1 - i] = originalArray[i];
        }

        // beide Arrays sind gleich lang, so iteriere ich einfach über die Länge
        // von einem und drucke mit dem Zähler i die Zahlenwerte beider aus
        for (int i = 0; i < originalArray.length; i++) {
            System.out.println(originalArray[i] + "\t\t\t\t" + reverseArray[i]);
        }
    }
}
