package FinalProject.ui.PersonalAccountPage;

import FinalProject.Engine.Customer.Customer;

public interface PersonalAccountPage {
    void start();
    int usersChoice();
    void showCustomer(Customer customer);
    void showAvailableChoices(int... constants);
    Customer editCustomer();
    Customer deleteAccount();
}
