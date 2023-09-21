package Homework_10.Task10_2;

public class Bread extends Food{

    private final FoodType type = FoodType.UNKNOWN;

    public Bread(String name) {
        super(name);
    }

    public FoodType getFoodType() {
        return type;
    }

}
