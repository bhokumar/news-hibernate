package org.bhoopendra.dao;

import java.util.List;

import org.bhoopendra.hibernate.beans.Message;

public interface MessageDAO {
	List<Message> getAllMeessages();
	Message getMessage(final int messageId);
	void saveMessage(final Message message);
}
