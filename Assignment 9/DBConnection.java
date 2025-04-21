import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// This class is responsible for establishing a connection to the MySQL database.
public class DBConnection {

    // Database URL, username, and password.
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root";
    private static final String PASSWORD = "sit123";

    // Method to establish and return a database connection.
    public static Connection getConnection() throws SQLException {
        try {
            // Load the MySQL JDBC driver class.
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully!");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver loading failed: " + e.getMessage());
        }

        // Return the connection using JDBC.
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
