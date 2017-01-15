package com.pfariasmunoz.firsthibernateproj;

import com.pfariasmunoz.firsthibernateproj.dto.FourWheeler;
import com.pfariasmunoz.firsthibernateproj.dto.TwoWheeler;
import com.pfariasmunoz.firsthibernateproj.dto.Vehicle;
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
            
            Query query = session.createQuery("from UserDetails where userId > 5");
            List users = query.list();
            System.out.println("Size of list result = " + users.size());

            tx.commit();
        }       
    }
    
}
