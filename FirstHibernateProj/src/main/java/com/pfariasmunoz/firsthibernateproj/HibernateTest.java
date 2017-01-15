package com.pfariasmunoz.firsthibernateproj;

import com.pfariasmunoz.firsthibernateproj.dto.Address;
import com.pfariasmunoz.firsthibernateproj.dto.FourWheeler;
import com.pfariasmunoz.firsthibernateproj.dto.Shoe;
import com.pfariasmunoz.firsthibernateproj.dto.TwoWheeler;
import com.pfariasmunoz.firsthibernateproj.dto.UserDetails;
import com.pfariasmunoz.firsthibernateproj.dto.Vehicle;
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
 
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            
            // CREATE operation
//            for (int i = 1; i <= 10; i++) {
//                UserDetails user = new UserDetails();
//                user.setUserName("User " + i);
//                session.save(user);
//            }
             
            // READ operation: fetching the element with id = 6 from UserDetail table
            
//            UserDetails user =  session.get(UserDetails.class, 6);
//            System.out.println("User name pulled up is: " + user.getUserName());
            
            // DELETE operation
            UserDetails user =  session.get(UserDetails.class, 6);
            session.delete(user);
            
            tx.commit();
        }       
    }
    
}
