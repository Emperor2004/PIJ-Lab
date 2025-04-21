import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
     
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root";
    private static final String PASSWORD = "sit123";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully!");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver loading failed: " + e.getMessage());
        }
        
    
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
