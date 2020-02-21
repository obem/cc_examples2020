package at.dcv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Test variables
        int limit = 60;
        int number = 6;

        System.out.println("\n" + number + "er Reihe als For-Schleife:");
        /*  loop as long i is smaller/equal than our limit
            after each loop increase i by the value of number */
        for (int i = 0; i <= limit; i = i + number) {
            System.out.println(i);
        }

        System.out.println("\n" + number + "er Reihe als While-Schleife:");
        int c = 0;
        /*  loop as long c multiplied by number is smaller/equal our limit
            at the bottom of the loop we increase our count variable c by 1
         */
        while (c * number <= limit) {
            System.out.println(c * number);
            c++;
        }
    }
}

