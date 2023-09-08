package Homework_7.Task7_2;

public class Tram extends PublicTransport {
    private final int energyConsumption;

    public Tram(String model, String fuelType, int maxDistance, int maxNumberOfSeats, int energyConsumption, int price) {
        super(model, fuelType, maxDistance, maxNumberOfSeats, price);
        this.energyConsumption = energyConsumption;
    }

    @Override
    public String toString() {
        return super.toString() + " energyConsumption : " + energyConsumption;
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }
}
