package FinalProject.Cart;

import FinalProject.Customer.Customer;
import FinalProject.Product.Product;

import java.util.List;

public class Cart implements Cartable {
    private List<Product> list;
    private Customer customer;

    @Override
    public void addProduct(Product product) {
        list.add(product);
    }

    @Override
    public void deleteProduct(Product product) {
        list.remove(product);
    }
}
