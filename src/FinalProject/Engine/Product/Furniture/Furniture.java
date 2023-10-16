package FinalProject.Engine.Product.Furniture;

import FinalProject.Engine.Product.Product;

public class Furniture extends Product {
    private final String material;
    private final String color;
    private final String type;

    public Furniture(int id, int categoryId, int price, int count, String material, String color, String type) {
        super(id, categoryId, price, count);
        this.material = material;
        this.color = color;
        this.type = type;
    }
}
