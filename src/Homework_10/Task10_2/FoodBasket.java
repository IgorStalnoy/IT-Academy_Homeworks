package Homework_10.Task10_2;

public class FoodBasket {

    private final Food[] foodBasket;

    public FoodBasket(Food...foods) {
        this.foodBasket = new Food[foods.length];
        System.arraycopy(foods,0,foodBasket,0,foodBasket.length);
    }

    public boolean isAllVegetarian() {
        for (Food i : foodBasket) {
            if (!i.getFoodType().isVegetarian()) {
                return false;
            }
        }
        return true;
    }
}
