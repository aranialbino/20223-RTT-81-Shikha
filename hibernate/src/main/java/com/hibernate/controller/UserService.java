package com.hibernate.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.User;
/**
 * @author LaTonyaLewis
 */
public class UserService {
	
	public void createUserTable() {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		User uone = new User();
		t.commit();
		System.out.println("Successfully created user table");
		factory.close();
		session.close();
		
		
	}
	
	
	public void createUser() {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		User uone = new User();
		
		uone.setEmail("haseeb@gmail.com");
    	uone.setFullname("Moh Haseeb");
    	uone.setPassword("has123");
    	uone.setSalary(2000.69);
    	uone.setAge(20);
    	uone.setCity("NYC");
    	
    	User uTwo = new User();
    	uTwo.setEmail("James@gmail.com");
    	uTwo.setFullname("James Santana");
    	uTwo.setPassword("James123");
    	uTwo.setSalary(2060.69);
    	uTwo.setAge(25);
    	uTwo.setCity("Dallas");
    	
    	User uThree = new User();
    	uThree.setEmail("Shahparan@gmail.com");
    	uThree.setFullname("AH Shahparan");
    	uThree.setPassword("Shahparan123");
    	uThree.setSalary(3060.69);
    	uThree.setAge(30);
    	uThree.setCity("Chicago");
    	
  /*========= We can pass value/data by using constructor =========*/
    	User ufour = new User( "Christ", "christ@gmail.com",  "147852", 35, 35000.3,"NJ");
    	User ufive = new User("Sid", "Sid", "s258", 29, 4000.36, "LA");
    	Integer  userid = null;
    	session.save(uone); 
    	session.save(uTwo); 
    	session.save(uThree); 
    	session.save(ufour); 
    	session.save(ufive); 
    	  
        t.commit();
        System.out.println("successfully saved");   
        factory.close();  
        session.close();    

		
	}

	public void findingUser() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		int USER_ID = 2;
		User u = session.load(User.class, USER_ID);
		System.out.println("Fullname: " + u.getFullname());
		System.out.println("Email: " + u.getEmail());
		System.out.println("Password: " + u.getPassword());
		
		//Close resources
		tx.commit();
		factory.close();
		session.close();
	}
	
	public void updateUser() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		User u = new User();
		u.setId(3);
		u.setFullname("M haseeb");
		u.setEmail("mhaseeb@perscholas");
		u.setPassword("xxxx");
		
		session.merge(u);
		session.getTransaction().commit();
		session.close();
		
	}
	
	public void deleteUser() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		User u = new User();
		u.setId(3);
		session.delete(u);
		tx.commit();
		session.close();
		factory.close();
		
	}
	}


