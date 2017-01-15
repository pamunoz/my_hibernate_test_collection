package com.pfariasmunoz.firsthibernateproj;

import com.pfariasmunoz.firsthibernateproj.dto.UserDetails;
import java.util.List;
import org.hibernate.Query;
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
 
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            
            Query query = session.createQuery("select userName from UserDetails");
            // Adding pagination
            query.setFirstResult(2);
            query.setMaxResults(3);
            
            
//            List<UserDetails> users = (List<UserDetails>)query.list();
            List<String> userNames = (List<String>) query.list();
            System.out.println("Size of list result = " + userNames.size());
            
            userNames.forEach((userName) -> {
                System.out.println("User name: " + userName);
            });

            tx.commit();
        }       
    }
    
}
