package org.bhoopendra.hibernate.conf;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryCreator {
	private static SessionFactory sessionFactory = null;
	static {
		try {
			final String propertyFileName = "app.properties";
			final InputStream stream = new FileInputStream(propertyFileName);
			Properties properties = new Properties();
			properties.load(stream);
			if("postgres".equals(properties.get("dataBaseType"))){
			sessionFactory = new Configuration().configure("hibernate.cfg-postgres.xml").buildSessionFactory();
			}else if("MySQL".equals(properties.get("dataBaseType"))){
				sessionFactory = new Configuration().configure("hibernate.cfg-mysql.xml").buildSessionFactory();
			}else{
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
	
	public static void main(String[] args) {
		
	}
}
