package Homework_10.Task10_2;

public class Beef extends Food{

    private final FoodType type = FoodType.MEAT;

    public Beef(String name) {
        super(name);
    }

    public FoodType getFoodType() {
        return type;
    }

}
