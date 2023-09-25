package FinalProject.Database;

import FinalProject.Cart.Cart;
import FinalProject.Customer.Customer;
import FinalProject.Order.Order;
import FinalProject.Product.Product;

import java.util.List;

public class MYSQLbase implements DBUsage {

    @Override
    public List<Product> getAllProductsList() {
        return null;
    }

    @Override
    public List<Product> getAllByCategory(int categoryId) {
        return null;
    }

    @Override
    public List<Product> search(String text) {
        return null;
    }

    @Override
    public List<Product> orderByCategory(int categoryId) {
        return null;
    }

    @Override
    public List<Product> orderByPrice(int categoryId) {
        return null;
    }

    @Override
    public void saveOrder(Order order) {

    }

    @Override
    public void customerRegistration(Customer customer) {

    }

    @Override
    public boolean publisherLogIn(String username, String password) {
        return false;
    }

    @Override
    public Product addToCart(Cart cart) {
        return null;
    }

    @Override
    public Order getOrderInfo(Customer customer) {
        return null;
    }
}
