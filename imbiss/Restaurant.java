package at.dcv;

public class Restaurant {
    String name;
    String street;
    String city;
    Person owner;
    int capacity;
    Meal[] menu = new Meal[50];
    int mealCounter = 0;
    double cash = 0;

    public Restaurant(String name, String street, String city, Person owner, int capacity) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.owner = owner;
        this.capacity = capacity;
    }

    public void printMenu(){
        System.out.println("***" + this.name + " Menü ***");
        for (int i = 0; i < this.mealCounter; i++) {
            System.out.println(this.menu[i]);
        }
    }

    public void addNewMeal(Meal meal) {
        this.menu[this.mealCounter] = meal;
        this.mealCounter++;
    }

    public void order(Person person, Meal meal) {
        person.addCalories(meal.getCalories());
        person.spendMoney(meal.getPrice());
        this.cash += meal.getPrice();
    }

    public void order(Person person, int menuNumber) {
        System.out.println(person.getName() + " ordered " + this.menu[menuNumber].getName());
        person.addCalories(this.menu[menuNumber].getCalories());
        person.spendMoney(this.menu[menuNumber].getPrice());
        this.cash += this.menu[menuNumber].getPrice();
    }
}
