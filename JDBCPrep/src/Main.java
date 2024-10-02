import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    Connection connection;
    Statement statement;

    public void connectDB(){
        String url = "jdbc:postgresql://localhost:5432/";
        String username = "postgres";
        String password = "rahul@123";

        try {

            // Load The Driver
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database is connected");

        }catch (Exception e){
            e.printStackTrace();
        }


    }

    public void createDB(){

        try{

            connectDB();

            // Create a statement
            statement = connection.createStatement();

            // 3 execute a simple query
            String query = "CREATE DATABASE Employee";
           statement.executeUpdate(query);

            System.out.println("DATABASE IS CREATED");
            connection.close();
            
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Main db = new Main();
        db.createDB();
    }
}