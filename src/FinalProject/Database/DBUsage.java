package FinalProject.Database;

import FinalProject.Cart.Cart;
import FinalProject.Customer.Customer;
import FinalProject.Order.Order;
import FinalProject.Product.Product;

import java.util.List;

public interface DBUsage {

    List<Product> getAllProductsList();

    List<Product> getAllByCategory(int categoryId);

    List<Product> search(String text);

    List<Product> orderByCategory(int categoryId);

    List<Product> orderByPrice(int categoryId);

    void saveOrder(Order order);

    void customerRegistration(Customer customer);

    boolean publisherLogIn(String username, String password);

    //    void addProductsToStock(CSV CSVfile);
    Product addToCart(Cart cart);

    Order getOrderInfo(Customer customer);


}
