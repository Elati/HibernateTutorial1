package org.elati;



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
		
		User_Details user = new User_Details();
		user.setUserName("mapram");
		
		Vechile vec = new Vechile();
		vec.setVechilleName("HeroHonda");
		
		user.setVechile(vec);

		session.save(user);
		session.save(vec);
		transaction.commit();
		session.close();
		System.out.println("------------------------------");
	
		sessionFactory.close();
		
		
		System.out.println("SUCCESS");
	}
}
