package FinalProject.ui.VendorManagmentPage;

import FinalProject.Engine.Product.Product;

import java.util.List;

public interface VendorManagementPage {
    void start();
    void showAvailableChoices(int... constants);
    int userChoice();
    void getAllProductsList(List<Product> productList);
    List<Product> addProducts();
    List<Product> replaceAllProducts();

}
