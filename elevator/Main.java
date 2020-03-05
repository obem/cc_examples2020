package com.company;

public class Main {

    /*
    Aufgabe: Bekanntlich sind Personenaufzüge auf ein Maximalgewicht beschränkt
    Meist ist darin zu lesen entweder x Personen oder aber maximal x kilogramm sind zugelassen
    In unserem Beispiel gehen wir davon aus, das maximal 800 kg im Aufzug erlaubt sind
    und der Rest der Personen darf nicht mitfahren.

    Das heißt wir benötigen einen Datenspeicher (Array), welcher die Gewichte der einzelnen
    Personen beinhaltet und iterieren diesen durch, bis das Maximalgewicht erreicht ist
     */
    public static void main(String[] args) {
	    // mein int Array welches die einzelnen Gewichte beinhaltet
	    int[] weights = {78, 102, 60, 80, 91, 97, 54, 30, 89, 86, 67};
        // ich initialisiere eine "Summen" - Variable, welche ich in der Schleife zur
        // Berechnung des Gesamtgewichts verwenden kann
	    int sumOfWeights = 0;
	    // ich initialisiere eine Variable die mir das maximale Gewicht speichert
	    int maxWeight = 800;

        for (int i = 0; i < weights.length; i++) {
            // ich zähle das Gewicht des aktuellen Durchlaufes mit dem der vorherigen zusammen
            sumOfWeights = sumOfWeights + weights[i];

            // ich überprüfe ob wir nun über dem Maximalgewicht sind
            if(sumOfWeights > maxWeight){
                // hier wird das aktuelle Gewicht, das den "Überschuss" ergibt wieder abgezogen
                sumOfWeights = sumOfWeights - weights[i];
                System.out.println("Aktuell befinden sich " + sumOfWeights + " kg im Aufzug. Mit der nächsten Person (" + weights[i] + " kg) wäre das Maximalgewicht überschritten!");
                break;
            }
        }


    }
}
