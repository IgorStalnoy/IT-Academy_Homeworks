package FinalProject.ui.CheckOutPage;

import FinalProject.Engine.Cart.Cart;
import FinalProject.Engine.Customer.Customer;
import FinalProject.Engine.Order.Order;

public interface CheckOutPage {
    void start();
    void showAvailableChoices(int... constants);
    int userChoice();
    void showCustomer(Customer customer);
    void showCart(Cart cart);
    Order newOrder();
}
