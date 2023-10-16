package FinalProject.ui.OrdersPage;

import FinalProject.Engine.Customer.Customer;
import FinalProject.Engine.Order.Order;

import java.util.List;

public interface OrdersPage {
    void start();

    void showOrders(List<Order> ordersList);

    int userChoice();

    void showCustomer(Customer customer);

    void showAvailableChoices(int... constants);
}
