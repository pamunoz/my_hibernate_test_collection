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
        
        Address addr1 = new Address();
        addr1.setCity("New Yorl");
        addr1.setPincode("111");
        addr1.setState("Chile");
        addr1.setStreet("womba womba");
        Address addr2 = new Address();
        addr2.setCity("Cartagena");
        addr2.setPincode("222");
        addr2.setState("Chile");
        addr2.setStreet("womba womba");
        Address addr3 = new Address();
        addr3.setCity("Buenos Aires");
        addr3.setPincode("333");
        addr3.setState("Chile");
        addr3.setStreet("womba womba");
        Address addr4 = new Address();
        addr4.setCity("Washington");
        addr4.setPincode("444");
        addr4.setState("E.E.U.U");
        addr4.setStreet("womba womba");
     
        user.setUserName("Pablo");
        user.getListOfAddresses().add(addr1);
        user.getListOfAddresses().add(addr2);
        user.getListOfAddresses().add(addr3);
        user.getListOfAddresses().add(addr4);
        
        SessionFactory sessionFactory;
        sessionFactory = new Configuration()
                .configure() // configures settings from hibernate.cfg.xml
                .buildSessionFactory();
 
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();       
        session.save(user);
        tx.commit();
        session.close();  
        
        user = null;
        session = sessionFactory.openSession(); 
        user = (UserDetails) session.get(UserDetails.class, 1);
        int sizeUsers = user.getListOfAddresses().size();
        System.out.println("The number of addresses is: " + sizeUsers);
    }
    
}
