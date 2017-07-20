package org.bhoopendra.hibernate.news;


import java.util.Date;

import org.bhoopendra.hibernate.beans.UserDetails;
import org.bhoopendra.hibernate.conf.SessionFactoryCreator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AppClient2 {

	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionFactoryCreator.getSessionFactoryInstance();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(new UserDetails("user1", new Date(2015, 12, 11,11,23)));
		transaction.commit();
		session.close();
	}

}
