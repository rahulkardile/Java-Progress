import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CreateDB {

    static String url = "jdbc:postgresql://aws-0-ap-south-1.pooler.supabase.com:6543/postgres";
    static String user = "postgres.luhdtwrqsacsvgozhpgd"; // Your specific user
    static String password = "pj48-nPap_X@MG$";

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            // Create the employees table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS employees (" +
                    "id SERIAL PRIMARY KEY, " +
                    "name VARCHAR(100) NOT NULL, " +
                    "email VARCHAR(100) UNIQUE NOT NULL, " +
                    "salary DECIMAL(10, 2) NOT NULL);";
            statement.executeUpdate(createTableSQL);
            System.out.println("Table 'employees' created successfully.");

            // Insert employee data
            String insertDataSQL = "INSERT INTO employees (name, email, salary) VALUES " +
                    "('Alice Smith', 'alice@example.com', 75000.00), " +
                    "('Bob Johnson', 'bob@example.com', 60000.00), " +
                    "('Charlie Brown', 'charlie@example.com', 80000.00);";

            statement.executeUpdate(insertDataSQL);

            System.out.println("Employee data inserted successfully.");

        } catch (SQLException e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }
}
