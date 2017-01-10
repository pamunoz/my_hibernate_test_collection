package com.pfariasmunoz.firsthibernateproj;

import com.pfariasmunoz.firsthibernateproj.dto.Address;
import com.pfariasmunoz.firsthibernateproj.dto.UserDetails;
import com.pfariasmunoz.firsthibernateproj.dto.Vehicle;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
    
    public static void main(String[] args) {
        
        UserDetails user = new UserDetails();       
        user.setUserName("Pablo");
        
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("Tesla Model 3");
        
        user.setVehicle(vehicle);
              
        SessionFactory sessionFactory;
        sessionFactory = new Configuration()
                .configure() // configures settings from hibernate.cfg.xml
                .buildSessionFactory();
 
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();       
        session.save(user);
        session.save(vehicle);
        tx.commit();
        session.close();       
    }
    
}
