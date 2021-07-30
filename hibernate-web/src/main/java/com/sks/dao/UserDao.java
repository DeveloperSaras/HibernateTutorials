package com.sks.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.sks.Employee;

public class UserDao {
	
	
	public static int register(Employee emp) {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		Metadata meta = new MetadataSources(registry).getMetadataBuilder().build();
		
		SessionFactory factory = meta.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction t1 = session.beginTransaction();
		
		int result = (int)session.save(emp);
		
		t1.commit();
		
		session.close();
		factory.close();
		return result;
		
		
		
	}

}
