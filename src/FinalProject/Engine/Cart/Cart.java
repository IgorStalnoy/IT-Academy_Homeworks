package FinalProject.Engine.Cart;

import FinalProject.Engine.Customer.Customer;
import FinalProject.Engine.Product.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart{
    private List<Product> list;
    private Customer customer;
    private int totalCost;

    public Cart(List<Product> list, Customer customer) {
        this.list = list;
        this.customer = customer;
    }

    public void addProductToCart(Product product) {
        if(list == null) {
            list = new ArrayList<>();
        }
        list.add(product);
    }

    public void incrementProductCount(Product product){
    }

    public void decrementProductCount(Product product){
    }

    public void deleteProduct(Product product){
    }
}
