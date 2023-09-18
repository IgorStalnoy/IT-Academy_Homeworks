package Homework_7.Task7_2.PublicTransport;

public abstract class PublicTransport {

    private final String model;
    private final String fuelType;
    private final int maxDistance;
    private final int maxNumberOfSeats;
    private final int price;

    public PublicTransport(String model, String fuelType, int maxDistance, int maxNumberOfSeats, int price) {
        this.model = model;
        this.fuelType = fuelType;
        this.maxDistance = maxDistance;
        this.maxNumberOfSeats = maxNumberOfSeats;
        this.price = price;
    }

    @Override
    public String toString() {
        return "" + this.getClass().getSimpleName() +
                " | model :" + model +
                " | fuelType :" + fuelType +
                " | maxDistance :" + maxDistance +
                " | maxNumberOfSeats :" + maxNumberOfSeats +
                " | price :" + price +
                " |";
    }

    public int getPrice() {
        return price;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public int getMaxNumberOfSeats() {
        return maxNumberOfSeats;
    }
}
