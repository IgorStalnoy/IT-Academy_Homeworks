package FinalProject.ui.VendorLoginPage;

public interface VendorLoginPage {
    void start();
    int userChoice();
    void showAvailableChoices(int... constants);
    String[] getVendorCredentials();
    void showInvalidCredentialsError();
}
