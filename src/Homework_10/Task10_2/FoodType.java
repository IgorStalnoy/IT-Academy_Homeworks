package Homework_10.Task10_2;

public enum FoodType {
    MEAT(false), FISH(false), FRUIT(true), VEGETABLE(true), MILK(true), UNKNOWN;

    private boolean isVegetarian;

    FoodType(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    FoodType() {
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}
