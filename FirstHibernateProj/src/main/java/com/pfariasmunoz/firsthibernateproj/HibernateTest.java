package com.pfariasmunoz.firsthibernateproj;

import com.pfariasmunoz.firsthibernateproj.dto.UserDetails;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
    
    public static void main(String[] args) {
        
        UserDetails user = new UserDetails();
        UserDetails user2 = new UserDetails();
        
        user.setUserName("Pablo");
        user2.setUserName("Cristopher");
        
        SessionFactory sessionFactory;
        sessionFactory = new Configuration()
                .configure() // configures settings from hibernate.cfg.xml
                .buildSessionFactory();
 
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();       
        session.save(user);
        session.save(user2);
        tx.commit();
        session.close();     
        
    }
    
}
