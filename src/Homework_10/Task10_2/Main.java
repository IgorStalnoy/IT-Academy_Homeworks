package Homework_10.Task10_2;

/**
 *      Создать enum - FoodType (MEAT, FISH, FRUIT, VEGETABLE, MILK, UNKNOWN)
 *  ○    Создать базовый абстрактный класс Food и в нем абстрактный метод public FoodType getFoodType();
 *  ○    Создать 2-3 класса наследника Food и реализовать методы get/set name, a также переопределить getFoodType для каждого.
 *  ○    Создать отдельный класс с методом проверок boolean isVegetarian(Food[] foods) в метод передается набор ингредиентов,
 *          на выходе true если все они вегетарианские.
 */
public class Main {
    public static void main(String[] args) {

        Bread bread = new Bread("Bread");
        Tomato tomato = new Tomato("Tomato");
        Beef beef = new Beef("Beef");

        System.out.println(tomato.getFoodType());
        System.out.println(tomato.getName());
        tomato.setName("Happy Tomato Eats Cucumber");
        System.out.println(tomato.getFoodType());
        System.out.println(tomato.getName());

        FoodBasket foodBasket1 = new FoodBasket(beef,bread,tomato,tomato);
        FoodBasket foodBasket2 = new FoodBasket(bread,bread,bread,tomato);
        FoodBasket foodBasket3 = new FoodBasket(tomato,tomato,tomato,tomato);
        System.out.println(foodBasket1.isAllVegetarian());
        System.out.println(foodBasket2.isAllVegetarian());
        System.out.println(foodBasket3.isAllVegetarian());

    }
}
