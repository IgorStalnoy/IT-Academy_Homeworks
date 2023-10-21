package Homework_10.Task10_2;

public class Bread extends Food {

    private final String corn;

    public Bread(String name, String corn) {
        super(FoodType.UNKNOWN, name);
        this.corn = corn;
    }

    public String getCorn() {
        return corn;
    }
}
