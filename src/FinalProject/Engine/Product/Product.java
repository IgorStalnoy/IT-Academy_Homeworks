package FinalProject.Engine.Product;

public abstract class Product {

    private final int id;
    private final int categoryId;
    private final int price;
    private final int count;

    public Product(int id, int categoryId, int price, int count) {
        this.id = id;
        this.categoryId = categoryId;
        this.price = price;
        this.count = count;
    }

}
