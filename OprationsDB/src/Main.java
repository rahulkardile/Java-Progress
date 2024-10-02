import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    Connection con;
    Statement st;

    public void connectDB(){
        try {

            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" , "postgres", "rahul@123");
            System.out.println("Database is connected . . . ");

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void createDB(){
        connectDB();
        try{

            String sql = "CREATE DATABASE cricket";
            st = con.createStatement();
            st.executeUpdate(sql);

            System.out.println("Database created successfully!");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void createTable(){
        connectDB();
        String sql = "create table player(pNo varchar(10) not null primary key, " + "pName varchar(30), pRank varchar(10)";

        try{
            st = con.createStatement();
            st.executeUpdate(sql);

            System.out.println("Table created . . .");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void insetData(int no, String name, int rank){

        connectDB();
        String sql = "insert into player values(?,?,?,?)";

        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, no);
            ps.setString(2, name);
            ps.setInt(1, no);

            ps.executeUpdate();
            System.out.println("Data inserted successfully!");

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void readData(int pNo){
        connectDB();
        String sql = "select * from player where pNo = " + pNo;

        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                System.out.println("PlayerNo : " + rs.getInt(1) + "\t Name : " + rs.getString(2) + "\t PlayerRank : " + rs.getInt(3));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void readData(){
        connectDB();
        String sql = "Select * from player";

        try {

            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()){
                System.out.println("No : " + rs.getInt(1) + "\t Name : " + rs.getString(2) + "\t Rank : " + rs.getInt(3));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void UpdateData(int pNo, String name, int rank){
        connectDB();
        String sql = "update player set pName = ?, pRank = ?, where pNo = ?";

        try{
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setInt(2, rank);
            ps.setInt(3, pNo);

            int res = ps.executeUpdate();

            while (res == 1){
                System.out.println("Updated!");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteData(int num){
        connectDB();
        String sql = "delete from player where pNo = " + num;

        try{
            st = con.createStatement();
            st.executeUpdate(sql);
            System.out.println("Deleted!");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
//        main.createDB();

        main.createTable();
        main.insetData(1, "Rahul Kardile", 1);
        main.readData();
    }
}