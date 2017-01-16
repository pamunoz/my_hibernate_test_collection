package com.pfariasmunoz.firsthibernateproj;

import com.pfariasmunoz.firsthibernateproj.dto.UserDetails;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class HibernateTest {
    
    public static void main(String[] args) {
        
        SessionFactory sessionFactory;
        sessionFactory = new Configuration()
                .configure() // configures settings from hibernate.cfg.xml
                .buildSessionFactory();
 
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
//            
//            Criteria criteria = session.createCriteria(UserDetails.class);
//            criteria.add(Restrictions.eq("userName", "User 10"))
//                    .add(Restrictions.gt("UserId", 5));

            // Add query by example
            UserDetails exampleUser = new UserDetails();
            exampleUser.setUserId(22);
            exampleUser.setUserName("example User 22");
            
            Example example = Example.create(exampleUser).enableLike(); 
            
            // Some projections with example
            Criteria criteria = session.createCriteria(UserDetails.class)
                   .add(example);
            
//            // Some projections
//            Criteria criteria = session.createCriteria(UserDetails.class)
//                    .setProjection(Projections.max("UserId"))
//                    .setProjection(Projections.count("UserId"))
//                    .addOrder(Order.desc("UserId"));
            
           
            
            
            List<UserDetails> users = (List<UserDetails>) criteria.list();
            tx.commit();
            
            for (UserDetails user : users) {
                System.out.println("User Name: " + user.getUserName());
            }
        }  
    }
    
}
