package at.dcv;

public class Person {
    private String name;
    private int caloriesConsumed = 0;
    private double money;

    public Person(String name, int caloriesConsumed, double money) {
        this.name = name;
        this.caloriesConsumed = caloriesConsumed;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCalories(int calories) {
        this.caloriesConsumed += calories;
    }

    public void spendMoney(double amount) {
        this.money -= amount;
    }
}
