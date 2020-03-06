package at.dcv;

public class Meal {
    private String name;
    private double price;
    private int calories;

    public Meal(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    public String toString() {
        return this.name + " " + this.getCalories() + " kcal " + this.getPrice() + " €";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
