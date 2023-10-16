package FinalProject.Engine;

import FinalProject.Engine.Cart.Cart;
import FinalProject.Engine.Customer.Customer;
import FinalProject.Engine.Product.Product;
import FinalProject.db.Dao.DB;
import FinalProject.db.Dao.MYSQLbase;
import FinalProject.ui.CartPage.CartPage;
import FinalProject.ui.CartPage.CartPageImplementation;
import FinalProject.ui.CheckOutPage.CheckOutPage;
import FinalProject.ui.CheckOutPage.CheckOutPageImplementation;
import FinalProject.ui.LogInPage.LogInPage;
import FinalProject.ui.LogInPage.LogInPageImplementation;
import FinalProject.ui.MainPage.MainPage;
import FinalProject.ui.MainPage.MainPageImplementation;
import FinalProject.ui.OrdersPage.OrdersPage;
import FinalProject.ui.OrdersPage.OrdersPageImplementation;
import FinalProject.ui.PersonalAccountPage.PersonalAccountPage;
import FinalProject.ui.PersonalAccountPage.PersonalAccountPageImplementation;
import FinalProject.ui.RegistrationPage.RegistrationPage;
import FinalProject.ui.RegistrationPage.RegistrationPageImplementation;
import FinalProject.ui.VendorLoginPage.VendorLoginPage;
import FinalProject.ui.VendorLoginPage.VendorLoginPageImplementation;
import FinalProject.ui.VendorManagmentPage.VendorManagementPage;
import FinalProject.ui.VendorManagmentPage.VendorManagementPageImplementation;

import java.util.List;

import static FinalProject.ui.UIConstants.*;

public class IShop {

    private Customer loggedCustomer = null;
    private Cart cart = null;
    private List<Product> productList = null;

    DB db = new MYSQLbase();
    MainPage mainPage = new MainPageImplementation();
    LogInPage logInPage = new LogInPageImplementation();
    RegistrationPage registrationPage = new RegistrationPageImplementation();
    CartPage cartPage = new CartPageImplementation();
    CheckOutPage checkOutPage = new CheckOutPageImplementation();
    PersonalAccountPage personalAccountPage = new PersonalAccountPageImplementation();
    OrdersPage ordersPage = new OrdersPageImplementation();
    VendorLoginPage vendorLoginPage = new VendorLoginPageImplementation();
    VendorManagementPage vendorManagementPage = new VendorManagementPageImplementation();

    public void startProgram() {
        if (!db.connectToDatabase()) {
            db.createDatabase();
        }
        productList = db.getAllProductsList();
        mainPageStart();
    }

    public void mainPageStart() {
        mainPage.start();
        mainPage.showProductList(productList);
        mainPage.showCart(cart);
        mainPage.showLoggedCustomer(loggedCustomer);
        if (loggedCustomer == null) {
            mainPage.showAvailableChoices(GO_TO_LOGIN_PAGE, GO_TO_CART_PAGE, FILTER_BY_CATEGORY, ORDER_BY_ID, ORDER_BY_PRICE, SEARCH_PRODUCT, ADD_PRODUCT_TO_CART);
            switch (mainPage.userChoice()) {
                case GO_TO_LOGIN_PAGE -> logInPageStart();
                case GO_TO_CART_PAGE -> cartPageStart();
                case FILTER_BY_CATEGORY -> {
                    productList = db.filterProductsByCategory(mainPage.userChoice());
                    mainPageStart();
                }
                case ORDER_BY_ID -> {
                    productList = db.orderProductsByID();
                    mainPageStart();
                }
                case ORDER_BY_PRICE -> {
                    productList = db.orderProductsByPrice();
                    mainPageStart();
                }
                case SEARCH_PRODUCT -> {
                    productList = db.searchProducts(mainPage.getCustomerSearchRequest());
                    mainPageStart();
                }
                case ADD_PRODUCT_TO_CART -> {
                    if (this.cart == null) {
                        this.cart = new Cart(null, this.loggedCustomer);
                    }
                    this.cart.addProductToCart(mainPage.addProductToCart());
                    mainPageStart();
                }
            }
        } else {
            mainPage.showAvailableChoices(GO_TO_PERSONAL_ACCOUNT_PAGE, LOG_OUT, GO_TO_CART_PAGE, FILTER_BY_CATEGORY, ORDER_BY_ID, ORDER_BY_PRICE, SEARCH_PRODUCT);
            switch (mainPage.userChoice()) {
                case GO_TO_PERSONAL_ACCOUNT_PAGE -> personalAccountPageStart();
                case LOG_OUT -> {
                    this.loggedCustomer = null;
                    mainPageStart();
                }
                case GO_TO_CART_PAGE -> cartPageStart();
                case FILTER_BY_CATEGORY -> {
                    productList = db.filterProductsByCategory(mainPage.userChoice());
                    mainPageStart();
                }
                case ORDER_BY_ID -> {
                    productList = db.orderProductsByID();
                    mainPageStart();
                }
                case ORDER_BY_PRICE -> {
                    productList = db.orderProductsByPrice();
                    mainPageStart();
                }
                case SEARCH_PRODUCT -> {
                    productList = db.searchProducts(mainPage.getCustomerSearchRequest());
                    mainPageStart();
                }
                case ADD_PRODUCT_TO_CART -> {
                    if (this.cart == null) {
                        this.cart = new Cart(null, this.loggedCustomer);
                    }
                    this.cart.addProductToCart(mainPage.addProductToCart());
                    mainPageStart();
                }
            }
        }
    }

