package Homework_7.Task7_2.PublicTransport;

public class Bus extends PublicTransport {
    private final int gasolineConsumption;
    private final int exhaustGasLevel; //%

    public Bus(String model, String fuelType, int maxDistance, int maxNumberOfSeats, int gasolineConsumption, int price, int exhaustGasLevel) {
        super(model, fuelType, maxDistance, maxNumberOfSeats, price);
        this.gasolineConsumption = gasolineConsumption;
        this.exhaustGasLevel = exhaustGasLevel;
    }

    @Override
    public String toString() {
        return super.toString() + " gasolineСonsumption : " + gasolineConsumption;
    }

    public int getGasolineConsumption() {
        return gasolineConsumption;
    }

    public int getExhaustGasLevel() {
        return exhaustGasLevel;
    }
}
