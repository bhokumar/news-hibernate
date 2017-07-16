package org.bhoopendra.hibernate.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name = "MESSAGES")
public class Message {
	@Column(name= "MESSAGE_ID")
	@GeneratedValue
	private Long Id;
	@Column(name="MESSAGE_TEXT")
	private String text;
	
	private Message nextMessage;
	public Message() {
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
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
