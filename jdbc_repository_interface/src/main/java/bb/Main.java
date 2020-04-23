package bb;

import bb.databse.models.Meal;
import bb.databse.repositories.MealRepository;

public class Main {
    public static void main(String[] args) {
        MealRepository mealRepository = new MealRepository();
        mealRepository.findAll();
        mealRepository.create(new Meal("Käse", 1.30));
        System.out.println(mealRepository.findOne(1));
    }
}
