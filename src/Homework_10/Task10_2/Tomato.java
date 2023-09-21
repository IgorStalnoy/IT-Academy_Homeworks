package Homework_10.Task10_2;

public class Tomato extends Food {

    private final FoodType type = FoodType.VEGETABLE;

    public Tomato(String name) {
        super(name);
    }

    public FoodType getFoodType() {
        return type;
    }

}
