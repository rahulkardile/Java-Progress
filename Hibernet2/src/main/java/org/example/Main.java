package org.example;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void Create(Configuration con, EMP emp) {
        // Create a session factory to manage sessions with the database
        SessionFactory sf = con.buildSessionFactory();

        // Open a session to interact with the database
        Session session = sf.openSession();

        // Start a new transaction
        session.beginTransaction();

        session.save(emp);

        // Commit the transaction to finalize the changes
        session.getTransaction().commit();

        session.close();

        System.out.println("Data inserted");
    }


    public static  void getById(Configuration con, String id){
        EMP emp = null;

        try(SessionFactory sf = con.buildSessionFactory();
            Session session = sf.openSession();){

            emp = session.get(EMP.class, id);
            if(emp != null){
                System.out.println("Retrieved Data: \nId: " + emp.getId() + "\tName: " + emp.getName() + "\tSalary: " + emp.getSalery());
            }else {
            System.out.println("No employee found with id: " + id);
        }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void update(Configuration con, EMP emp){

        try(SessionFactory sf = con.buildSessionFactory();
            Session session = sf.openSession();
        ){

            Transaction transaction = session.beginTransaction();

            // Retrieve the employee from the database
            session.update(emp);
            transaction.commit();

            System.out.println("Updated successfully . . . ");
        }

    }

    public  static void delete(Configuration con, String id){
        try(SessionFactory sf = con.buildSessionFactory();
            Session session = sf.openSession();){
            Transaction transaction = session.beginTransaction();

            EMP emp = session.get(EMP.class, id);
            if(emp != null){
                session.delete(emp);
                transaction.commit();
                System.out.println("Deleted info : " + emp.getName());
                System.out.println("Deleted successfully");
            }else {
                System.out.println("User found!");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        EMP emp = new EMP("9","Krishna Langhe", 21000);

        try{

            Configuration con = (Configuration) new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(EMP.class);

//            SessionFactory sf = con.buildSessionFactory();

//            Session session =  sf.openSession();
//
//            session.beginTransaction();
//
//            session.save(emp);
//
//            session.getTransaction().commit();

//            Create(con, emp);
            getById(con, "9");
//            update(con, emp);

//            delete(con, "9");

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
