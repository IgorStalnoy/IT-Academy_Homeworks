package Homework_7.Task7_1.HomeAppliances;

public class Generator extends HomeAppliance {
    int generatedPower;

    public Generator(String type, int price, String model, int generatedPower, double weight) {
        super(model, weight, price, type);
        this.generatedPower = generatedPower;
    }

    @Override
    public void connectToPowerGrid() {
        if (getBelongsToHouse() == null) {
            System.out.println("You can't plug in something you don't have. Please buy an item\n");
        } else if (getBelongsToHouse() != null && isConnectedToGrid()) {
            System.out.println("You have already plugged in the appliance\n");
        } else {
            setConnectedToGrid(true);
            getBelongsToHouse().setMaxNetworkLoad(this.generatedPower);
            System.out.println("You have successfully connected the device to the network\n");
        }
    }

    public void disconnectFromPowerGrid() {
        if (getBelongsToHouse() == null) {
            System.out.println("You can't unplug in something you don't have. Please buy an item\n");
        } else if (getBelongsToHouse() != null && !isConnectedToGrid()) {
            System.out.println("You have already unplugged in the appliance\n");
        } else {
            if (getBelongsToHouse().getUsedNetworkLoad() > getBelongsToHouse().getMaxNetworkLoad() - this.generatedPower) {
                getBelongsToHouse().energyOverload();
            } else {
                setConnectedToGrid(false);
                getBelongsToHouse().setMaxNetworkLoad(this.generatedPower * -1);
                System.out.println("You have successfully disconnected the device to the network\n");
            }
        }
    }

    public int getGeneratedPower() {
        return generatedPower;
    }
}
