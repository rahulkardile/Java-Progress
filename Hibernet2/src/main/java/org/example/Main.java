package org.example;

import jakarta.persistence.*;
import jakarta.persistence.metamodel.Metamodel;
import org.hibernate.*;
import org.hibernate.Cache;
import org.hibernate.boot.spi.SessionFactoryOptions;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.spi.FilterDefinition;
import org.hibernate.graph.RootGraph;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.relational.SchemaManager;
import org.hibernate.stat.Statistics;

import javax.naming.NamingException;
import javax.naming.Reference;
import java.sql.Connection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void Create(Configuration con, EMP emp){
        SessionFactory sf = con.buildSessionFactory();

        Session session = sf.openSession();

        session.beginTransaction();
        session.save(emp);

        session.getTransaction().commit();
        session.close();

        System.out.println("Data inseted");
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
            session.update(emp);
            transaction.commit();

            System.out.println("Updated successfully . . . ");
        }

    }

    public static void main(String[] args) {

        EMP emp = new EMP("9","Krishna Langhe", 21000);

        try{

            Configuration con = new Configuration().configure("hibernate.cfg.xml");
//            Create(con, emp);
//            getById(con, "1");
            update(con, emp);


        }catch(Exception e){
            e.printStackTrace();
        }

    }
}