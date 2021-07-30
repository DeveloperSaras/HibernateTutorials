package com.sks;

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
		
		SessionFactory factory = meta.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction t1 = session.beginTransaction();
		
		
		Doctor d1 = new Doctor(100, "Sanjay");
		Cardiologist c1 = new Cardiologist(101, "Rajeev", 200000);
		Physiotherepist p1 = new Physiotherepist(102,"Dinesh", 1000);
		
		session.save(d1);
		session.save(c1);
		session.save(p1);
		
		t1.commit();
		session.close();
		factory.close();
		
		System.out.println("Data saved successfully.");
		
		
	}

}
