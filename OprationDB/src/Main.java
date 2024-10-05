import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    static final String JDBC_URL = "jdbc:postgresql://localhost:5432/emp";

    public static void main(String[] args) {
        try(Connection con = DriverManager.getConnection(JDBC_URL, "postgres", "rahul@123")){

            DBOprations EMP = new DBOprations();
//            EMP.CreateDB(con);
//            EMP.CreateTable(con);
//
//            EMP.InsertData(con, 2, "Rugved Bhavasar", 300000000);
//            EMP.InsertData(con, 7, "Rahul Sonawane", 300000000);
//            EMP.InsertData(con, 3, "Bhakti Purnale", 300000000);
//            EMP.InsertData(con, 4, "Shantanu Niphal", 300000000);
//            EMP.InsertData(con, 5, "Suraj Mate", 300000000);
//            EMP.InsertData(con, 6, "Shubh Sawai", 300000000);

            EMP.ReadData(con);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}