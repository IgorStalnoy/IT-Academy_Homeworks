package Homework_7.Task7_1.HomeAppliances;

import Homework_7.Task7_1.Home;

public abstract class HomeAppliance {
    private final String type;
    private final int price;
    private final String model;
    private final double weight;
    private boolean isConnectedToGrid = false;
    private Home belongsToHouse;

    HomeAppliance(String model, double weight, int price, String type) {
        this.type = type;
        this.price = price;
        this.model = model;
        this.weight = weight;
    }

    public abstract void connectToPowerGrid();

    public abstract void disconnectFromPowerGrid();


    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public boolean isConnectedToGrid() {
        return isConnectedToGrid;
    }
    public void setConnectedToGrid(boolean connectedToGrid) {
        isConnectedToGrid = connectedToGrid;
    }

    public void setBelongsToHouse(Home belongsToHouse) {
        this.belongsToHouse = belongsToHouse;
    }

    public Home getBelongsToHouse() {
        return belongsToHouse;
    }
}
