import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Get connection from DatabaseConnection utility
            Connection conn = DatabaseConnection.getConnection();
            
            if (conn != null) {
                System.out.println("Database connection established successfully!");
                
                // Create SQL query to fetch all employees
                String query = "SELECT * FROM Employee";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                
                // Display employee data
                System.out.println("\n========== EMPLOYEE RECORDS ==========");
                System.out.println("ID\tNAME\t\tDEPARTMENT\tSALARY");
                System.out.println("=====================================");
                
                while (rs.next()) {
                    int id = rs.getInt("emp_id");
                    String name = rs.getString("emp_name");
                    String department = rs.getString("emp_department");
                    double salary = rs.getDouble("emp_salary");
                    
                    System.out.printf("%d\t%-15s\t%-12s\t%.2f%n", id, name, department, salary);
                }
                System.out.println("=====================================");
                
                // Close resources
                rs.close();
                stmt.close();
                conn.close();
                
                System.out.println("\nConnection closed successfully!");
            } else {
                System.out.println("Failed to establish database connection!");
            }
        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
