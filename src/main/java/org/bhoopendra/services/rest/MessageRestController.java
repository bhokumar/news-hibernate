package org.bhoopendra.services.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.bhoopendra.business.MessageHandler;
import org.bhoopendra.hibernate.beans.Message;

@Path(value="/message")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MessageRestController {
	final MessageHandler messageHandler = new MessageHandler();
	@GET
	public List<Message> getAllMessagee(){
		return messageHandler.getAllMessages();
	}
	
	@POST
	public void saveMessage(final Message message) {
		messageHandler.saveMessage(message);
	}
}
