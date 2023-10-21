package Homework_10.Task10_2;

public class Tomato extends Food {
    private final String variety;

    public Tomato(String name, String variety) {
        super(FoodType.VEGETABLE, name);
        this.variety = variety;
    }
    public String getVariety() {
        return variety;
    }
}
