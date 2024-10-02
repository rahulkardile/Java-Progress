import java.sql.*;
import java.util.Random;

public class Main {

    Connection con;
    Statement statement;

    public void connectDB(){
        try{

            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/planets", "postgres", "rahul@123");
            System.out.println("Database is connected!");

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void createDB(){
        connectDB();
        String query = "CREATE DATABASE Planets";

        try{

            statement = con.createStatement();
            statement.executeUpdate(query);

            System.out.println("Database is created . . . ");

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public  void createTable(){
        connectDB();
        String sql = "create table aliens(aId varchar(10) not null primary key, " + "aName varchar(30), aAge varchar(10), aColor varchar(20), aPlanet varchar(20))";

        try{

            statement = con.createStatement();
            statement.executeUpdate(sql);

            System.out.println("Table is created!");

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void insertData(int aId, String aName, int aAge, String aColor, String aPlanet){
        connectDB();
        String query = "insert into aliens values(?, ?, ?, ?, ?)";

        try{

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, aId);
            ps.setString(2, aName);
            ps.setInt(3, aAge);
            ps.setString(4, aColor);
            ps.setString(5, aPlanet);

            ps.executeUpdate();
            System.out.println("Data inserted . . . ");

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void GetAllData(){
        connectDB();
        String query = "select * from aliens";

        try {
            statement = con.createStatement();

           ResultSet rs = statement.executeQuery(query);
           while (rs.next()){
               System.out.println("Alien Id : " + rs.getInt(1) + "\t Alien Name : " + rs.getString(2) + "\t Alien Age : " + rs.getInt(3) + "\t Alien Color : " + rs.getString(4) + "\t Alien Planet : " + rs.getString(5));
           }

            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Main mainObj = new Main();
         Random random = new Random();
//         mainObj.createDB();
//        mainObj.createTable();
//        mainObj.insertData(1, "Rahul Kardile", 21, "Brown", "Earth");

//        for(int i = 2; i< 500; i++){
//             mainObj.insertData(i, mainObj.GenerateAliens(random), random.nextInt(100), mainObj.RandomSkin(random), mainObj.RandomPlanet(random));
//        }

        mainObj.GetAllData();

    }

   public String GenerateAliens(Random random){

       String[] firstNames = {
               "Aarav", "Vivaan", "Aditya", "Ishaan", "Rohan", "Anaya", "Diya", "Saanvi", "Aanya", "Krisha",
               "Aryan", "Kavya", "Riya", "Nisha", "Tara", "Aditi", "Rakesh", "Meera", "Parth", "Madhav",
               "Rahul", "Shreya", "Anika", "Akash", "Pranav", "Manish", "Harsh", "Varun", "Naveen", "Ravi"
       };

       String[] surnames = {
               "Sharma", "Verma", "Patel", "Mehta", "Singh", "Gupta", "Reddy", "Kumar", "Chopra", "Desai",
               "Agarwal", "Pandey", "Iyer", "Rao", "Mishra", "Jain", "Joshi", "Nair", "Shah", "Chaudhary",
               "Rana", "Chatterjee", "Bhatt", "Kapoor", "Pillai", "Sen", "Ghosh", "Bansal", "Dutta", "Malhotra"
       };

       return firstNames[random.nextInt(30)] + " " + surnames[random.nextInt(30)];
   }

   public String RandomPlanet(Random random){
       String[] planets = {
               "Mercury", "Venus", "Earth", "Mars", "Jupiter"
       };

       return planets[random.nextInt(5)];
   }

    public String RandomSkin(Random random){
        String[] skinTones = {
                "Fair", "Wheatish", "Dusky", "Dark"
        };

        return skinTones[random.nextInt(4)];
    }

}