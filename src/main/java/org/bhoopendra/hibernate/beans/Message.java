package org.bhoopendra.hibernate.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MESSAGES")
public class Message {
	@javax.persistence.Id
	@GeneratedValue
	@Column(name="MESSAGE_ID")
	private long id;
	
	@Column(name="MESSAGE_TEXT")
	private String text;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="NEXT_MESSAGING_ID")
	private Message nextMessage;
	public Message() {
	}
	
	
	public Message(long id, String text, Message nextMessage) {
		super();
		this.id = id;
		this.text = text;
		this.nextMessage = nextMessage;
	}


	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Message getNextMessage() {
		return nextMessage;
	}
	public void setNextMessage(Message nextMessage) {
		this.nextMessage = nextMessage;
	}
	
	
	
}
