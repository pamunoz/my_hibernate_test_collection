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
            
            String minUserId = "5";
            
            
//            Query query = session.createQuery(" from UserDetails where userId > ?");
//            query.setInteger(0, Integer.parseInt(minUserId));

//            Query query = session.createQuery(" from UserDetails where userId > :userId");
//            query.setInteger("userId", Integer.parseInt(minUserId));
                
            // Add named queries
            Query query = session.getNamedQuery("UserDetails.byId");
            query.setInteger(0, 2);
            
            //Query query = session.createQuery("select userName from UserDetails");
            // Adding pagination
//            query.setFirstResult(2);
//            query.setMaxResults(3);
            
            
            List<UserDetails> users = (List<UserDetails>)query.list();
            //List<String> userNames = (List<String>) query.list();
            //System.out.println("Size of list result = " + userNames.size());
            
            //userNames.forEach((userName) -> {
                //System.out.println("User name: " + userName);
            //});
            
            users.forEach((user) -> {
                System.out.println("User name: " + user.getUserName());
            });

            tx.commit();
        }       
    }
    
}
