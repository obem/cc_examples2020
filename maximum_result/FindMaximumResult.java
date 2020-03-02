package com.company;

import java.util.Random;

public class FindMaximumResult {
    /*
    iterate 10 times and take a random number each time
    calculate this random number with the counter i
    and check the maximum number of all 10 rounds
     */
    public static void main(String[] args){
        Random random = new Random(); // initialize a random object
        int myMaxResult = 0; // define the maximum result
        int myCalculationInt = 0; // define a calculation

        for (int i = 0; i < 10; i++) { // iterate 10 times
            int myNextRandomNumber = random.nextInt(20); // take a random number from 0 to 20
            myCalculationInt = i * myNextRandomNumber; // calculate my counter "i" with the random number

            if (myCalculationInt > myMaxResult) { // check if my calculation ist greater then the max
                myMaxResult = myCalculationInt;
            }

            System.out.println("my " + i + ". round result: " + myCalculationInt); // print the counter i and its calculation result
        }

        System.out.println("my max result: " + myMaxResult); // print my maximum
    }
}
