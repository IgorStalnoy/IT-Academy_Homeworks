package FinalProject.Engine.Product.Computer;

import FinalProject.Engine.Product.Product;

public class Computer extends Product {
    private final String brand;
    private final String type;
    private final int processorSpeed;
    private final int ramSize;
    private final int hddSize;

    public Computer(int id, int categoryId, int price, int count, String brand, String type, int processorSpeed, int ramSize, int hddSize) {
        super(id, categoryId, price, count);
        this.brand = brand;
        this.type = type;
        this.processorSpeed = processorSpeed;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
    }
}
