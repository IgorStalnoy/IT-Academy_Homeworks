package FinalProject.Order;

import FinalProject.Cart.Cart;
import FinalProject.Customer.Customer;

public class Order implements Orderable {

    private Cart productList;
    private String status;
    private boolean isPaid;
    private String transactionId = null;
    private String deliveryAddress;
    private Customer customer;

    @Override
    public void createOrder(Cart cart, String status, boolean isPaid, String transactionId, String deliveryAddress) {
        this.productList = productList;
        this.status = status;
        this.isPaid = isPaid;
        this.transactionId = transactionId;
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public Order saveOrder(Order order) {
        return this;
    }

    @Override
    public Order getOrderInfo() {
        return this;
    }
}
