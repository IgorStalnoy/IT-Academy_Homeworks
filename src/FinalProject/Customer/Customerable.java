package FinalProject.Customer;

public interface Customerable {

    boolean logIn(String username, String password);

    void signUp(String username, String password, String email);

}
