package Homework_7.Task7_2.PublicTransport;

public class SubwayTrain extends PublicTransport {
    private final int energyConsumption;
    private final int trainLength;

    public SubwayTrain(String model, String fuelType, int maxDistance, int maxNumberOfSeats, int energyConsumption, int price, int trainLength) {
        super(model, fuelType, maxDistance, maxNumberOfSeats, price);
        this.energyConsumption = energyConsumption;
        this.trainLength = trainLength;
    }

    @Override
    public String toString() {
        return super.toString() + " energyConsumption : " + energyConsumption;
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }

    public int getTrainLength() {
        return trainLength;
    }
}
