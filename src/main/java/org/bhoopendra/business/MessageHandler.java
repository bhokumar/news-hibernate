package org.bhoopendra.business;

import java.util.List;

import org.bhoopendra.dao.MessageDAO;
import org.bhoopendra.dao.hibernate.MessageDAOImpl;
import org.bhoopendra.hibernate.beans.Message;

public class MessageHandler {
	private static MessageDAO messageDAO = new MessageDAOImpl();

	public List<Message> getAllMessages() {
		return messageDAO.getAllMeessages();
	}
	
	public void  saveMessage(final Message message) {
		messageDAO.saveMessage(message);
	}
}
