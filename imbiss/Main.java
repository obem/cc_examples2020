package at.dcv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person ali = new Person("Ali", 5, 500);
        Person franz = new Person("Franz", 10, 20);
        Person maria = new Person("Maria", 3, 100);

        Restaurant fancyImbiss = new Restaurant("Fancy Imbiss", "Bahnhofstraße 3", "Dornbirn", franz, 20);
        Meal doener = new Meal("Döner", 5, 600);
        Meal duerum = new Meal("Dürüm", 6, 650);
        Meal doenerbox = new Meal("Dönerbox", 5.5, 700);
        fancyImbiss.addNewMeal(doener);
        fancyImbiss.addNewMeal(duerum);
        fancyImbiss.addNewMeal(doenerbox);
        Meal chickenBurritos = new Meal("Chicken Burrito", 4.7, 400);
        fancyImbiss.addNewMeal(chickenBurritos);

        fancyImbiss.order(ali, duerum);

        System.out.println(doener.toString());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Imbisssimulator:");
        fancyImbiss.printMenu();
        System.out.println("Choose your meal");

        fancyImbiss.order(ali, scanner.nextInt());

    }
}

