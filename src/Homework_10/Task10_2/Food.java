package Homework_10.Task10_2;

public abstract class Food {

    private String name;

    public Food(String name) {
        this.name = name;
    }

    public abstract FoodType getFoodType();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
