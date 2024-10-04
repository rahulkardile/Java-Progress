import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBOprations {
    public void CreateDB(Connection con){
        String query = "create database EMP";
        try{
            Statement st = con.createStatement();
            st.executeUpdate(query);

            System.out.println("Database is created");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void CreateTable(Connection con){
        String query = "create table employees(id varchar(10) not null primary key, name varchar(30), salery varchar(20))";
        try{
            Statement st = con.createStatement();
            st.executeUpdate(query);
            System.out.println("Database table is created");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void InsertData(Connection con, int id, String name, double salery){
        String query = "insert into employees values(?, ?, ?)";
        try{

            PreparedStatement st = con.prepareStatement(query);

            st.setInt(1, id);
            st.setString(2, name);
            st.setDouble(3, salery);

            st.executeUpdate();
            System.out.println("Data has been inseted");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void ReadData(Connection con){
        String query = "select * from employees";
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()){
                System.out.println("ID : " + rs.getInt(1) + "\t Name : " + rs.getString(2) + "\t Salery : " + rs.getInt(3));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
