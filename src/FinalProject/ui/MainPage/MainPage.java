package FinalProject.ui.MainPage;

import FinalProject.Engine.Cart.Cart;
import FinalProject.Engine.Customer.Customer;
import FinalProject.Engine.Product.Product;

import java.util.List;

public interface MainPage {

    void start();

    void showProductList(List<Product> productList);

    void showCart(Cart cart);

    void showLoggedCustomer(Customer customer);

    void showAvailableChoices(int... constants);
    String getCustomerSearchRequest();
    Product addProductToCart();

    int userChoice();

}
