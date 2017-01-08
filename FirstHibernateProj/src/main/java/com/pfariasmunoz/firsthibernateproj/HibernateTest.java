package com.pfariasmunoz.firsthibernateproj;

import com.pfariasmunoz.firsthibernateproj.dto.UserDetails;
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
        user.setUserName("First User");
        
        session.save(user);
        tx.commit();
        session.close();
        
    }
    
}
