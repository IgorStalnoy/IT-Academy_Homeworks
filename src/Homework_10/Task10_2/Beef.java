package Homework_10.Task10_2;

public class Beef extends Food {

    private final int fatPercentage;

    public Beef(String name, int fatPercentage) {
        super(FoodType.MEAT,name);
        this.fatPercentage = fatPercentage;
    }
    public int getFatPercentage() {
        return fatPercentage;
    }
}
