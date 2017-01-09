package com.pfariasmunoz.firsthibernateproj;

import com.pfariasmunoz.firsthibernateproj.dto.Address;
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
        
        Address addr1 = new Address();
        addr1.setCity("Santiago");
        addr1.setPincode("222333");
        addr1.setState("Chile");
        addr1.setStreet("Cosas buenas");
        Address addr2 = new Address();
        addr1.setCity("Melipilla");
        addr1.setPincode("44488");
        addr1.setState("Chile");
        addr1.setStreet("Los jardines");
        
        user.setUserName("Pablo");
        user.setAddress(addr1);
        user2.setUserName("Cristopher");
        user2.setAddress(addr2);
        
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
