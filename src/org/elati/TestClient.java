package org.elati;



import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestClient {

	public static void main(String[] args) {
		
		
		// Write the Student_Info object into the database
		

		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Address add = new Address();
		add.setStreet("tnagar");
		add.setCity("chennai");
		add.setCountry("india");
		add.setZip(700128);
		
		Address add2 = new Address();
		add2.setStreet("budvarpet");
		add2.setCity("pune");
		add2.setCountry("india");
		add2.setZip(423128);
		
		User_Details user = new User_Details();
		user.setUserName("sarvana");
		user.setDescription("Description of sarvana");
		user.setJoinedDate(new java.util.Date());
		user.getListofAddress().add(add);
		user.getListofAddress().add(add2);
		session.save(user);
		
		transaction.commit();
		session.close();
		/*user = null;
		session = sessionFactory.openSession();
		user = (User_Details) session.get(User_Details.class, 4);
		System.out.println(user.getUserId());
		System.out.println(user.getUserName());
		System.out.println(user.getAddress());
		sessionFactory.close();
		
		*/
		System.out.println("SUCCESS");
	}
}
