package Homework_9.Task9_1;

public class Phone implements Comparable<Phone> {
    private final long number;
    private final String model;
    private final double weight;  //kg
    private final int price;

    public Phone(long number, String model, double weight, int price) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Phone anotherPhone) {
        int anotherPhonePrice = anotherPhone.getPrice();
        return this.price - anotherPhonePrice;
    }

    public int getPrice() {
        return price;
    }
}

