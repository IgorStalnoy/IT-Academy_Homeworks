package FinalProject.ui.LogInPage;

public interface LogInPage {

    void start();

    int userChoice();
    void showAvailableChoices(int... constants);
    String[] getCustomerCredentials();
    void showInvalidCredentialsError();
}