    private void logInPageStart() {
        logInPage.start();
        logInPage.showAvailableChoices(GO_TO_MAIN_PAGE, LOG_IN, GO_TO_CREATE_ACCOUNT_PAGE, GO_TO_VENDOR_LOGIN_PAGE);
        switch (logInPage.userChoice()) {
            case GO_TO_MAIN_PAGE -> mainPageStart();
            case LOG_IN -> {
                String[] credentials = logInPage.getCustomerCredentials();
                if (db.isCredentialsCorrect(credentials)) {
                    this.loggedCustomer = db.getLoggedCustomer(credentials);
                    mainPageStart();
                } else {
                    logInPage.showInvalidCredentialsError();
                    logInPageStart();
                }
            }
            case GO_TO_CREATE_ACCOUNT_PAGE -> customerRegistrationPageStart();
            case GO_TO_VENDOR_LOGIN_PAGE -> vendorLoginPageStart();
        }
    }

    private void customerRegistrationPageStart() {
        registrationPage.RegistrationPageStart();
        registrationPage.showAvailableChoices(GO_TO_MAIN_PAGE, GO_TO_LOGIN_PAGE, CREATE_ACCOUNT);
        switch (registrationPage.userChoice()) {
            case GO_TO_MAIN_PAGE -> mainPageStart();
            case GO_TO_LOGIN_PAGE -> logInPageStart();
            case CREATE_ACCOUNT -> {
                Customer newCustomer = registrationPage.getNewCustomer();
                if (db.isCustomerExist(newCustomer)) {
                    registrationPage.showCustomerAlreadyExistError();
                    customerRegistrationPageStart();
                } else {
                    db.createNewCustomer(newCustomer);
                    logInPageStart();
                }
            }
        }
    }

    private void cartPageStart() {
        cartPage.start();
        cartPage.showCart(this.cart);
        cartPage.showCustomer(this.loggedCustomer);
        if (this.loggedCustomer == null) {
            cartPage.showNeedToLoginAttention();
            cartPage.showAvailableChoices(INCREMENT_PRODUCT_COUNT, DECREMENT_PRODUCT_COUNT, DELETE_PRODUCT_FROM_CART, GO_TO_LOGIN_PAGE, GO_TO_MAIN_PAGE, CLEAR_ALL_FROM_CART);
            switch (cartPage.userChoice()) {
                case INCREMENT_PRODUCT_COUNT -> {
                    this.cart.incrementProductCount(cartPage.incrementProductCount());
                    cartPageStart();
                }
                case DECREMENT_PRODUCT_COUNT -> {
                    this.cart.decrementProductCount(cartPage.decrementProductCount());
                    cartPageStart();
                }
                case DELETE_PRODUCT_FROM_CART -> {
                    this.cart.deleteProduct(cartPage.deleteProduct());
                    cartPageStart();
                }
                case GO_TO_LOGIN_PAGE -> logInPageStart();
                case GO_TO_MAIN_PAGE -> mainPageStart();
                case CLEAR_ALL_FROM_CART -> {
                    if (this.cart == null) {
                        cartPage.showEmptyCartError();
                        cartPageStart();
                    } else {
                        this.cart = null;
                        cartPageStart();
                    }
                }
            }
        } else {
            cartPage.showAvailableChoices(INCREMENT_PRODUCT_COUNT, DECREMENT_PRODUCT_COUNT, DELETE_PRODUCT_FROM_CART,
                    GO_TO_MAIN_PAGE, CLEAR_ALL_FROM_CART, GO_TO_PERSONAL_ACCOUNT_PAGE, LOG_OUT, GO_TO_CHECKOUT_PAGE);
            switch (cartPage.userChoice()) {
                case INCREMENT_PRODUCT_COUNT -> {
                    this.cart.incrementProductCount(cartPage.incrementProductCount());
                    cartPageStart();
                }
                case DECREMENT_PRODUCT_COUNT -> {
                    this.cart.decrementProductCount(cartPage.decrementProductCount());
                    cartPageStart();
                }
                case DELETE_PRODUCT_FROM_CART -> {
                    this.cart.deleteProduct(cartPage.deleteProduct());
                    cartPageStart();
                }
                case GO_TO_MAIN_PAGE -> mainPageStart();
                case CLEAR_ALL_FROM_CART -> {
                    if (this.cart == null) {
                        cartPage.showEmptyCartError();
                        cartPageStart();
                    } else {
                        this.cart = null;
                        cartPageStart();
                    }
                }
                case GO_TO_PERSONAL_ACCOUNT_PAGE -> personalAccountPageStart();
                case LOG_OUT -> {
                    this.loggedCustomer = null;
                    cartPageStart();
                }
                case GO_TO_CHECKOUT_PAGE -> checkOutPageStart();
            }
        }
    }

