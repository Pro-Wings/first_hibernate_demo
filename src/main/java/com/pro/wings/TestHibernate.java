package com.pro.wings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate {
	
	public static void main(String[] args) {
		
		Student std1 = new Student();
		std1.setFirstName("Ram");
		std1.setLastName("Prabhu");
		std1.setMarks(90);
		std1.setId(10);
		
		
		Configuration configuration = new Configuration();
		
		SessionFactory factory = configuration.configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		session.save(std1);
		
		session.close();
		factory.close();
		
		
	}

}
