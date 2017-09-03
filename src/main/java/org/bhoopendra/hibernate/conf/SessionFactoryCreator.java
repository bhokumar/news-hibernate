package org.bhoopendra.hibernate.conf;

import java.io.IOException;

import org.bhoopendra.utils.PropertyHandler;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryCreator {
	private static SessionFactory sessionFactory = null;
	static {
		try {
			final String dbType = PropertyHandler.getPropertyValue("dataBaseType","app/app.properties");
			if ("PostGres".equals(dbType)) {
				sessionFactory = new Configuration().configure("hibernate.cfg-postgres.xml").buildSessionFactory();
			} else if ("MySQL".equals(dbType)) {
				sessionFactory = new Configuration().configure("hibernate.cfg-mysql.xml").buildSessionFactory();
			} else {
				sessionFactory = new Configuration().configure().buildSessionFactory();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private SessionFactoryCreator() {
	}

	public static SessionFactory getSessionFactoryInstance() {
		return sessionFactory;
	}
}
