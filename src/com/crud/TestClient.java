package com.crud;



import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestClient {

	public static void main(String[] args) {
		
		
		// Write the Student_Info object into the database
		

		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Student wor = new Student();
	//	wor.setID(22);
		wor.setName("elati");
		wor.setMarks(123456);
		//wor.setDate(new java.util.Date());
		//wor.setDate(new Date());
/*
		Student wor1 = new Student();
		//wor.setID(1);
		wor1.setName("Gert");
		wor1.setMarks(500);
		wor1.setDate(new Date());*/
		// this would save the Student_Info object into the database
		session.save(wor);
	//	session.save(wor1);
		
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("SUCCESS");
	}
}
