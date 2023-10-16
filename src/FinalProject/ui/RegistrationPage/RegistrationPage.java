package FinalProject.ui.RegistrationPage;

import FinalProject.Engine.Customer.Customer;

public interface RegistrationPage {
    void RegistrationPageStart();
    void showAvailableChoices(int... constants);
    int userChoice();
    Customer getNewCustomer();
    void showCustomerAlreadyExistError();
}
