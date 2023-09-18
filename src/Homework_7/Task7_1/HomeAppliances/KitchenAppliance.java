package Homework_7.Task7_1.HomeAppliances;

public class KitchenAppliance extends HomeAppliance {
    private final int powerConsumption;
    private final boolean isUsedForCookingFood;

    public KitchenAppliance(String type, int price, String model, int powerConsumption, double weight, boolean isUsedForCookingFood) {
        super(model, weight, price, type);
        this.powerConsumption = powerConsumption;
        this.isUsedForCookingFood = isUsedForCookingFood;
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
                this.setConnectedToGrid(true);
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
            this.setConnectedToGrid(false);
            getBelongsToHouse().setUsedNetworkLoad(this.powerConsumption * -1);
            System.out.println("You have successfully disconnected the device to the network. Please do not overload the network.\n");
        }
    }

    public boolean isUsedForCookingFood() {
        return isUsedForCookingFood;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }
}
