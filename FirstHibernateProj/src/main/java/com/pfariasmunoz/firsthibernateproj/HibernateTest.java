package com.pfariasmunoz.firsthibernateproj;

import com.pfariasmunoz.firsthibernateproj.dto.Address;
import com.pfariasmunoz.firsthibernateproj.dto.Shoe;
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
        
        UserDetails cris = new UserDetails();
        cris.setUserName("Cristopher");
        
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("Tesla Model 3");
        
        Shoe zapatilla = new Shoe();
        zapatilla.setBrand("Nike");
        Shoe zapato = new Shoe();
        zapato.setBrand("Hush Puppies");
        
        user.getCalzado().add(zapatilla);
        user.getCalzado().add(zapato);
        zapato.setOwner(cris);
        
        user.setVehicle(vehicle);
              
        SessionFactory sessionFactory;
        sessionFactory = new Configuration()
                .configure() // configures settings from hibernate.cfg.xml
                .buildSessionFactory();
 
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(zapatilla);
            session.save(zapato);
            session.save(vehicle);
            session.save(cris);
            session.save(user);

            tx.commit();
        }       
    }
    
}
