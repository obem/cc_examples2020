package com.company;

public class LottoSpiel {
    /*
    Wir wollen ein Lottofeld (7 x 7) generieren und bei den
    getippten Zahlen ein x ausgeben
     */
    public static void main(String[] args) {
        int[] myTips = {13, 17, 37, 4, 42, 8, 11}; // initialisiert ein Array mit den getippten Zahlen

        printLottoOne(myTips);
        printLottoTwo(myTips);
    }

    /*
    Empfängt die getippten Werte in einem int - Array und printed diese mit einer Schleife
     */
    public static void printLottoOne(int[] myTips) {
        System.out.println("Eine Schleife");
        for (int i = 1; i < 50; i++) {
            if (isMyNumber(i, myTips)) {
                System.out.print("|x|");
            } else {
                System.out.print("|_|");
            }

            if (i % 7 == 0) {
                System.out.println();
            }
        }
    }

    /*
    Empfängt die getippten Werte in einem int - Array und printed diese mit zwei Schleifen
     */
    public static void printLottoTwo(int[] myTips) {
        System.out.println("Zwei Schleifen");
        int myNumberCounter = 1;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if(isMyNumber(myNumberCounter, myTips)){
                    System.out.print("|x|");
                } else {
                    System.out.print("|_|");
                }

                myNumberCounter++;
            }
            System.out.println();
        }
    }

    public static boolean isMyNumber(int columnNumber, int[] myTips) {
        boolean isMyNumber = false;

        for (int i = 0; i < myTips.length; i++) {
            if (myTips[i] == columnNumber) {
                isMyNumber = true;
                break;
            }
        }

        return isMyNumber;
    }
}
