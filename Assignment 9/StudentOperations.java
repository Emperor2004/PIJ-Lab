import java.sql.*;
import java.util.*;

// This class contains all CRUD operations related to students.
public class StudentOperations {

    // Constructor automatically creates table if it doesn't exist.
    public StudentOperations() {
        createTableIfNotExists();
    }

    // Creates 'students' table if it does not already exist.
    private void createTableIfNotExists() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS students ("
                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "name VARCHAR(50) NOT NULL, "
                + "prn INT NOT NULL, "
                + "batch VARCHAR(20), "
                + "UNIQUE KEY unique_prn (prn))";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute(createTableSQL);
        } catch (SQLException e) {
            System.out.println("Error creating table: " + e.getMessage());
        }
    }

    // Adds a new student to the database.
    public void addStudent(Student student) {
        String insertSQL = "INSERT INTO students (name, prn, batch) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

            pstmt.setString(1, student.getName());
            pstmt.setInt(2, student.getPrn());
            pstmt.setString(3, student.getBatch());
            pstmt.executeUpdate();

            System.out.println("Student added successfully.");
        } catch (SQLException e) {
            System.out.println("Error adding student: " + e.getMessage());
        }
    }

    // Displays all students in the database.
    public void displayAllStudents() {
        String selectSQL = "SELECT name, prn, batch FROM students";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(selectSQL);
             ResultSet rs = pstmt.executeQuery()) {

            boolean isEmpty = true;
            while (rs.next()) {
                isEmpty = false;
                String name = rs.getString("name");
                int prn = rs.getInt("prn");
                String batch = rs.getString("batch");
                System.out.println("Name: " + name + ", PRN: " + prn + ", Batch: " + batch);
            }
            if (isEmpty) {
                System.out.println("No students found in the database.");
            }

        } catch (SQLException e) {
            System.out.println("Error displaying students: " + e.getMessage());
        }
    }

    // Searches for a student by PRN.
    public void searchStudent(int prn) {
        String selectSQL = "SELECT name, prn, batch FROM students WHERE prn = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(selectSQL)) {

            pstmt.setInt(1, prn);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Name: " + rs.getString("name")
                            + ", PRN: " + rs.getInt("prn")
                            + ", Batch: " + rs.getString("batch"));
                } else {
                    System.out.println("No student found with PRN: " + prn);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error searching student: " + e.getMessage());
        }
    }

    // Updates a student's name and batch using their PRN.
    public void updateStudent(int prn, String newName, String newBatch) {
        String updateSQL = "UPDATE students SET name = ?, batch = ? WHERE prn = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {

            pstmt.setString(1, newName);
            pstmt.setString(2, newBatch);
            pstmt.setInt(3, prn);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Student updated successfully.");
            } else {
                System.out.println("No student found with PRN: " + prn);
            }
        } catch (SQLException e) {
            System.out.println("Error updating student: " + e.getMessage());
        }
    }

    // Deletes a student from the database using their PRN.
    public void deleteStudent(int prn) {
        String deleteSQL = "DELETE FROM students WHERE prn = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {

            pstmt.setInt(1, prn);
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Student deleted successfully.");
            } else {
                System.out.println("No student found with PRN: " + prn);
            }
        } catch (SQLException e) {
            System.out.println("Error deleting student: " + e.getMessage());
        }
    }
}
