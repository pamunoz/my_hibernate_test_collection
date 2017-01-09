package com.pfariasmunoz.firsthibernateproj;

import com.pfariasmunoz.firsthibernateproj.dto.UserDetails;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
    
    public static void main(String[] args) {
        SessionFactory sessionFactory;
        sessionFactory = new Configuration()
                .configure() // configures settings from hibernate.cfg.xml
                .buildSessionFactory();
 
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        UserDetails user = new UserDetails();
        user.setUserId(1);
        user.setUserName("Pablo");
        user.setAddress("First user adress");
        user.setJoinedDate(new Date());
        user.setDescription("description of the user goes here");

        session.save(user);
        tx.commit();
        session.close();
        user = null;
        
        session = sessionFactory.openSession();
        Transaction tx2 = session.beginTransaction(); 
        
        user = (UserDetails) session.get(UserDetails.class, 1);
        System.out.println("User Name retrieved is " + user.getUserName());
       
        
    }
    
}
