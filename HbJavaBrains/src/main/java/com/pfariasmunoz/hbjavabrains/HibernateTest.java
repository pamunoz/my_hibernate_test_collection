package com.pfariasmunoz.hbjavabrains;

import com.pfariasmunoz.hbjavabrains.dto.UserDetails;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author pablo
 */
public class HibernateTest {
    
    public static void main(String[] args) {
        UserDetails userDetails = new UserDetails();
        userDetails.setUserId(1);
        userDetails.setUserName("First User");
        
    }
    
    protected void setUp() throws Exception {
        // A sessionFactory is set up once for an application
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder =
                new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        SessionFactory factory = configuration
                .buildSessionFactory(builder.build());
    }
    
}
