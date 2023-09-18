package Homework_7.Task7_2.PublicTransport;

public class MiniBus extends PublicTransport {
    private final int gasolineConsumption;
    private final int volumeOfDriversCoinBox;

    public MiniBus(String model, String fuelType, int maxDistance, int maxNumberOfSeats, int gasolineConsumption, int price, int volumeOfDriversCoinBox) {
        super(model, fuelType, maxDistance, maxNumberOfSeats, price);
        this.gasolineConsumption = gasolineConsumption;
        this.volumeOfDriversCoinBox = volumeOfDriversCoinBox;
    }

    @Override
    public String toString() {
        return super.toString() + " gasolineСonsumption : " + gasolineConsumption;
    }

    public int getGasolineConsumption() {
        return gasolineConsumption;
    }
    public int getVolumeOfDriversCoinBox() {
        return volumeOfDriversCoinBox;
    }
}
