package com.test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		// insert data into database
		Student student = new Student();
		student.setName("ram");
		student.setCity("patil");
		student.setMobile("959578989");
		session.save(student);
		transaction.commit();
		session.close();
		System.out.println("Record saved successfully.");

	}
}

