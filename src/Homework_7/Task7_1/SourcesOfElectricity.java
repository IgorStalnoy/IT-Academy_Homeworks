package Homework_7.Task7_1;

public class SourcesOfElectricity extends HomeTechnique {
    int generatedPower;

    public SourcesOfElectricity(String type, int price, String model, int generatedPower, double weight) {
        super(model, weight, price, type);
        this.generatedPower = generatedPower;
    }

    @Override
    public void connectToPowerGrid() {
        if (!Home.availabilityCheck(this)) {
            System.out.println("You can't plug in something you don't have. Please buy an item\n");
        } else if (Home.availabilityCheck(this) && Home.isConnectedToPowerGridCheck(this)) {
            System.out.println("You have already plugged in the appliance\n");
        } else {
            this.isConnectedToGrid = true;
            Home.setMaxNetworkLoad(this.generatedPower);
            System.out.println("You have successfully connected the device to the network\n");
        }
    }

    public void disconnectFromPowerGrid() {
        if (!Home.availabilityCheck(this)) {
            System.out.println("You can't unplug in something you don't have. Please buy an item\n");
        } else if (Home.availabilityCheck(this) && !Home.isConnectedToPowerGridCheck(this)) {
            System.out.println("You have already unplugged in the appliance\n");
        } else {
            if (Home.getUsedNetworkLoad() > Home.getMaxNetworkLoad() - this.generatedPower) {
                Home.energyOverload();
            } else {
                this.isConnectedToGrid = false;
                Home.setMaxNetworkLoad(this.generatedPower * -1);
                System.out.println("You have successfully disconnected the device to the network\n");
            }
        }
    }

    public int getGeneratedPower() {
        return generatedPower;
    }
}
