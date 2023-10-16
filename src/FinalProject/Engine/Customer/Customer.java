package FinalProject.Engine.Customer;

public class Customer {

    private int id;
    private String username;
    private String password;
    private String email;
    private boolean isLoggedIn;

    public Customer(int id, String username, String password, String email, boolean isLoggedIn) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.isLoggedIn = isLoggedIn;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
