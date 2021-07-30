package com.sks.subclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DoctorTest {
	
	
	public static void main(String[] args) {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		
		Metadata meta = new MetadataSources(registry).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();  
        Session session=factory.openSession();  
          
         Transaction t=session.beginTransaction();
         
         
         Doctor d1 = new Doctor();
         d1.setName("Sachin");
         
         Cardiologist c1 = new Cardiologist();
         c1.setName("Rahul");
         c1.setSalary(200000);
         
         Physiotherepist p1 = new Physiotherepist();
         
         p1.setName("Sourav");
         p1.setPayPerHour(5000);
         
         session.persist(d1);    
         session.persist(p1);    
         session.persist(c1);    
             
         t.commit();    
         session.close();  
         factory.close();
         System.out.println("success");    
	}

}
