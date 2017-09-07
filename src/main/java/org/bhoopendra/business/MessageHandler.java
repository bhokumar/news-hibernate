package org.bhoopendra.business;

import java.util.List;

import javax.inject.Inject;

import org.bhoopendra.dao.MessageDAO;
import org.bhoopendra.hibernate.beans.Message;
import org.bhoopendra.utils.CDIUTils;

public class MessageHandler {
	
	@Inject
	private static MessageDAO messageDAO;
	
	public MessageHandler() {
		CDIUTils.injectFields(this);
	}
	
	public List<Message> getAllMessages() {
		return messageDAO.getAllMeessages();
	}
	
	public void  saveMessage(final Message message) {
		messageDAO.saveMessage(message);
	}
}
