package FinalProject.ui.CartPage;

import FinalProject.Engine.Cart.Cart;
import FinalProject.Engine.Customer.Customer;
import FinalProject.Engine.Product.Product;

public class CartPageImplementation implements CartPage{
    @Override
    public void start() {
    }

    @Override
    public void showCart(Cart cart) {

    }

    @Override
    public void showAvailableChoices(int... constants) {

    }

    @Override
    public int userChoice() {
        return 0;
    }

    @Override
    public Product incrementProductCount() {
        return null;
    }

    @Override
    public Product decrementProductCount() {
        return null;
    }

    @Override
    public Product deleteProduct() {
        return null;
    }

    @Override
    public void showEmptyCartError() {

    }

    @Override
    public void showNeedToLoginAttention() {
    }

    @Override
    public void showCustomer(Customer customer) {

    }
}
