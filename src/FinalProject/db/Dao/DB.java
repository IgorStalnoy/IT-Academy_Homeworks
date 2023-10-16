package FinalProject.db.Dao;

import FinalProject.Engine.Customer.Customer;
import FinalProject.Engine.Order.Order;
import FinalProject.Engine.Product.Product;

import java.util.List;

public interface DB {

    boolean connectToDatabase();

    void createDatabase();

    boolean isCustomerExist(Customer customer);

    String createNewCustomer(Customer customer);

    boolean isCredentialsCorrect(String[] array);

    Customer getLoggedCustomer(String[] array);

    List<Product> filterProductsByCategory(int categoryID);

    List<Product> orderProductsByID();

    List<Product> orderProductsByPrice();

    List<Product> searchProducts(String searchRequest);

    List<Product> getAllProductsList();

    void createNewOrder(Order newOrder);

    void updateCustomer(Customer customer);

    void deleteCustomer(Customer customer);

    Customer getCustomer();

    List<Order> getOrdersList(Customer customer);
    boolean isVendorCredentialsCorrect(String[] credentials);
    void addProducts(List<Product> productList);
    void replaceAllProducts(List<Product> productList);


}
