package org.example;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Alien hiberRahul = new Alien();

        hiberRahul.setAid(501);
        hiberRahul.setAname("Hibernet maven");
        hiberRahul.setAage(21);
        hiberRahul.setAcolor("Blue");
        hiberRahul.setAplanet("Marse");

        try{
            Configuration con = new Configuration().configure("hibernate.cfg.xml");

            SessionFactory sf = con.buildSessionFactory();

            Session session = sf.openSession();
            session.beginTransaction();
            session.save(hiberRahul);

            session.getTransaction().commit();
            session.close();

            System.out.println("Alien saved: " + hiberRahul.getAname());

        }catch (HibernateException e){
            e.printStackTrace();
        }

    }
}