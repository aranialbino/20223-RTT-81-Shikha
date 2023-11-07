package jpa.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory;

	public static SessionFactory getSessionFactory() {
		if (factory == null) {
			factory = new Configuration().configure().buildSessionFactory();
		}
		return factory;
	}

	public static Session getSession() {
		return getSessionFactory().openSession();
	}

	public static void closeSession(Session sesion) {
		sesion.close();
	}
}
