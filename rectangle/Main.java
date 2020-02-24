package com.company;
/*
we want to draw a rectangle like this

example1

XXXXXX 
XXXXXX
XXXXXX
XXXXXX
XXXXXX

and this

example 2

XXXXXX
OOOOOO
XXXXXX
OOOOOO
XXXXXX
OOOOOO

 */

public class Main {

    public static void main(String[] args) {
        // example 1
        int rows = 5; // define the number of rows
        int columns = 6; // define the number of columns

	    for(int i = 1; i <= rows; i++) { // we iterate the rows
	        for(int j = 0; j < columns; j++) { // we iterate the columns
                System.out.print("X"); // we print a X without any new line
            }
            System.out.println(); // we create a new line after each row
        }

        System.out.println("--------------------------------");

	    //example 2
        for(int i = 1; i <= rows; i++) { // we iterate the rows
            for(int j = 0; j < columns; j++) { // we iterate the columns
                if(i%2 == 0){ // every second row should be an "O"
                    System.out.print("O");
                } else {
                    System.out.print("X"); // we print a X all other times
                }
            }
            System.out.println(); // we create a new line after each row
        }
    }
}
