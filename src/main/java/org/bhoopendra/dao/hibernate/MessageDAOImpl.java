package org.bhoopendra.dao.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.bhoopendra.dao.MessageDAO;
import org.bhoopendra.hibernate.beans.Message;

public class MessageDAOImpl implements MessageDAO{

	@Override
	public List<Message> getAllMeessages() {
		final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mysqldb");
		final EntityManager entityManager = entityManagerFactory.createEntityManager();
		final EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		List<Message> listOfMessages = entityManager.createQuery("select m from Message m order by m.txt asc").getResultList();
		entityTransaction.commit();
		entityManager.close();
		return listOfMessages;
	}

	@Override
	public Message getMessage(int messageId) {
		return null;
	}

	@Override
	public void saveMessage(Message message) {
		final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("entityManagerFactory");
		final EntityManager entityManager = entityManagerFactory.createEntityManager();
		final EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(message);
		entityTransaction.commit();
		entityManager.close();
	}

}
