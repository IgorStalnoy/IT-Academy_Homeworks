package Homework_10.Task10_2;

public abstract class Food {

    private final FoodType type;
    private String name;

    public Food(FoodType type, String name) {
        this.type = type;
        this.name = name;
    }

    public FoodType getFoodType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
