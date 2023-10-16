package FinalProject.Order;

import FinalProject.Cart.Cart;

public interface Orderable {

    Order saveOrder(Order order);

    void createOrder(Cart cart, String status, boolean isPaid, String transactionId, String deliveryAddress);

    Order getOrderInfo();

}
