package FinalProject.Engine.Product.HouseHoldChemicals;

import FinalProject.Engine.Product.Product;

public class HouseholdChemicals extends Product {
    private final String brand;
    private final String appointment;
    private final boolean isDangerousForChildren;

    public HouseholdChemicals(int id, int categoryId, int price, int count, String brand, String appointment, boolean isDangerousForChildren) {
        super(id, categoryId, price, count);
        this.brand = brand;
        this.appointment = appointment;
        this.isDangerousForChildren = isDangerousForChildren;
    }
}
