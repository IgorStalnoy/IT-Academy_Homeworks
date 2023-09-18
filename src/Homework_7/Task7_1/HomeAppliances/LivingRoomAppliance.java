package Homework_7.Task7_1.HomeAppliances;

public class LivingRoomAppliance extends HomeAppliance {
    private final int powerConsumption;
    private final int attractivenessInInterior; //from 0 to 10

    public LivingRoomAppliance(String type, int price, String model, int powerConsumption, double weight, int attractivenessInInterior) {
        super(model, weight, price, type);
        this.powerConsumption = powerConsumption;
        this.attractivenessInInterior = attractivenessInInterior;
    }

    @Override
    public void connectToPowerGrid() {
        if (getBelongsToHouse() == null) {
            System.out.println("You can't plug in something you don't have. Please buy an item\n");
        } else if (getBelongsToHouse() != null && isConnectedToGrid()) {
            System.out.println("You have already plugged in the appliance\n");
        } else {
            if (getBelongsToHouse().getUsedNetworkLoad() + this.powerConsumption > getBelongsToHouse().getMaxNetworkLoad()) {
                getBelongsToHouse().energyOverload();
            } else {
                setConnectedToGrid(true);
                getBelongsToHouse().setUsedNetworkLoad(this.powerConsumption);
                System.out.println("You have successfully connected the device to the network. Please do not overload the network.\n");
            }
        }
    }

    @Override
    public void disconnectFromPowerGrid() {
        if (getBelongsToHouse() == null) {
            System.out.println("You can't unplug something you don't have. Please buy an item\n");
        } else if (getBelongsToHouse() != null && !isConnectedToGrid()) {
            System.out.println("You have already unplugged the appliance\n");
        } else {
            setConnectedToGrid(false);
            getBelongsToHouse().setUsedNetworkLoad(this.powerConsumption * -1);
            System.out.println("You have successfully disconnected the device to the network. Please do not overload the network.\n");
        }
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public int getAttractivenessInInterior() {
        return attractivenessInInterior;
    }
}
