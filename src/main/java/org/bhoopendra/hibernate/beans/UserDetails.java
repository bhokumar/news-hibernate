package org.bhoopendra.hibernate.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int userId;
	
	@Lob
	private String description;
	public UserDetails() {
	}
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private String userName;

	@Temporal(TemporalType.DATE)
	private Date joinedDate;

	public UserDetails(String userName, Date joinedDate) {
		super();
		this.userName = userName;
		this.joinedDate = joinedDate;
	}

	
	public UserDetails(String description, String userName, Date joinedDate) {
		super();
		this.description = description;
		this.userName = userName;
		this.joinedDate = joinedDate;
	}
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", description=" + description + ", userName=" + userName
				+ ", joinedDate=" + joinedDate + "]";
	}

}
