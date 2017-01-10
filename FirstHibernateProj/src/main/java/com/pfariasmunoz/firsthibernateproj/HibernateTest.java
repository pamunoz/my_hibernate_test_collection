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
        
        // Creating Users
        UserDetails user = new UserDetails();       
        user.setUserName("Pablo");
        
        UserDetails cris = new UserDetails();
        cris.setUserName("Cristopher");
        
        // Creating Vehicles
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("Tesla Model 3");
        
        Vehicle vehicle2 = new Vehicle();
        vehicle2.setVehicleName("Toyota");
        
        
        //Crating Shoes
        Shoe zapatilla = new Shoe();
        zapatilla.setBrand("Nike");
        Shoe zapato = new Shoe();
        zapato.setBrand("Hush Puppies");
        
        user.getCalzado().add(zapatilla);
        user.getCalzado().add(zapato);
        zapato.setOwner(cris);
        zapatilla.setOwner(user);
        
        user.getVehicleList().add(vehicle);
        user.getVehicleList().add(vehicle2);
        cris.getVehicleList().add(vehicle);
        
        
              
        SessionFactory sessionFactory;
        sessionFactory = new Configuration()
                .configure() // configures settings from hibernate.cfg.xml
                .buildSessionFactory();
 
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            // save the shoes
            session.save(zapatilla);
            session.save(zapato);
            // save the vehicles
            session.save(vehicle);
            session.save(vehicle2);
            // save the users
            session.save(cris);
            session.save(user);

            tx.commit();
        }       
    }
    
}
