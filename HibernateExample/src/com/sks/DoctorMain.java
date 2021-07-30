package com.sks;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DoctorMain {
	
	
	public static void main(String[] args) {
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
        
		
		
		SessionFactory factory = meta.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction t1 = session.beginTransaction();
		
		Doctor doc1 = new Doctor(101, "Akash", "Dermatology");
		
		//session.delete(doc1);
		session.save(doc1);
		t1.commit();
		
		System.out.println("Doctor object saved successfully.");
		
		session.close();
		factory.close();
		
		
	}

}
