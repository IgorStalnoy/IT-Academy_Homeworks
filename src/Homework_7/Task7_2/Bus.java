package Homework_7.Task7_2;

public class Bus extends PublicTransport {
    private final int gasolineConsumption;

    public Bus(String model, String fuelType, int maxDistance, int maxNumberOfSeats, int gasolineConsumption, int price) {
        super(model, fuelType, maxDistance, maxNumberOfSeats, price);
        this.gasolineConsumption = gasolineConsumption;
    }

    @Override
    public String toString() {
        return super.toString() + " gasolineСonsumption : " + gasolineConsumption;
    }

    public int getGasolineConsumption() {
        return gasolineConsumption;
    }
}