    private void checkOutPageStart() {
        checkOutPage.start();
        checkOutPage.showCustomer(this.loggedCustomer);
        checkOutPage.showCart(this.cart);
        checkOutPage.showAvailableChoices(GO_TO_MAIN_PAGE, GO_TO_CART_PAGE, GO_TO_PERSONAL_ACCOUNT_PAGE, CREATE_ORDER, LOG_OUT);
        switch (checkOutPage.userChoice()) {
            case GO_TO_MAIN_PAGE -> mainPageStart();
            case GO_TO_CART_PAGE -> cartPageStart();
            case GO_TO_PERSONAL_ACCOUNT_PAGE -> personalAccountPageStart();
            case CREATE_ORDER -> {
                db.createNewOrder(checkOutPage.newOrder());
                personalAccountPageStart();
            }
            case LOG_OUT -> {
                this.loggedCustomer = null;
                mainPageStart();
            }
        }
    }

    private void personalAccountPageStart() {
        personalAccountPage.start();
        personalAccountPage.showCustomer(this.loggedCustomer);
        personalAccountPage.showAvailableChoices(GO_TO_MAIN_PAGE, GO_TO_CART_PAGE, LOG_OUT, EDIT_CUSTOMER, DELETE_ACCOUNT, GO_TO_ORDERS_PAGE);
        switch (personalAccountPage.usersChoice()) {
            case GO_TO_MAIN_PAGE -> mainPageStart();
            case GO_TO_CART_PAGE -> cartPageStart();
            case LOG_OUT -> {
                this.loggedCustomer = null;
                mainPageStart();
            }
            case EDIT_CUSTOMER -> {
                Customer updatedCustomer = personalAccountPage.editCustomer();
                db.updateCustomer(updatedCustomer);
                this.loggedCustomer = db.getLoggedCustomer(new String[]{updatedCustomer.getUsername(), updatedCustomer.getPassword()});
                personalAccountPageStart();
            }
            case DELETE_ACCOUNT -> {
                personalAccountPage.deleteAccount();
                db.deleteCustomer(this.loggedCustomer);
                this.loggedCustomer = null;
                mainPageStart();
            }
            case GO_TO_ORDERS_PAGE -> ordersPageStart();
        }
    }

    private void ordersPageStart() {
        ordersPage.start();
        ordersPage.showCustomer(this.loggedCustomer);
        ordersPage.showOrders(db.getOrdersList(this.loggedCustomer));
        ordersPage.showAvailableChoices(GO_TO_MAIN_PAGE, GO_TO_CART_PAGE, GO_TO_PERSONAL_ACCOUNT_PAGE, LOG_OUT);
        switch (ordersPage.userChoice()) {
            case GO_TO_MAIN_PAGE -> mainPageStart();
            case GO_TO_CART_PAGE -> cartPageStart();
            case GO_TO_PERSONAL_ACCOUNT_PAGE -> personalAccountPageStart();
            case LOG_OUT -> {
                this.loggedCustomer = null;
                mainPageStart();
            }
        }
    }

    private void vendorLoginPageStart() {
        vendorLoginPage.start();
        vendorLoginPage.showAvailableChoices(LOG_IN, GO_TO_MAIN_PAGE);
        switch (vendorLoginPage.userChoice()) {
            case GO_TO_MAIN_PAGE -> mainPageStart();
            case LOG_IN -> {
                String[] credentials = vendorLoginPage.getVendorCredentials();
                if (db.isVendorCredentialsCorrect(credentials)) {
                    vendorManagementPageStart();
                } else {
                    vendorLoginPage.showInvalidCredentialsError();
                    vendorLoginPageStart();
                }
            }
        }
    }

    private void vendorManagementPageStart() {
        vendorManagementPage.start();
        vendorManagementPage.showAvailableChoices(LOG_OUT,GET_ALL_PRODUCTS_LIST,ADD_PRODUCTS,REPLACE_ALL_PRODUCTS);
        switch (vendorManagementPage.userChoice()) {
            case LOG_OUT -> mainPageStart();
            case GET_ALL_PRODUCTS_LIST -> {
                vendorManagementPage.getAllProductsList(db.getAllProductsList());
                vendorManagementPageStart();
            }
            case ADD_PRODUCTS -> {
                db.addProducts(vendorManagementPage.addProducts());
                vendorManagementPageStart();
            }
            case REPLACE_ALL_PRODUCTS -> {
                db.replaceAllProducts(vendorManagementPage.replaceAllProducts());
                vendorManagementPageStart();
            }
        }
    }

}

