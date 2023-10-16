package FinalProject.ui.CartPage;

import FinalProject.Engine.Cart.Cart;
import FinalProject.Engine.Customer.Customer;
import FinalProject.Engine.Product.Product;

public interface CartPage {
    void start();
    void showCart(Cart cart);
    void showAvailableChoices(int... constants);
    int userChoice();
    Product incrementProductCount();
    Product decrementProductCount();
    Product deleteProduct();
    void showEmptyCartError();
    void showNeedToLoginAttention();
    void showCustomer(Customer customer);
}
