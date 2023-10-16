package FinalProject.Customer;

public class Customer implements Customerable {

    private String username;
    private String password;
    private String email;
    private boolean isLoggedIn;

    @Override
    public boolean logIn(String username, String password) {
        return false;
    }

    @Override
    public void signUp(String username, String password, String email) {

    }
}
