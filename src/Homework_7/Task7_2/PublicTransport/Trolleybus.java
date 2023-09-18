package Homework_7.Task7_2.PublicTransport;

public class Trolleybus extends PublicTransport {
    private final int energyConsumption;
    private final int hornLength;

    public Trolleybus(String model, String fuelType, int maxDistance, int maxNumberOfSeats, int energyConsumption, int price, int hornLength) {
        super(model, fuelType, maxDistance, maxNumberOfSeats, price);
        this.energyConsumption = energyConsumption;
        this.hornLength = hornLength;
    }

    @Override
    public String toString() {
        return super.toString() + " energyConsumption : " + energyConsumption;
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }

    public int getHornLength() {
        return hornLength;
    }
}
