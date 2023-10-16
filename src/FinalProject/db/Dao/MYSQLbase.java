package FinalProject.db.Dao;

import FinalProject.Engine.Customer.Customer;
import FinalProject.Engine.Order.Order;
import FinalProject.Engine.Product.Product;

import java.sql.*;
import java.util.List;

public class MYSQLbase implements DB {

    private final String DRIVER_PATH = "org.sqlite.JDBC";
    private final String DBNAME = "IShopDB.db";
    private final String DBPATH = "jdbc:sqlite:E:\\Java Projects\\IT-Academy_Homeworks\\src\\FinalProject\\" + DBNAME;
    private Connection connection;
    Statement statement;

    @Override
    public boolean connectToDatabase() {
        try {
            Class.forName(DRIVER_PATH);
            this.connection = DriverManager.getConnection(DBPATH);
            this.statement = connection.createStatement();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public void createDatabase() {
        try {
            this.connection = DriverManager.getConnection(DBPATH);
            this.statement = connection.createStatement();
            statement.execute("CREATE TABLE CUSTOMERS (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, password TEXT UNIQUE, email TEXT UNIQUE)");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String createNewCustomer(Customer customer) {
        if (isCustomerExist(customer)) {
            try {
                statement.execute("INSERT INTO CUSTOMERS (name, password, email) VALUES ('" + customer.getUsername().concat("','")
                        + customer.getPassword().concat("','") + customer.getEmail().concat("')"));
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return "Customer successfully registered";
        } else {
            return "This username or Email already exist";
        }

    }

    @Override
    public boolean isCustomerExist(Customer customer) {
        try {
            ResultSet resultSet = statement.executeQuery("select name, email from customers ");
            String newCustomersName = customer.getUsername();
            String newCustomersEmail = customer.getEmail();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                if (newCustomersName.equals(name) || newCustomersEmail.equals(email)) {
                    return false;
                }
            }
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


//    @Override
//    public void selectCustomers() {
//        try {
//            ResultSet resultSet = statement.executeQuery("select * from customers ");
//            System.out.printf("%-20s%20s%20s%20s%n", "id", "name", "password", "email");
//            System.out.println("-------------------------------");
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                String password = resultSet.getString("password");
//                String email = resultSet.getString("email");
//                System.out.printf("%-20s%20s%20s%20s%n", id, name, password, email);
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }

    @Override
    public boolean isCredentialsCorrect(String[] array) {
        try {
            ResultSet resultSet = statement.executeQuery("select name, password from customers ");
            while (resultSet.next()) {
                String userName = resultSet.getString("name");
                String password = resultSet.getString("password");
                if (array[0].equals(userName) && array[1].equals(password)) {
                    return true;
                }
            }
            return false;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Customer getLoggedCustomer(String[] array) {
        try {
            Customer customer = null;
            ResultSet resultSet = statement.executeQuery("select * from customers ");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String userName = resultSet.getString("name");
                String password = resultSet.getString("password");
                String email = resultSet.getString("email");
                if (array[0].equals(userName) && array[1].equals(password)) {
                    customer = new Customer(id, userName, password, email, true);
                }
            }
            return customer;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Product> getAllProductsList() {
        return null;
    }


    public Order getOrderInfo(Customer customer) {
        return null;
    }

    @Override
    public List<Product> filterProductsByCategory(int categoryID) {
        return null;
    }

    @Override
    public List<Product> orderProductsByID() {
        return null;
    }

    @Override
    public List<Product> orderProductsByPrice() {
        return null;
    }

    @Override
    public List<Product> searchProducts(String searchRequest) {
        return null;
    }

    @Override
    public void createNewOrder(Order newOrder) {

    }

    @Override
    public void updateCustomer(Customer customer) {

    }

    @Override
    public void deleteCustomer(Customer customer) {

    }

    @Override
    public Customer getCustomer() {
        return null;
    }

    @Override
    public List<Order> getOrdersList(Customer customer) {
        return null;
    }

    @Override
    public boolean isVendorCredentialsCorrect(String[] credentials) {
        return false;
    }

    @Override
    public void addProducts(List<Product> productList) {

    }

    @Override
    public void replaceAllProducts(List<Product> productList) {

    }
}
