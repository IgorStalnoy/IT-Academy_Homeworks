package Homework_7.Task7_1;

public class LivingRoomAppliances extends HomeTechnique {
    private final int powerConsumption;

    public LivingRoomAppliances(String type, int price, String model, int powerConsumption, double weight) {
        super(model, weight, price, type);
        this.powerConsumption = powerConsumption;
    }

    @Override
    public void connectToPowerGrid() {
        if (!Home.availabilityCheck(this)) {
            System.out.println("You can't plug in something you don't have. Please buy an item\n");
        } else if (Home.availabilityCheck(this) && Home.isConnectedToPowerGridCheck(this)) {
            System.out.println("You have already plugged in the appliance\n");
        } else {
            if (Home.getUsedNetworkLoad() + this.powerConsumption > Home.getMaxNetworkLoad()) {
                Home.energyOverload();
            } else {
                this.isConnectedToGrid = true;
                Home.setUsedNetworkLoad(this.powerConsumption);
                System.out.println("You have successfully connected the device to the network. Please do not overload the network.\n");
            }
        }
    }

    @Override
    public void disconnectFromPowerGrid() {
        if (!Home.availabilityCheck(this)) {
            System.out.println("You can't unplug something you don't have. Please buy an item\n");
        } else if (Home.availabilityCheck(this) && !Home.isConnectedToPowerGridCheck(this)) {
            System.out.println("You have already unplugged the appliance\n");
        } else {
            this.isConnectedToGrid = false;
            Home.setUsedNetworkLoad(this.powerConsumption * -1);
            System.out.println("You have successfully disconnected the device to the network. Please do not overload the network.\n");
        }
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }
}
