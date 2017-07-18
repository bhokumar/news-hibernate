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
			System.out.println(properties.get("dataBaseType"));
			if("postgres".equals(properties.get("dataBaseType"))){
			sessionFactory = new Configuration().addResource("hibernate.cfg-postgres.xml").setProperties(System.getProperties()).buildSessionFactory();
			}else if("MySQL".equals(properties.get("dataBaseType"))){
				sessionFactory = new Configuration().addResource("hibernate.cfg-mysql.xml").setProperties(System.getProperties()).buildSessionFactory();
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
