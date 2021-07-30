package com.sks;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {
	
	
	public static void main(String[] args) {
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		Metadata meta = new MetadataSources(registry).getMetadataBuilder().build();
		
		SessionFactory factory = meta.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction t1 = session.beginTransaction();
		
		
		Teacher tchr = new Teacher(1,"Dronacharya");
		session.save(tchr);
		
		t1.commit();
		
		System.out.println("Record saved successfully.");
		
		session.close();
		factory.close();
		
		
	}

}
