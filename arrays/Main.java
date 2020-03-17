package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // ein String - Array welches verschiedenste Sprachen beinhaltet
        // wenn die gesuchte Sprache "myLanguage" Mexican entspricht werden wir nicht
        // fündig, wenn wir im Array nun den 1er von Mexican1 weg nehmen werden wir fündig
        String[] supportedLanguages = { "German", "English", "Polish",
                "Spanish", "Russian","Chinese", "Italian", "Mexican1"};

        String myLanguage = "Mexican";

        // ein boolean welcher das Suchergebnis spiegelt
        // hasNotFoundMyLanguage hat per default "true"
        // so gehen wir davon aus das die Sprache nicht im Array vorkommt
        boolean hasNotFoundMyLanguage = true;

        for (int i = 0; i < supportedLanguages.length; i++) {
            // String Vergleich auf die Sprache aus dem Array mit der gesuchten Sprache
            if(myLanguage.equals(supportedLanguages[i])) {
                // wir setzen unseren Ergebnis boolean auf false, was so viel
                // heißt wie die Sprache wurde gefunden
                hasNotFoundMyLanguage = false;
                System.out.println(supportedLanguages[i]);
                // wir breaken hier um unnötige Schleifen Durchläufe zu vermeiden
                // denn wenn die Sprache gefunden ist müssen wir nicht weiter in der
                // Schleife durchgehen
                break;
            }
            //System.out.println(i);
        }

        // sollte durch die Ganze Schleife der boolean den Wert
        // nicht verändert haben, so printen wir das die Sprache nicht
        // beinhaltet ist
        if(hasNotFoundMyLanguage){
            System.out.println("no " + myLanguage + " here");
        }

        // Mein Beispiel String dessen Länge ich durchgehen möchte
        // und jedes einzelne Zeichen ausdrucke
        String mySuperString = "Coding";

        // geht die Länge des Strings durch, am Beispiel "Coding" steht da nun i < 6
        for (int i = 0; i < mySuperString.length(); i++) {
            //System.out.println(mySuperString.charAt(i));
            // wir schneiden Zeichen für Zeichen einzeln raus
            // i = 0: substring(0,1) ==> "C"
            // i = 1: substring(1,2) ==> "o"
            // i = 2: substring(2,3) ==> "d"
            // ...
            System.out.println(mySuperString.substring(i, i + 1));
        }

        // Array zum sammeln von 3 Inputs
        String[] myUserInputs = new String[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < myUserInputs.length; i++) {
            // Benutzereingabe an der jeweiligen Stelle im Array speichern
            myUserInputs[i] = scanner.nextLine();
        }

        for (int i = 0; i < myUserInputs.length; i++) {
            // Benutzereingaben wieder ausgeben
            System.out.println(myUserInputs[i]);
        }

        int[] myIntArray = new int[10];
        int[] myOtherArray = new int[10];
        Random random = new Random();

        // random Zahlen in zwei Int Arrays füllen
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = random.nextInt(100);
            myOtherArray[i] = random.nextInt(100);
            //System.out.println(myIntArray[i]);
        }

        // sortieren von Arrays (aufsteigen)
        Arrays.sort(myIntArray);
        Arrays.sort(myOtherArray);
        Arrays.sort(supportedLanguages);

        // in "myArray2" ist nur ein Zeiger auf den Speicherplatz des Arrays gespeichert
        int[] myArray1 = {2,3,4,5,6};
        int[] myArray2 = myArray1;

        // wir würden in beiden VARIABLEN (myArray1, myArray2) nun 1 an 0. Stelle
        // stehen haben, da dies auf dasselbe Array zeigt
        myArray2[0] = 1;

        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println(myIntArray[i]);
        }
    }
}
