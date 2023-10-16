package FinalProject.Engine.Order;

import FinalProject.Engine.Cart.Cart;
import FinalProject.Engine.Customer.Customer;

public class Order{

    private Cart productList;
    private String status;
    private boolean isPaid;
    private String transactionId = null;
    private String deliveryAddress;
    private Customer customer;

    public void createOrder(Cart cart, String status, boolean isPaid, String transactionId, String deliveryAddress) {
        this.productList = productList;
        this.status = status;
        this.isPaid = isPaid;
        this.transactionId = transactionId;
        this.deliveryAddress = deliveryAddress;
    }

}
