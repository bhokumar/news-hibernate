package org.bhoopendra.hibernate.conf;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryCreator {
	private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	private SessionFactoryCreator() {
	}

	public static SessionFactory getSessionFactoryInstance() {
		return sessionFactory;
	}
}
